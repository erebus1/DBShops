package shops.model.DAO;

import shops.model.DAO.Interfaces.IClients;
import shops.model.entities.Client;

/**
 * Created by root on 26.04.15.
 */
public class Clients extends Sql implements IClients{

    @Override
    public void addClient(Client client) {

    }

    @Override
    public void updateClient(Client client) {

    }

    @Override
    public boolean isActiveClient(int id) {
        return false;
    }

    @Override
    public boolean isActiveClient(String username) {
        return false;
    }

    @Override
    public void ActivateClient(String username) {

    }

    @Override
    public void disActivateUser(String username) {

    }

    @Override
    public boolean hasUsername(String username) {
        return false;
    }

    @Override
    public boolean hasEmail(String email) {
        return false;
    }

    @Override
    public void removeClient(String username) {

    }
}
