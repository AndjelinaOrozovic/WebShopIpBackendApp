package net.etfbl.ip.webshopbackendapp.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import net.etfbl.ip.webshopbackendapp.base.BaseEntity;

import java.util.List;


@Data
@Entity
@Table(name = "product")
public class ProductEntity implements BaseEntity<Integer> {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "short_name", nullable = false, length = 45)
    private String shortName;

    @Basic
    @Column(name = "description", nullable = false, length = 545)
    private String description;

    @Basic
    @Column(name = "price", nullable = false)
    private Integer price;

    @Basic
    @Column(name = "is_new", nullable = false)
    private Boolean isNew;

    @Basic
    @Column(name = "address", nullable = false, length = 145)
    private String address;

    @Basic
    @Column(name = "contact", nullable = false, length = 45)
    private String contact;

    @JsonManagedReference
    @OneToMany(mappedBy = "product", targetEntity = ImageEntity.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ImageEntity> images;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private List<OfferEntity> offers;

    @ManyToOne
    @JoinColumn(name = "id_category", referencedColumnName = "id", nullable = false)
    private CategoryEntity category;


}
