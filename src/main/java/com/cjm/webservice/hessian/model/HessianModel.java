package com.cjm.webservice.hessian.model;

import java.io.Serializable;

/**
 * User: Ding
 * Date: 13-7-19
 * Time: ÏÂÎç11:46
 */
public class HessianModel implements Serializable {
    private String username;
    private String password;

    public HessianModel() {
    }

    public HessianModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
