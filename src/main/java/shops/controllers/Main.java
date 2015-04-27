package shops.controllers;

import shops.model.DAO.Clients;
import shops.model.DAO.Sql;
import shops.model.DAO.Subscriptions;
import shops.model.entities.Client;
import shops.model.entities.Good;

import java.util.ArrayList;

/**
 * Created by root on 26.04.15.
 */
class Main{
    public static void main(String[] args) {
        Client client = new Client("user5","passd","my e-mail5", 1, false);
        Clients clients = Clients.getInstance();
        clients.addClient(client);
        clients.activateClient("user3");
        System.out.println(clients.hasUsername("user35"));

        ArrayList<Good> goods = Subscriptions.getInstance().getSubscriptionsOfClientFromShop("admin2","silpo");
        for (Good good: goods){
            System.out.println(good.getGoodName());
        }

        Sql.getInstance().closeSqlConnection();
    }
}