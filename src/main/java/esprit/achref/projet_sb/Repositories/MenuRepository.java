package esprit.achref.projet_sb.Repositories;

import esprit.achref.projet_sb.Models.Menu;
import esprit.achref.projet_sb.Models.TypeMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByTypeMenuAndPrixTotalGreaterThan(TypeMenu typeMenu, Float maxPrix);

    Menu findByIdMenu(long idMenu);

}
