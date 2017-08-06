package com.lab.apiserver.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
public class ProductThumbnail {
    @Id
    Long id;
    String createdAt;
    String updatedAt;
    String filename;
    String thumbnail;


    @OneToOne(mappedBy = "productThumbnail", fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    Product product;

    public ProductThumbnail(){}

}
