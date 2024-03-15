package esprit.achref.projet_sb.Controllers;

import esprit.achref.projet_sb.Models.Menu;
import esprit.achref.projet_sb.Models.TypeMenu;
import esprit.achref.projet_sb.Services.IMenuService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.lang.reflect.Type;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/menu")
public class MenuRestController {
    IMenuService menuService;
    //http://localhost:8089/menu/menu/retrieve-menu
@GetMapping("/retrieve-menu/{type}/{prix}")
    public List<Menu> FindMenu(@PathVariable("type") TypeMenu type, @PathVariable("prix") float prix){
    List<Menu> listMenus= menuService.findMenu(type,prix);
    return listMenus;
}

}
