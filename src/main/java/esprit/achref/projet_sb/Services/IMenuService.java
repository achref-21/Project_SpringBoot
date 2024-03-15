package esprit.achref.projet_sb.Services;



import esprit.achref.projet_sb.Models.Menu;
import esprit.achref.projet_sb.Models.TypeMenu;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IMenuService {
    public List<Menu> findMenu(TypeMenu typeMenu, float prix);
}
