package esprit.achref.projet_sb.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCommande;
    @Temporal(TemporalType.DATE)
    private LocalDate dateCommande;
    private Integer pourcentageRemise;
    private Float totalRemise;
    private Float totalCommande;
    private Long note;
    @ManyToOne
    Client client;
    @ManyToOne
    Menu Menu;

}
