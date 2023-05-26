package net.etfbl.ip.webshopbackendapp.models.entities;

import jakarta.persistence.*;
import lombok.*;
import net.etfbl.ip.webshopbackendapp.base.BaseEntity;


@Data
@Entity
@Table(name = "user_account")
public class UserAccountEntity implements BaseEntity<Integer> {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;

    @Basic
    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;

    @Basic
    @Column(name = "username", nullable = false, length = 45)
    private String username;

    @Basic
    @Column(name = "password", nullable = false, length = 45)
    private String password;

    @Basic
    @Column(name = "city", nullable = false, length = 45)
    private String city;

    @Basic
    @Column(name = "mail", nullable = false, length = 45)
    private String mail;

    @Basic
    @Column(name = "pin", nullable = false, length = 4)
    private String pin;

    @Basic
    @Column(name = "is_activated", nullable = false)
    private Boolean isActivated;

    @Basic
    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted;

    @Basic
    @Column(name = "avatar", length = 545)
    private String avatar;

}
