package shops.model.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by root on 26.04.15.
 * Contain connection to db
 */
public class Sql {
    protected Connection connection = null;
    private String user;
    private String password;
    private String port;
    private String url;
    private static Sql instance = null;

    private Sql(){

		/* START System INFO */
        String ip = "localhost";
        port = "3306";
        user = ConnectionInf.getUser();
        password = ConnectionInf.getPassword();
        url = "jdbc:mysql://"+ip+":"+port+"/Shops";
     	/* END Start INFO */

        loadDriver();
        openSqlConnection();
    }

    private void loadDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Sql getInstance(){
        if (instance == null){
            instance = new Sql();
        }
        return instance;

    }
    public Connection openSqlConnection(){
        /**
         * Open SQL Connection
         * @parameter user - login
         * @parameter password - password
         * @parameter url - url to connect to
         * @return a connection if all is ok, or null if smth wrong
         */
        try
        {
            connection = DriverManager.getConnection(url, user, password);

        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        return connection;
    }

    public String closeSqlConnection(){
        /**
         * close connection
         */
        try{
            if (connection !=null){
                connection.close();} //close connection
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return null;
        }
        return "OK";

    }
    protected void finalize() throws IOException {
        closeSqlConnection();

    }


}
