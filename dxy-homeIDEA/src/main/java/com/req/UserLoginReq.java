package com.req;

public class UserLoginReq {

    private String LoginName;
    private String password;

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserLoginReq{" +
                "LoginName='" + LoginName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
