package esprit.achref.projet_sb.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Composant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idComposant;
    private String nomComposant;
    private float prix;

    @ManyToOne
    private Menu Menu;

    @OneToOne
    private DetailComposant DetailComposant;
}
