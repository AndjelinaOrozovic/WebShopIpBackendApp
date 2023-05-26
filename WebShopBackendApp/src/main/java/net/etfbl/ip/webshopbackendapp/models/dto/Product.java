package net.etfbl.ip.webshopbackendapp.models.dto;

import lombok.Data;

import java.util.List;

@Data
public class Product {

    private Integer id;
    private String shortName;
    private String description;
    private Integer price;
    private Boolean isNew;
    private String address;
    private String contact;
    private List<Image> images;
    private Category category;

}
