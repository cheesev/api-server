package com.lab.apiserver.repository;

import com.lab.apiserver.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    @Query(value = "select distinct p from Product p inner join fetch p.brand inner join fetch p.productThumbnail where p.name = :name")
    Product findByName(@Param("name") String name);

    @Query(value = "select distinct p from Product p inner join fetch p.brand inner join fetch p.productThumbnail where p.name like %:name%")
    List<Product> findByNameContaining(@Param("name") String name);

    @Query(value = "select distinct p from Product p inner join fetch p.brand inner join fetch p.productThumbnail where p.store = :store")
    List<Product> findByStore(@Param("store") String store);

    @Query(value = "select distinct p from Product p inner join fetch p.brand inner join fetch p.productThumbnail where p.price between :strtPrice and :endPrice")
    List<Product> findByPriceBetween(@Param("strtPrice") int strtPrice, @Param("endPrice") int endPrice);

    @Query(value = "select distinct p from Product p inner join fetch p.brand inner join fetch p.productThumbnail where p.discountPrice between :strtPrice and :endPrice")
    List<Product> findByDiscountPriceBetween(@Param("strtPrice") int strtPrice, @Param("endPrice") int endPrice);
}
