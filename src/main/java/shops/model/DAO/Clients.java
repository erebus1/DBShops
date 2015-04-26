package shops.model.DAO;

import shops.model.DAO.Interfaces.IClients;
import shops.model.entities.Client;
import shops.model.entities.NonInitialisedField;

import java.sql.Statement;

/**
 * Created by root on 26.04.15.
 */
public class Clients implements IClients{
    private static Clients instance = null;
    private Clients(){
    }

    public static Clients getInstance(){
        if (instance == null){
            instance = new Clients();
        }
        return instance;
    }

    @Override
    public void addClient(Client client) {


        StringBuilder query = new StringBuilder("INSERT INTO clients (username, passhash, email, active) VALUES");
        try {
            query.append("(");
            query.append("'"+client.getUsername()+"'");
            query.append(", ");
            query.append("'"+client.getPasshash()+"'");
            query.append(", ");
            query.append("'"+client.getEmail()+"'");
            query.append(", ");
            query.append(client.getActive());
            query.append(");");
        }
        catch (NonInitialisedField e){
            throw new IllegalArgumentException();
        }


        String queryS = new String(query);
        try{
            Statement st = Sql.getInstance().connection.createStatement();
            st.executeUpdate(queryS);
            st.close();  // close transaction
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


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
