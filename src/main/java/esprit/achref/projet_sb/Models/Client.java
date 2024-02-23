package esprit.achref.projet_sb.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String identifiant;
    @Temporal(TemporalType.DATE)
    private LocalDate datePremiereVisite;

    @OneToMany(cascade = CascadeType.ALL ,mappedBy="client")
    private Set<Commande> Commandes;
}
