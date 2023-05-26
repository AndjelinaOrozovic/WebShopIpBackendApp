package net.etfbl.ip.webshopbackendapp.models.dto;

import lombok.Data;

@Data
public class Category {

    private Integer id;
    private String name;
    private Boolean isDeleted;
    private Category parentCategory;

}
