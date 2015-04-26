package shops.model.DAO.Interfaces;

import java.sql.ResultSet;

/**
 * Created by root on 26.04.15.
 * class that contain run method which work with resultSet
 */
public interface IHandler {
    public void handle(ResultSet resultSet);
}
