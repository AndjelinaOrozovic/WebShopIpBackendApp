package net.etfbl.ip.webshopbackendapp.repositories;

import net.etfbl.ip.webshopbackendapp.models.entities.AttributeValueEntity;
import net.etfbl.ip.webshopbackendapp.models.entities.AttributeValueEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttributeValueRepository extends JpaRepository<AttributeValueEntity, AttributeValueEntityPK> {

    AttributeValueEntity findByIdProductAndIdAttribute(Integer idProduct, Integer idAttribute);

}
