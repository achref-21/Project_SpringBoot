package esprit.achref.projet_sb.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
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
