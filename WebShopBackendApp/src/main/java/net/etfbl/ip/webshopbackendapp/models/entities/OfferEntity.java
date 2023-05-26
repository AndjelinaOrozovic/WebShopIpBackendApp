package net.etfbl.ip.webshopbackendapp.models.entities;

import jakarta.persistence.*;
import lombok.*;
import net.etfbl.ip.webshopbackendapp.base.BaseEntity;


@Data
@Entity
@Table(name = "offer")
public class OfferEntity implements BaseEntity<Integer> {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @Basic
    @Column(name = "is_deleted", nullable = false)
    private Boolean isDeleted;

    @Basic
    @Column(name = "date_and_time", nullable = false, length = 45)
    private String dateAndTime;

    @ManyToOne
    @JoinColumn(name = "id_product", referencedColumnName = "id", nullable = false)
    private ProductEntity product;

    @ManyToOne
    @JoinColumn(name = "id_user_account", referencedColumnName = "id", nullable = false)
    private UserAccountEntity userAccount;

}
