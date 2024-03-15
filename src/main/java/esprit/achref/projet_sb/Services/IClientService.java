package esprit.achref.projet_sb.Services;



import esprit.achref.projet_sb.Models.Client;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface IClientService {
    List<Client> retrieveAllClients();
    Client addClient(Client e);
    Client updateClient(Client e);
    Client retrieveClient(Long idClient);
    void deleteClient(Long idClient);
    List<Client> addClients(List<Client> clients);
}
