package com.lab.apiserver.entity;

import lombok.Data;

import javax.persistence.*;

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

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "image_id")
    ProductThumbnail productThumbnail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    Brand brand;

    String color;
    String store;
    int price;
    int discountPrice;

    public Product() {}

}
