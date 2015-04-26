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

        openSqlConnection();
    }



    public static Sql getInstance(){
        if (instance == null){
            instance = new Sql();
        }
        return instance;

    }

    /**
     * Open SQL Connection
     * @parameter user - login
     * @parameter password - password
     * @parameter url - url to connect to
     * @return a connection if all is ok, or null if smth wrong
     */
    public Connection openSqlConnection(){

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

    /**
     * close connection
     */
    public String closeSqlConnection(){

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

    /**
     * close connection to db on destructor
     * @throws IOException
     */
    protected void finalize() throws IOException {
        closeSqlConnection();

    }


}
