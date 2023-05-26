package net.etfbl.ip.webshopbackendapp.models.dto;

import lombok.Data;

@Data
public class Comment {

    private Integer id;
    private String content;
    private String dateAndTime;
    private Offer offer;
    private User userAccount;

}
