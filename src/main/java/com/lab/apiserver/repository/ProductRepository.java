package com.lab.apiserver.repository;

import com.lab.apiserver.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by jdw37 on 2017-08-05.
 */
@RepositoryRestResource
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    Product findByName(@Param("name") String name);
    List<Product> findByNameContaining(@Param("name") String name);
    List<Product> findByStore(@Param("store") String store);
    List<Product> findByPriceBetween(@Param("strtPrice") int strtPrice, @Param("endPrice") int endPrice);
    List<Product> findByDiscountPriceBetween(@Param("strtPrice") int strtPrice, @Param("endPrice") int endPrice);
}
