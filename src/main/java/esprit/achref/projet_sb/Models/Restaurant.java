package esprit.achref.projet_sb.Models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRestaurant;
    private String nom;
    private Long nbPlacesMax;
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Menu> Menus;
    @ManyToOne
    private ChaineRestauration ChaineRestauration;
}
