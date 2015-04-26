package shops.model.entities;

import java.io.Serializable;

/**
 * Created by root on 26.04.15.
 * Manufacturer entity
 */
public class Manufacturer implements Serializable {
    private String manufacturerName;
    private int id;

    public Manufacturer(String manufacturerName, int id) {
        this.manufacturerName = manufacturerName;
        this.id = id;
    }

    public Manufacturer() {
        this.manufacturerName = null;
        this.id = -1;
    }

    public String getManufacturerName() {
        if (manufacturerName == null) {
            throw new NonInitialisedField();
        }
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
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
}
