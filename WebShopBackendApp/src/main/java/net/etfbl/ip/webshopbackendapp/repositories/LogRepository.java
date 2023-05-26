package net.etfbl.ip.webshopbackendapp.repositories;

import net.etfbl.ip.webshopbackendapp.models.entities.LogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<LogEntity, Integer> {

}
