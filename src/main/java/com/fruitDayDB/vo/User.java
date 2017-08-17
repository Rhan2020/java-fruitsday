package com.fruitDayDB.vo;

/**
 * Created by xi on 2015/10/4.
 */
public class User {
    private int id;
    private String email;
    private String phone;
    private String pwd;
    private String uname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public User(int id, String email, String phone, String pwd, String uname) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.pwd = pwd;
        if(uname.equals("")||uname==null)
            this.uname=email;
        else
            this.uname = uname;
    }

    public User(String email, String phone, String pwd, String uname) {
        this.email = email;
        this.phone = phone;
        this.pwd = pwd;
        if(uname.equals("")||uname==null)
            this.uname=email;
        else
            this.uname = uname;
    }

    public User(int id) {
        this.id = id;
        this.email = null;
        this.phone = null;
        this.pwd = null;
        this.uname=null;
    }

    public User(String email, String phone, String pwd) {
        this.email = email;
        this.phone = phone;
        this.pwd = pwd;
        this.uname=email;

    }

    public User() {
        super();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", pwd='" + pwd + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }
}
