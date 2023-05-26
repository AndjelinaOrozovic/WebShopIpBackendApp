package net.etfbl.ip.webshopbackendapp.models.entities;

import jakarta.persistence.*;
import lombok.*;
import net.etfbl.ip.webshopbackendapp.base.BaseEntity;


@Data
@Entity
@Table(name = "log")
public class LogEntity implements BaseEntity<Integer> {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "content", nullable = false, length = 245)
    private String content;

    @Basic
    @Column(name = "date_and_time", nullable = false, length = 45)
    private String dateAndTime;

    public LogEntity(Integer id, String content, String dateAndTime) {

        this.id = id;
        this.content = content;
        this.dateAndTime = dateAndTime;

    }

    public LogEntity() {

    }
}
