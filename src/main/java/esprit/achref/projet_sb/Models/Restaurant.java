package esprit.achref.projet_sb.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;
    private String nom;
    private Long nbPlacesMax;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Menu> Menus;
    @ManyToOne
    private ChaineRestauration chaineRestauration;
}
