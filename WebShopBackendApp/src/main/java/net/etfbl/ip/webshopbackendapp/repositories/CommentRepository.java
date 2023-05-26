package net.etfbl.ip.webshopbackendapp.repositories;

import net.etfbl.ip.webshopbackendapp.models.entities.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity, Integer> {

    List<CommentEntity> findByOfferId(Integer id);

}
