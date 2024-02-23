package esprit.achref.projet_sb.Repositories;

import esprit.achref.projet_sb.Models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant,Long> {
  //List<Restaurant> findDisByNbPlacesMaxIsGreaterThanAndChaineRestauration_DateCreation_YearLessThan(Long nbPlaces, int year);


}
