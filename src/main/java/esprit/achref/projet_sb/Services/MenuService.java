package esprit.achref.projet_sb.Services;

import esprit.achref.projet_sb.Models.Menu;
import esprit.achref.projet_sb.Models.TypeMenu;
import esprit.achref.projet_sb.Repositories.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class MenuService implements IMenuService{
    MenuRepository menuRepository;


    @Override
    public List<Menu> findMenu(TypeMenu typeMenu, float prix) {
        return menuRepository.findByTypeMenuAndPrixTotalGreaterThan(typeMenu,prix);
    }
}
