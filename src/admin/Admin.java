package admin;

import java.util.HashMap;

public class Admin {
    HashMap<String,String> login=new HashMap<>();

    public Admin(HashMap<String, String> login) {
        this.login = login;
    }

    public HashMap<String, String> getLogin() {
        return login;
    }

    public void setLogin(HashMap<String, String> login) {
        this.login = login;
    }
}
