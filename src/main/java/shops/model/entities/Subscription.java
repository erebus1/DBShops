package shops.model.entities;

import java.io.Serializable;

/**
 * Created by root on 26.04.15.
 * SubscriptionEntity
 */
public class Subscription implements Serializable{
    private int shopId;
    private int goodId;
    private int clientId;


    public Subscription(int shopId, int goodId, int clientId) {
        this.shopId = shopId;
        this.goodId = goodId;
        this.clientId = clientId;
    }

    public Subscription() {
        this.shopId = -1;
        this.goodId = -1;
        this.clientId = -1;
    }


    public int getShopId() {
        if (shopId == -1) {
            throw new NonInitialisedField();
        }
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public int getGoodId() {
        if (goodId == -1) {
            throw new NonInitialisedField();
        }
        return goodId;
    }

    public void setGoodId(int goodId) {
        this.goodId = goodId;
    }

    public int getClientId() {
        if (clientId == -1) {
            throw new NonInitialisedField();
        }
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}
