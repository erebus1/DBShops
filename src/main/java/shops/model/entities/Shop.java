package shops.model.entities;

import java.io.Serializable;

/**
 * Created by root on 26.04.15.
 * Shop entity
 */
public class Shop implements Serializable{
    private int posRating;
    private int negRating;
    private String address;
    private String shopName;
    private String url;
    private long id;

    public Shop(int posRating, int negRating, String address, String shopName, String url, long id) {
        this.posRating = posRating;
        this.negRating = negRating;
        this.address = address;
        this.shopName = shopName;
        this.url = url;
        this.id = id;
    }

    public Shop(){
        this.posRating = -1;
        this.negRating = -1;
        this.address = null;
        this.shopName = null;
        url = null;
        this.id = -1;
    }

    public String getUrl() {
        if (url == null) {
            throw new NonInitialisedField();
        }
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getId() {
        if (id == -1) {
            throw new NonInitialisedField();
        }
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShopName() {
        if (shopName == null) {
            throw new NonInitialisedField();
        }
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        if (address == null) {
            throw new NonInitialisedField();
        }
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNegRating() {
        if (negRating == -1) {
            throw new NonInitialisedField();
        }
        return negRating;
    }

    public void setNegRating(int negRating) {
        this.negRating = negRating;
    }

    public int getPosRating() {
        if (posRating == -1) {
            throw new NonInitialisedField();
        }
        return posRating;
    }

    public void setPosRating(int posRating) {
        this.posRating = posRating;
    }


    /**
     * increase positive rating by 1
     */
    public void incPosRating(){
        posRating++;
    }

    /**
     * increase negative rating by 1
     */
    public void incNegRating(){
        negRating++;
    }
}
