package com.cjm.webservice.hessian;

import com.cjm.webservice.hessian.model.HessianModel;

/**
 * User: Ding
 * Date: 13-7-19
 * Time: обнГ11:49
 */
public class HessianServiceImpl implements HessianService {
    @Override
    public String sayHello(String username) {
        return "Hello " + username;
    }

    @Override
    public HessianModel getHessianModel(String username, String password) {
        return new HessianModel(username, password);
    }
}
