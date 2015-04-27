package shops.model.DAO;

import shops.model.DAO.Interfaces.IHandler;
import shops.model.DAO.Interfaces.ISubscriptions;
import shops.model.entities.Good;
import shops.model.entities.Shop;
import shops.model.entities.Subscription;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by root on 27.04.15.
 */
public class Subscriptions implements ISubscriptions{
    public static ArrayList<Good> goods = null;
    public class GetGoods implements IHandler{

        @Override
        public void handle(ResultSet resultSet) {
            Subscriptions.goods = new ArrayList<Good>();
            try {
                while (resultSet.next()){
                    Good good = new Good();
                    good.setGoodName(resultSet.getString("good_name"));
                    good.setCategoryId(resultSet.getInt("category_id"));
                    good.setId(resultSet.getInt("id"));
                    good.setNegRating(resultSet.getInt("rating_neg"));
                    good.setPosRating(resultSet.getInt("rating_pos"));
                    good.setManufacturerId(resultSet.getInt("manufacturer_id"));
                    Subscriptions.goods.add(good);

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
    private static Subscriptions instance = null;
    private Sql db = null;

    private Subscriptions(){
        db = Sql.getInstance();

    }

    public static Subscriptions getInstance(){
        if (instance == null){
            instance = new Subscriptions();
        }
        return instance;
    }
    @Override
    public ArrayList<Subscription> getSubscriptionOfClient(String username) {
        return null;
    }

    @Override
    public ArrayList<Subscription> getSubscriptionsOfGood(Good good) {
        return null;
    }

    @Override
    public ArrayList<Subscription> getSubscriptionsOfShop(Shop shop) {
        return null;
    }

    @Override
    public void removeSubscriptions(ArrayList<Subscription> subscriptions) {

    }

    @Override
    public ArrayList<Good> getSubscriptionsOfClientFromShop(String username, String shopName) {
        String query = new String("select goods.* from (select good_id from subscriptions \n" +
                "    join \n" +
                "  (select id from shops where shop_name='"+shopName+"') as shops \n" +
                "    on subscriptions.shop_id = shops.id\n" +
                "    join \n" +
                "  (select id from clients where username='"+username+"') as user\n" +
                "    on subscriptions.client_id = user.id) as goodId \n" +
                "    join \n" +
                "  goods \n" +
                "    on goods.id = goodId.good_id;");

        db.executeSelectQuery(query, new GetGoods());
        if (goods == null){
            throw new RuntimeException();
        }

        return goods;
    }
}
