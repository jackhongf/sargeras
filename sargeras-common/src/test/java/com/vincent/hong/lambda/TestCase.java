/**
 * Copyright (C), 2018-2018, from  vincent hong
 * FileName: Test
 * Author:   vincent hong
 * Date:     2018/11/15 10:25
 * Description: lambda表达式单元测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.vincent.hong.lambda;


import com.vincent.hong.entity.dto.Customer;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * 〈一句话功能简述〉<br>
 * 〈lambda表达式单元测试〉
 *
 * @author vincent hong
 * @date: 2018/11/15 10:25
 * @since 1.0.0
 */
public class TestCase {
    CountDownLatch cdl= new CountDownLatch(10);

    @Test
    public void testNoReturn() {
        BigDecimal param = new BigDecimal("233");

        String value = test((BigDecimal x) -> {
            return "xxxx" + x.toString();
        }, param);
        System.out.println(value
        );


    }

    private String test(LambdaService service, BigDecimal param) {
        try {
            cdl.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return service.doService(param);

    }


    @Test
    public void testCollections(){
        List<Customer> lsit =  new ArrayList<>();
        makeList(lsit);
//        lsit.stream().forEach((Customers cust)->{cust.setId(cust.getId()+cust.getId());});
        System.out.println(lsit.toString());


    }
    @Test
    public void testCase(){

        File file = new File("c:/test.txt");
        try {
            OutputStream fos = new FileOutputStream(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("你是一个大笨蛋, 哈哈哈哈   Hello world ...");

    }


    private void makeList(List<Customer> lsit){
        for(int i=0;i<10; i++){
            Customer cust = new Customer();
            lsit.add(cust);
        }
    }



}
