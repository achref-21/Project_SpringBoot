package esprit.achref.projet_sb.Services;


import esprit.achref.projet_sb.Models.Restaurant;

public interface IRestaurantService {
    Restaurant affecterRestaurantAChaineRestauration(String nomRestaurant, String libelleChaine );
    Restaurant ajoutRestaurantEtMenuAssocies(Restaurant restaurant);

}
