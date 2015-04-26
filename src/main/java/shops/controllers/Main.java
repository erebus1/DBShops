package shops.controllers;

import shops.model.DAO.Clients;
import shops.model.DAO.Sql;
import shops.model.entities.Client;

/**
 * Created by root on 26.04.15.
 */
class Main{
    public static void main(String[] args) {
        Client client = new Client("user3","passd","my e-mail3", 1, false);
        Clients clients = Clients.getInstance();
//        clients.addClient(client);
//        clients.activateClient("user3");
        System.out.println(clients.hasUsername("user35"));

        Sql.getInstance().closeSqlConnection();
    }
}