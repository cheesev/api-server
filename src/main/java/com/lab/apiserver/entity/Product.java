package com.lab.apiserver.entity;


import lombok.Data;

import javax.persistence.*;

/**
 * Created by jdw37 on 2017-08-05.
 */
@Data
@Entity
public class Product {
    @Id @GeneratedValue
    Long id;
    String createdAt;
    String updatedAt;
    String name;
    String storeUrl;
    Long contractorId;
    String shopProdId;

    @OneToOne
    @JoinColumn(name = "image_id")
    ProductThumbnail productThumbnail;

    @ManyToOne // Lazy 쓰면 안되네.
    @JoinColumn(name = "brand_id")
    Brand brand;

    String color;
    String store;
    int price;
    int discountPrice;

    public Product() {}

}
