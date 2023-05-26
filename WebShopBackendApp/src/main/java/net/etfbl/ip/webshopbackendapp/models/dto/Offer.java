package net.etfbl.ip.webshopbackendapp.models.dto;

import lombok.Data;

@Data
public class Offer {

    private Integer id;
    private Boolean isActive;
    private Boolean isDeleted;
    private String dateAndTime;
    private Product product;
    private User userAccount;

}
