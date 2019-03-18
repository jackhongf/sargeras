/**
 * Copyright (C), 2018-2018, from  vincent hong
 * FileName: LamdaThread
 * Author:   vincent hong
 * Date:     2018/11/15 9:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.vincent.hong.threadbean;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author vincent hong 
 * @date: 2018/11/15 9:21
 * @since 1.0.0
 */
public class LamdaThread implements  Runnable{
    @Override
    public void run() {
        for (int i= 0 ; i<100; i++){
            System.out.println("test:"+i);
        }
    }
    public static void main(String [] args){
        Thread  thread = new Thread(new LamdaThread());

        Thread  threadR = new Thread(() -> System.out.println("test:"));



    }
}
