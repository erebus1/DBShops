package shops.model.DAO;

import shops.model.DAO.Interfaces.IClients;
import shops.model.DAO.Interfaces.IHandler;
import shops.model.entities.Client;
import shops.model.entities.NonInitialisedField;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by root on 26.04.15.
 */
public class Clients implements IClients{
    public static Boolean hasRow = null;
    public class HasRow implements IHandler{

        /**
         *
         * check is response set contain any rows
         * @param resultSet
         */
        @Override
        public void handle(ResultSet resultSet) {
            Clients.hasRow = null;
            try {
                if (resultSet.next()){  // if there are rows with such username
                    Clients.hasRow = true;
                }else{
                    Clients.hasRow = false;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }
    private static Clients instance = null;
    private Sql db;
    private Clients(){
        db = Sql.getInstance();
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

        db.executeUpdateQuery(new String(query));

    }

    @Override
    public void updateClient(Client client) {

    }

    @Override
    public boolean isActiveClient(String username) {
        return false;
    }

    @Override
    public void activateClient(String username) {
        StringBuilder query = new StringBuilder("UPDATE clients SET active = true " +
                "WHERE username = " + "'"+username+"'");
        db.executeUpdateQuery(new String(query));
    }

    @Override
    public void disActivateUser(String username) {


    }

    /**
     *
     * @param username
     * @return true, if db contain user with such username, else false
     */
    @Override
    public boolean hasUsername(String username) {
        StringBuilder query = new StringBuilder("Select id from clients " +
                "WHERE username = " + "'"+username+"'");

        db.executeSelectQuery(new String(query), new HasRow());
        if (hasRow == null){
            throw new RuntimeException();
        }

        return hasRow;
    }

    @Override
    public boolean hasEmail(String email) {
        StringBuilder query = new StringBuilder("Select id from clients " +
                "WHERE email = " + "'"+email+"'");

        db.executeSelectQuery(new String(query), new HasRow());
        if (hasRow == null){
            throw new RuntimeException();
        }

        return hasRow;
    }

    @Override
    public void removeClient(String username) {

    }
}
