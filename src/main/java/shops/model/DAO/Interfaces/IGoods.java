package shops.model.DAO.Interfaces;

import shops.model.entities.Good;

/**
 * Created by root on 26.04.15.
 */
public interface IGoods {
    public void addGood(Good good);
    public void removeGood(Good good);
    public void updateGood(Good good);
}
