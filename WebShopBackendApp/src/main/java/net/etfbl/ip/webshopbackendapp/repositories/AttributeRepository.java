package net.etfbl.ip.webshopbackendapp.repositories;

import net.etfbl.ip.webshopbackendapp.models.entities.AttributeEntity;
import net.etfbl.ip.webshopbackendapp.models.entities.AttributeEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttributeRepository extends JpaRepository<AttributeEntity, AttributeEntityPK> {

    List<AttributeEntity> findByIdCategory(Integer idCategory);

}
