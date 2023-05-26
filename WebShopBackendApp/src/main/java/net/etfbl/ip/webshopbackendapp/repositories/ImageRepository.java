package net.etfbl.ip.webshopbackendapp.repositories;

import net.etfbl.ip.webshopbackendapp.models.entities.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<ImageEntity, Integer> {
}
