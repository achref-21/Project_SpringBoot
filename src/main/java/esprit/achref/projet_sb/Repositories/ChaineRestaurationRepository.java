package esprit.achref.projet_sb.Repositories;

import esprit.achref.projet_sb.Models.ChaineRestauration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ChaineRestaurationRepository extends CrudRepository<ChaineRestauration,Long> {
    ChaineRestauration  findByLibelle(String libelle);

}
