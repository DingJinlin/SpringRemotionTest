package com.cjm.webservice.hessian;

import com.cjm.webservice.hessian.model.HessianModel;

/**
 * User: Ding
 * Date: 13-7-19
 * Time: обнГ11:45
 */
public interface HessianService {
    public String sayHello(String username);
    public HessianModel getHessianModel(String username, String password);
}
