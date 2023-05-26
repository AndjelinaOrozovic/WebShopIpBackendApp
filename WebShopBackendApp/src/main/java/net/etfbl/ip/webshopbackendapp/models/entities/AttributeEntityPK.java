package net.etfbl.ip.webshopbackendapp.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.*;

import java.io.Serializable;

@Data
public class AttributeEntityPK implements Serializable {

    @Column(name = "id", nullable = false)
    @Id
    private Integer id;

    @Column(name = "id_category", nullable = false)
    @Id
    private Integer idCategory;

}
