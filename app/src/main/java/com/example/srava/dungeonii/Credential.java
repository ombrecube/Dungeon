package com.example.srava.dungeonii;

/**
 * Created by massj on 15/03/2016.
 */
public class Credential {

    public String username;
    public String password;
    public int idProfil;

    public Credential() {
    }

    public Credential(int IDProfil)
    {
        this.idProfil = IDProfil;
    }

    public Credential(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Credential{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}