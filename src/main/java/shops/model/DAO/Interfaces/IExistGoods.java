package shops.model.DAO.Interfaces;

import shops.model.entities.ExistGood;

/**
 * Created by root on 26.04.15.
 */
public interface IExistGoods {
    public void addExistGood(ExistGood existGood);
    public void updateExistGood(ExistGood existGood);
    public void removeExistGood(ExistGood existGood);
}
