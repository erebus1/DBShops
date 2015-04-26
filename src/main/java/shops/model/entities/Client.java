package shops.model.entities;

import java.io.Serializable;

/**
 * Created by root on 26.04.15.
 * Client entinty
 */
public class Client implements Serializable{
    private String passhash;
    private String username;
    private String email;
    private int id;
    private Boolean active;

    public Client(String username, String passhash, String email, int id, Boolean active) {
        this.passhash = passhash;
        this.username = username;
        this.email = email;
        this.id = id;
        this.active = active;
    }

    public Client(){
        this.passhash = null;
        this.username = null;
        this.email = null;
        this.id = -1;
        this.active = null;
    }


    public String getPasshash() {
        if (passhash == null) {
            throw new NonInitialisedField();
        }
        return passhash;
    }

    public void setPasshash(String passhash) {
        this.passhash = passhash;
    }

    public String getUsername() {
        if (username == null) {
            throw new NonInitialisedField();
        }
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        if (email == null) {
            throw new NonInitialisedField();
        }
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Boolean getActive() {
        if (active == null) {
            throw new NonInitialisedField();
        }
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
