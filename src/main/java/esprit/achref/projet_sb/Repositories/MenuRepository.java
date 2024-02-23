package esprit.achref.projet_sb.Repositories;

import esprit.achref.projet_sb.Models.Menu;
import esprit.achref.projet_sb.Models.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, Float maxPrix);

}
