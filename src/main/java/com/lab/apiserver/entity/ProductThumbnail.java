package com.lab.apiserver.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by jdw37 on 2017-08-05.
 */
@Data
@Entity
@EqualsAndHashCode(exclude="product")
public class ProductThumbnail {
    @Id
    Long id;
    String createdAt;
    String updatedAt;
    String filename;
    String thumbnail;

    @OneToOne(mappedBy = "productThumbnail")
    Product product;

    public ProductThumbnail(){}

}
