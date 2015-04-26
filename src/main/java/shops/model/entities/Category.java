package shops.model.entities;

import java.io.Serializable;

/**
 * Created by root on 26.04.15.
 * Category entity
 */
public class Category implements Serializable{
    private String categoryName;
    private int id;
    private long level;
    private int parentId;

    public Category(String categoryName, int id, long level, int parentId) {
        this.categoryName = categoryName;
        this.id = id;
        this.level = level;
        this.parentId = parentId;
    }
    public Category(){
        this.categoryName = null;
        this.id = -1;
        this.level = -1;
        this.parentId = -1;
    }

    /**
     *
     * @return category name
     * @throws NonInitialisedField if field wasn't initialised
     */
    public String getCategoryName() {
        if (categoryName == null) {
            throw new NonInitialisedField();
        }

        return categoryName;

    }


    /**
     *
     * @param categoryName category name
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


    /**
     *
     * @return id of category
     * @throws NonInitialisedField if field wasn't initialized
     */
    public int getId() {
        if (id == -1){
            throw new NonInitialisedField();
        }
        return id;
    }


    /**
     *
     * @param id id of category
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * @throws NonInitialisedField if field wasn't initialized
     * @return level of category (top level = 0)
     */
    public long getLevel() {
        if (level == -1){
            throw new NonInitialisedField();
        }
        return level;
    }


    /**
     *
     * @param level level of category
     */
    public void setLevel(long level) {
        this.level = level;
    }


    /**
     *
     * @throws NonInitialisedField if field wasn't initialized
     * @return parent id
     */
    public int getParentId() {
        if (parentId == -1){
            throw new NonInitialisedField();
        }
        return parentId;
    }

    /**
     *
     * @param parentId parent id
     */
    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}
