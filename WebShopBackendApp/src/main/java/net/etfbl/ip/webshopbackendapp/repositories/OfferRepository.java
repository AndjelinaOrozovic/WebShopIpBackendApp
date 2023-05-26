package net.etfbl.ip.webshopbackendapp.repositories;
import net.etfbl.ip.webshopbackendapp.models.entities.OfferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OfferRepository extends JpaRepository<OfferEntity, Integer> {

    OfferEntity searchById(Integer id);

    @Query("SELECT o FROM OfferEntity  o WHERE o.product.shortName LIKE CONCAT('%', :name ,'%')")
    List<OfferEntity> selectByProductName(String name);

    @Query("SELECT o FROM OfferEntity o WHERE o.product.category.id=:id")
    List<OfferEntity> selectByProductCategoryId(Integer id);

    @Query("SELECT o FROM OfferEntity o WHERE o.userAccount.id=:id AND o.isDeleted=false")
    List<OfferEntity> selectByUserId(Integer id);

    @Query("SELECT o FROM OfferEntity o WHERE o.isActive=true AND o.isDeleted=false")
    List<OfferEntity> selectActiveOffers();

    @Query("SELECT o FROM OfferEntity o WHERE o.product.category.id=:id AND o.product.shortName LIKE CONCAT('%', :name ,'%')")
    List<OfferEntity> selectByProductNameAndCategoryId(String name, Integer id);

}
