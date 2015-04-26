package shops.model.entities;

import java.io.Serializable;

/**
 * Created by root on 26.04.15.
 * entity of Good
 */
public class Good implements Serializable {
    private int id;
    private int categoryId;
    private int manufacturerId;
    private int posRating;
    private int negRating;
    private String goodName;


    public Good(int id, int categoryId, int manufacturerId, int posRating, int negRating, String name) {
        this.id = id;
        this.categoryId = categoryId;
        this.manufacturerId = manufacturerId;
        this.posRating = posRating;
        this.negRating = negRating;
        this.goodName = name;
    }

    public Good() {
        this.id = -1;
        this.categoryId = -1;
        this.manufacturerId = -1;
        this.posRating = -1;
        this.negRating = -1;
        this.goodName = null;
    }

    public int getId() {
        if (id == -1) {
            throw new NonInitialisedField();
        }
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        if (categoryId == -1) {
            throw new NonInitialisedField();
        }
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getManufacturerId() {
        if (manufacturerId == -1) {
            throw new NonInitialisedField();
        }
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
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

    public int getNegRating() {
        if (negRating == -1) {
            throw new NonInitialisedField();
        }
        return negRating;
    }

    public void setNegRating(int negRating) {
        this.negRating = negRating;
    }

    public String getGoodName() {
        if (goodName == null) {
            throw new NonInitialisedField();
        }
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }
}
