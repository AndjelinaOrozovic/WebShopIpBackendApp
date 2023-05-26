package net.etfbl.ip.webshopbackendapp.repositories;

import net.etfbl.ip.webshopbackendapp.exceptions.NotFoundException;
import net.etfbl.ip.webshopbackendapp.models.entities.UserAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Integer> {

    Boolean existsByUsername(String username);

    Optional<UserAccountEntity> findByUsername(String username) throws NotFoundException;

    Boolean existsByUsernameAndIdNot(String username, Integer id);

}
