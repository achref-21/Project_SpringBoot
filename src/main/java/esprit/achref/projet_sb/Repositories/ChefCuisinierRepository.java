package esprit.achref.projet_sb.Repositories;

import esprit.achref.projet_sb.Models.ChefCuisinier;
import esprit.achref.projet_sb.Models.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChefCuisinierRepository extends CrudRepository<ChefCuisinier,Long> {

    ChefCuisinier findByIdChefCuisinier(long idChefCuisinier) ;
}

