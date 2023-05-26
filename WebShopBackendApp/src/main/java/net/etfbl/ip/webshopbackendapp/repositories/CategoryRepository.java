package net.etfbl.ip.webshopbackendapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import net.etfbl.ip.webshopbackendapp.models.entities.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {

}
