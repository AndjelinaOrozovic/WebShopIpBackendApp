package net.etfbl.ip.webshopbackendapp.repositories;

import net.etfbl.ip.webshopbackendapp.models.entities.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepository extends JpaRepository<PurchaseEntity, Integer> {

    List<PurchaseEntity> searchByUserAccountId(Integer id);

}
