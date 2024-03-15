package esprit.achref.projet_sb.Repositories;

import esprit.achref.projet_sb.Models.Composant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ComposantRepository  extends CrudRepository<Composant,Long> {
}
