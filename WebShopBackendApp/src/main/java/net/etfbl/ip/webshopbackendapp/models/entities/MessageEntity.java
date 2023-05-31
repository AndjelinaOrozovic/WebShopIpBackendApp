package net.etfbl.ip.webshopbackendapp.models.entities;

import jakarta.persistence.*;
import lombok.*;
import net.etfbl.ip.webshopbackendapp.base.BaseEntity;


@Data
@Entity
@Table(name = "message")
public class MessageEntity implements BaseEntity<Integer> {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "content", nullable = false, length = 1000)
    private String content;

    @Basic
    @Column(name = "is_read", nullable = false)
    private Boolean isRead;

    @Basic
    @Column(name = "date_and_time", nullable = false, length = 45)
    private String dateAndTime;

    @ManyToOne
    @JoinColumn(name = "id_user_account", referencedColumnName = "id", nullable = false)
    private UserAccountEntity idUserAccount;

}
