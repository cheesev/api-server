package com.lab.apiserver.entity;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jdw37 on 2017-08-05.
 */
@Data
@Entity
public class Brand {
    @Id
    Long brand_id;
    String createdAt;
    String updatedAt;
    String name;
    String brandMallUrl;
    String description;

    @Fetch(FetchMode.SUBSELECT)
    @OneToMany(mappedBy = "brand")
    List<Product> product = new ArrayList<>();

    public Brand() {}

}
