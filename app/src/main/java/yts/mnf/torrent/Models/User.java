package yts.mnf.torrent.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class User {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("user_username")
    @Expose
    private String user_username;

    @SerializedName("user_birthdate")
    @Expose
    private Date user_birthdate;

    @SerializedName("user_email")
    @Expose
    private String user_email;

    @SerializedName("user_adresse")
    @Expose
    private String user_adresse;

    @SerializedName("password")
    @Expose
    private String password;

    @SerializedName("user_tel")
    @Expose
    private String user_tel;

    @SerializedName("user_sale")
    @Expose
    private String user_sale;

    @SerializedName("user_trade")
    @Expose
    private String user_trade;

    @SerializedName("user_image")
    @Expose
    private String user_image;

    //constructor

    public User(int id, String user_username, Date user_birthdate, String user_email, String user_adresse, String password, String user_tel, String user_sale, String user_trade, String user_image) {
        this.id = id;
        this.user_username = user_username;
        this.user_birthdate = user_birthdate;
        this.user_email = user_email;
        this.user_adresse = user_adresse;
        this.password = password;
        this.user_tel = user_tel;
        this.user_sale = user_sale;
        this.user_trade = user_trade;
        this.user_image = user_image;
    }


    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public Date getUser_birthdate() {
        return user_birthdate;
    }

    public void setUser_birthdate(Date user_birthdate) {
        this.user_birthdate = user_birthdate;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_adresse() {
        return user_adresse;
    }

    public void setUser_adresse(String user_adresse) {
        this.user_adresse = user_adresse;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_tel() {
        return user_tel;
    }

    public void setUser_tel(String user_tel) {
        this.user_tel = user_tel;
    }

    public String getUser_sale() {
        return user_sale;
    }

    public void setUser_sale(String user_sale) {
        this.user_sale = user_sale;
    }

    public String getUser_trade() {
        return user_trade;
    }

    public void setUser_trade(String user_trade) {
        this.user_trade = user_trade;
    }

    public String getUser_image() {
        return user_image;
    }

    public void setUser_image(String user_image) {
        this.user_image = user_image;
    }

    public User() {

    }

}

