package esprit.achref.projet_sb.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMenu;
    private String libelleMenu;
    private TypeMenu typeMenu;
    private float prixTotal;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Menu")
    private Set<Commande> Commandes;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<ChefCuisinier> ChefCuisiniers;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="Menu")
    private Set<Composant> Composants;
}
