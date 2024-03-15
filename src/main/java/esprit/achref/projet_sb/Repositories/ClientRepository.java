package esprit.achref.projet_sb.Repositories;

import esprit.achref.projet_sb.Models.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository <Client,Long> {

}
