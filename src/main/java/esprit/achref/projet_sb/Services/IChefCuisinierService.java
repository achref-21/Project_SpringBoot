package esprit.achref.projet_sb.Services;


import esprit.achref.projet_sb.Models.ChefCuisinier;

public interface IChefCuisinierService {
    ChefCuisinier affecterChefCuisinierAMenu(Long idChefCuisinier, Long idMenu);
    ChefCuisinier desaffecterChefCuisinierDuMenu(Long idMenu, Long idChef);

}
