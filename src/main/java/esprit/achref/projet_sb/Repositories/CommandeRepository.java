package esprit.achref.projet_sb.Repositories;

import esprit.achref.projet_sb.Models.Client;
import esprit.achref.projet_sb.Models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

    List<Commande> findByClient(Client client);
    List<Commande> findByDateCommandeBetweenAndClient(LocalDate Debut, LocalDate Fin, Client Client);
    List<Commande> findByDateCommandeBetweenOrderByNoteAsc(LocalDate Debut, LocalDate Fin);
}
