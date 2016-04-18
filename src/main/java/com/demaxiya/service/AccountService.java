package com.demaxiya.service;

import com.demaxiya.dao.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by Administrator on 2016/4/18.
 */
@Component
@Path("accounts")
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;


    @GET
    @Consumes({ "application/json; charset=UTF-8", "application/xml; charset=UTF-8" })
    @Produces({ "application/json; charset=UTF-8", "application/xml; charset=UTF-8" })
    public Response getAccounts(){
        System.out.println("测试来啦！！！！");

        return null;
    }
}
