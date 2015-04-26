package shops.model.DAO.Interfaces;

import shops.model.entities.Category;

/**
 * Created by root on 26.04.15.
 */
public interface ICategories {
    public void addCategory(Category category);
    public void updateCategory(Category category);
    public void removeCategory(Category category);
}
