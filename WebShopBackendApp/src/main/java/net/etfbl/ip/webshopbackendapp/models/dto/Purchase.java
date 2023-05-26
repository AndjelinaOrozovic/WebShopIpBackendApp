package net.etfbl.ip.webshopbackendapp.models.dto;

import lombok.Data;

@Data
public class Purchase {

    private Integer id;
    private String dateAndTime;
    private String cardNumber;
    private Offer offer;
    private User userAccount;

}
