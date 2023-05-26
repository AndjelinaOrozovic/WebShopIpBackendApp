package net.etfbl.ip.webshopbackendapp.models.entities;

import jakarta.persistence.*;
import lombok.*;
import net.etfbl.ip.webshopbackendapp.base.BaseEntity;

@Data
@Entity
@Table(name = "purchase")
public class PurchaseEntity implements BaseEntity<Integer> {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "date_and_time", nullable = false, length = 45)
    private String dateAndTime;

    @Basic
    @Column(name = "card_number", nullable = false, length = 16)
    private String cardNumber;

    @ManyToOne
    @JoinColumn(name = "id_offer", referencedColumnName = "id", nullable = false)
    private OfferEntity offer;

    @ManyToOne
    @JoinColumn(name = "id_user_account", referencedColumnName = "id", nullable = false)
    private UserAccountEntity userAccount;

}
