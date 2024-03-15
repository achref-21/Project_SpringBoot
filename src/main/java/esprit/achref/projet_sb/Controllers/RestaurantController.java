package esprit.achref.projet_sb.Controllers;

import esprit.achref.projet_sb.Services.IRestaurantService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;


public class RestaurantController {
    IRestaurantService restaurantService;

    //http://localhost:8089/menu/restaurant/assignRestaurantToChaineRestauration
    @PutMapping("/assignRestaurantToChaineRestauration/{restaurantname}/{chainerestaurationlibelle}")
    @ResponseBody
    public void assignRestaurantToChaineRestauration(@PathVariable("restaurantname") String restaurantname,@PathVariable("chainerestaurationlibelle") String chainerestaurationlibelle){
    restaurantService.affecterRestaurantAChaineRestauration(restaurantname,chainerestaurationlibelle);
    }
}
