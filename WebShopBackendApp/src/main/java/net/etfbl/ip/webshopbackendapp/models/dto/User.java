package net.etfbl.ip.webshopbackendapp.models.dto;

import lombok.Data;

@Data
public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String city;
    private String mail;
    private String pin;
    private Boolean isActivated;
    private Boolean isDeleted;
    private String avatar;

}
