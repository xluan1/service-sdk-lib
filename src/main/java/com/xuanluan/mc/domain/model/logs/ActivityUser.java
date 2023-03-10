package com.xuanluan.mc.domain.model.logs;

public class ActivityUser {
    private String userId;
    private String userName;
    private String email;
    private String phone;

    public ActivityUser() {
    }

    public ActivityUser(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public ActivityUser(String userId, String userName, String email, String phone) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.phone = phone;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
