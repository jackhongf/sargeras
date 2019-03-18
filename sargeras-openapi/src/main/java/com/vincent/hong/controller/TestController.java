package com.vincent.hong.controller;

import com.google.common.collect.Maps;
import com.vincent.hong.entity.dto.Customer;
import com.vincent.hong.repositories.dao.CustomerDao;
import com.vincent.hong.repositories.jpa.CustomerRepository;
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
    private CustomerDao customerDao;

    @Autowired
    private CustomerRepository customerRepository;

    @RequestMapping("/getStr")
    public String getStr(){


        return "wefwqefqwefw";
    }

    @RequestMapping("/mybatis")
    public List<Customer> findAllCusByMybatis(){
        Map<String,Object> param =Maps.newHashMap();
         List<Customer> list =customerDao.selectAllCustomer(param);
        return list;
    }

    @RequestMapping("/jpa")
    public List<Customer> findAllCusByJpa(){
        Map<String,Object> param =Maps.newHashMap();
        List<Customer> list =customerRepository.findAll();
        return list;
    }


}
