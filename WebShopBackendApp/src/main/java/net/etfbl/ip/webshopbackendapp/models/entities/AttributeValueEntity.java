package net.etfbl.ip.webshopbackendapp.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "attribute_value")
@IdClass(AttributeValueEntityPK.class)
public class AttributeValueEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_attribute", nullable = false)
    private Integer idAttribute;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_attribute_category", nullable = false)
    private Integer idAttributeCategory;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_product", nullable = false)
    private Integer idProduct;

    @Basic
    @Column(name = "value", nullable = false)
    private String value;

}
