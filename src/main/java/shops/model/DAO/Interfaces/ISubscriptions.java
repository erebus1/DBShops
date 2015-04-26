package shops.model.DAO.Interfaces;

import shops.model.entities.Good;
import shops.model.entities.Shop;
import shops.model.entities.Subscription;

import java.util.ArrayList;

/**
 * Created by root on 26.04.15.
 */
public interface ISubscriptions {
    /**
     * return subscriptions of user
     * @param username
     * @throws java.util.NoSuchElementException if no such user
     * @return array list of subscriptons
     */
    public ArrayList<ISubscriptions> getSubscriptionOfClient(String username);

    /**
     *
     * @param good
     * @throws java.util.NoSuchElementException if no such good
     * @return array list of all subscriptions on this good
     */
    public ArrayList<ISubscriptions> getSubscriptionsOfGood(Good good);

    /**
     * @throws java.util.NoSuchElementException if no such shop
     * @param shop
     * @return array list of all subscriptions on this shop
     */
    public ArrayList<Subscription> getSubscriptionsOfShop(Shop shop);

    /**
     * remove subscriptions from list
     * @param subscriptions
     */
    public void removeSubscriptions(ArrayList<Subscription> subscriptions);

}
