package esprit.achref.projet_sb.Models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class ChefCuisinier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChefCuisinier;
    private String nom;
    private String prenom;
    private TypeChef TypeChef;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "ChefCuisiniers")
    private Set<Menu> Menus;
}
