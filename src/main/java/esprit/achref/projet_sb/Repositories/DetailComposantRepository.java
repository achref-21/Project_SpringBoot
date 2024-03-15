package esprit.achref.projet_sb.Repositories;

import esprit.achref.projet_sb.Models.DetailComposant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailComposantRepository extends CrudRepository<DetailComposant,Long> {
}
