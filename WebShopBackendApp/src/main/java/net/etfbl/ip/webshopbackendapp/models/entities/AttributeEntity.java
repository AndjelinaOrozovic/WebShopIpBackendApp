package net.etfbl.ip.webshopbackendapp.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@IdClass(AttributeEntityPK.class)
@Table(name = "attribute")
public class AttributeEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_category", nullable = false, insertable = false, updatable = false)
    private Integer idCategory;

    @Basic
    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Basic
    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted;

}
