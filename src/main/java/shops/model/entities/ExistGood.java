package shops.model.entities;

import java.io.Serializable;

/**
 * Created by root on 26.04.15.
 * ExistGood entity
 */
public class ExistGood implements Serializable {
    private int shopId;
    private int goodId;
    private long qty;
    private float price;

    public ExistGood(int shopId, int goodId, long qty, float price) {
        this.shopId = shopId;
        this.goodId = goodId;
        this.qty = qty;
        this.price = price;
    }
    public ExistGood(){
        this.shopId = -1;
        this.goodId = -1;
        this.qty = -1;
        this.price = -1;
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

    public long getQty() {
        if (qty == -1) {
            throw new NonInitialisedField();
        }
        return qty;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }

    public float getPrice() {
        if (price == -1) {
            throw new NonInitialisedField();
        }
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
