package shops.model.DAO.Interfaces;

import shops.model.entities.Client;

/**
 * Created by root on 26.04.15.
 */
public interface IClients {

    /**
     * add new client in db
     * @throws java.lang.IllegalArgumentException if some fields in clients weren't initialised or have wrong format
     * @param client
     */
    public void addClient(Client client);

    /**
     * update client information
     * @throws java.lang.IllegalArgumentException if some params has wrong formats
     * @throws java.util.NoSuchElementException if no user with such id
     * @param client
     */
    public void updateClient(Client client);

    /**
     *
     * @param id id of client
     * @throws java.util.NoSuchElementException if no user with such id
     * @return true if active, else false.
     */
    public boolean isActiveClient(int id);

    /**
     *
     * @param username username of client
     * @throws java.util.NoSuchElementException if no user with such username
     * @return true if active, else false.
     */
    public boolean isActiveClient(String username);

    /**
     * activate client by username
     * @throws java.util.NoSuchElementException if no user with such username
     * @param username
     */
    public void activateClient(String username);

    /**
     * make user not active
     * @throws java.util.NoSuchElementException if no user with such username
     * @param username
     */
    public void disActivateUser(String username);


    /**
     *
     * @param username
     * @return true if such username already exist else false
     */
    public boolean hasUsername(String username);


    /**
     *
     * @param email
     * @return true if such email already exist, else false
     */
    public boolean hasEmail(String email);

    /**
     *
     * remove user with such username and all user's subscriptions
     * @throws java.lang.IllegalArgumentException if some troubles with Client' fields     *
     * @param username
     */
    public void removeClient(String username);
}
