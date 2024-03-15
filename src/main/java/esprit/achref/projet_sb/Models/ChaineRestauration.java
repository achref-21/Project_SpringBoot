package esprit.achref.projet_sb.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.time.LocalDate;
import java.util.Set;


@Entity
@Getter
@Setter
public class ChaineRestauration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChaineRestauration ;
    private String libelle;
    @Temporal(TemporalType.DATE)
    private LocalDate dateCreation;
    @OneToMany(cascade=CascadeType.ALL, mappedBy = "chaineRestauration")
    private Set<Restaurant> Restaurants;



}
