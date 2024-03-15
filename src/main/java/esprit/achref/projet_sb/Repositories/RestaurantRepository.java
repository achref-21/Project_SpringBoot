package esprit.achref.projet_sb.Repositories;

import esprit.achref.projet_sb.Models.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RestaurantRepository extends CrudRepository<Restaurant,Long> {
    List<Restaurant> findByNbPlacesMaxGreaterThanAndChaineRestaurationDateCreationLessThan(Long capacity, LocalDate date);
    Restaurant  findByNom(String nom);
}
