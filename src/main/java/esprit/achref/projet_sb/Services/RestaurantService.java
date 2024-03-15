package esprit.achref.projet_sb.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import esprit.achref.projet_sb.Models.ChaineRestauration;
import esprit.achref.projet_sb.Models.Restaurant;
import esprit.achref.projet_sb.Repositories.ChaineRestaurationRepository;
import esprit.achref.projet_sb.Repositories.MenuRepository;
import esprit.achref.projet_sb.Repositories.RestaurantRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class RestaurantService implements  IRestaurantService {
    RestaurantRepository restaurantRepository;
    ChaineRestaurationRepository    chaineRestaurationRepository;
    MenuRepository menuRepository;

    @Override
    public Restaurant affecterRestaurantAChaineRestauration(String nomRestaurant, String libelleChaine) {
        ChaineRestauration chr = chaineRestaurationRepository.findByLibelle(libelleChaine);
        Restaurant restaurant = restaurantRepository.findByNom(nomRestaurant);
        restaurant.setChaineRestauration(chr);
        restaurantRepository.save(restaurant);

        return null;
    }

    @Override
    public Restaurant ajoutRestaurantEtMenuAssocies(Restaurant restaurant) {
        Restaurant restaurant1=restaurantRepository.save(restaurant);
        restaurant1.getMenus().forEach(menu ->
        {
            menu.setPrixTotal(20.00F);
            menuRepository.save(menu);
        });
        return null;
    }
}
