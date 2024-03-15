package esprit.achref.projet_sb.Services;


import esprit.achref.projet_sb.Models.ChefCuisinier;
import esprit.achref.projet_sb.Models.Menu;
import esprit.achref.projet_sb.Repositories.ChefCuisinierRepository;
import esprit.achref.projet_sb.Repositories.MenuRepository;

import java.util.Set;


public class ChefCuisinierService implements IChefCuisinierService{
    ChefCuisinierRepository chefCuisinierRepository;
    MenuRepository menuRepository;

    @Override
    public ChefCuisinier affecterChefCuisinierAMenu(Long idChefCuisinier, Long idMenu) {
        ChefCuisinier chefCuisinier = chefCuisinierRepository.findByIdChefCuisinier(idChefCuisinier);
        Menu menu = menuRepository.findByIdMenu(idMenu);
        Set<Menu> menus = chefCuisinier.getMenus();
        menus.add(menu);
        chefCuisinier.setMenus(menus);
        chefCuisinierRepository.save(chefCuisinier);

        return null;
    }

    @Override
    public ChefCuisinier desaffecterChefCuisinierDuMenu(Long idMenu, Long idChef) {
        ChefCuisinier chefCuisinier = chefCuisinierRepository.findByIdChefCuisinier(idChef);
        Menu menu = menuRepository.findByIdMenu(idMenu);
        Set<Menu> menus = chefCuisinier.getMenus();
        menus.remove(menu);
        chefCuisinier.setMenus(menus);
        chefCuisinierRepository.save(chefCuisinier);

        return null;
    }
}
