package com.vincent.hong.controller;

import com.google.common.collect.Maps;
import com.vincent.hong.entity.dto.Customer;
import com.vincent.hong.repositories.dao.Customer1Dao;
import com.vincent.hong.repositories.jpa.Customer1Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * Created by vincent.hong on 2018/1/28.
 */
@RestController
@RequestMapping(value="/test")
public class TestController {
    @Autowired
    private Customer1Dao customer1Dao;

    @Autowired
    private Customer1Repository customer1Repository;

    @RequestMapping("/getStr")
    public String getStr(){


        return "wefwqefqwefw";
    }

    @RequestMapping("/mybatis")
    public List<Customer> findAllCusByMybatis(){
        Map<String,Object> param =Maps.newHashMap();
         List<Customer> list = customer1Dao.selectAllCustomer(param);
        return list;
    }

    @RequestMapping("/jpa")
    public List<Customer> findAllCusByJpa(){
        Map<String,Object> param =Maps.newHashMap();
        List<Customer> list = customer1Repository.findAll();
        return list;
    }


}
