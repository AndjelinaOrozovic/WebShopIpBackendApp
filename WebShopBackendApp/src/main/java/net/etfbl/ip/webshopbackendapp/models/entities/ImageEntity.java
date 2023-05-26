package net.etfbl.ip.webshopbackendapp.models.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import net.etfbl.ip.webshopbackendapp.base.BaseEntity;

@Data
@Entity
@Table(name = "image")
public class ImageEntity implements BaseEntity<Integer> {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "url", nullable = false, length = 1245)
    private String url;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id_product", referencedColumnName = "id", nullable = false)
    private ProductEntity product;

}
