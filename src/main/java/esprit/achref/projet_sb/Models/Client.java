package esprit.achref.projet_sb.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String identifiant;
    @Temporal(TemporalType.DATE)
    private LocalDate datePremiereVisite;

}
