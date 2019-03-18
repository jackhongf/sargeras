/**
 * Copyright (C), 2018-2019, from  vincent hong
 * FileName: CustomerRepository
 * Author:   vincent hong
 * Date:     2019/3/16 0:51
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.vincent.hong.repositories;


import com.vincent.hong.CommonBootConfig;
import com.vincent.hong.entity.dto.Customer;
import com.vincent.hong.repositories.dao.CustomerDao;
import com.vincent.hong.repositories.jpa.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author vincent hong 
 * @date: 2019/3/16 0:51
 * @since 1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CommonBootConfig.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerDao customerDao;
    @Test
    public void testCase1(){
         List<Customer> list =customerRepository.findAll();
         for (Customer dto:list){
             System.out.println("jpa 测试数据："+dto.toString() );

         }
    }
        @Test
        public void testCase2(){
            Map<String,Object> param = new HashMap<String,Object>();
            List<Customer> list =customerDao.selectAllCustomer(param);
            for (Customer dto:list){
                System.out.println("mybatis 测试数据："+dto.toString() );
            }


    }


}
