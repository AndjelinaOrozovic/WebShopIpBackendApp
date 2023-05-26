package net.etfbl.ip.webshopbackendapp.repositories;

import net.etfbl.ip.webshopbackendapp.models.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import net.etfbl.ip.webshopbackendapp.models.dto.AttributeValue;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    @Query("SELECT new net.etfbl.ip.webshopbackendapp.models.dto.AttributeValue(v.idProduct, a.id, a.name, v.value) FROM AttributeEntity a INNER JOIN AttributeValueEntity v ON a.id=v.idAttribute WHERE v.idProduct=:id")
    List<AttributeValue> getAttributesAndValues(Integer id);

}
