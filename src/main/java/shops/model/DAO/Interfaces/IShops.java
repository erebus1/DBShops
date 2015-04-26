package shops.model.DAO.Interfaces;

import shops.model.entities.Shop;

/**
 * Created by root on 26.04.15.
 */
public interface IShops {

    /**
     * add new shop
     * @throws java.lang.IllegalArgumentException if some troubles with shop' fields
     * @param shop
     */
    public void addShop(Shop shop);

    /**
     * update information about shop
     * @throws java.lang.IllegalArgumentException if some troubles with ahops' fields
     * @throws java.util.NoSuchElementException if no such shop
     * @param shop
     */
    public void updateShop(Shop shop);

    /**
     * remove shop by id and all shop's subscriptions
     * @throws java.lang.IllegalArgumentException if some troubles with shop' fields
     * @param id    shop id
     */
    public void removeShop(int id);
}
