package net.etfbl.ip.webshopbackendapp.models.dto;

import lombok.Data;

@Data
public class Message {

    private Integer id;
    private String content;
    private Boolean isRead;
    private String dateAndTime;
    private User idUserAccount;

}
