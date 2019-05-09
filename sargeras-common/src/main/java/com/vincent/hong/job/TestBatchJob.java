package com.vincent.hong.job;

import com.vincent.hong.ThreadPoolExecutorUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class TestBatchJob extends  AbstractBaseJobService<User> {


    @Override
    protected void executor() {
        List<User> list = new ArrayList<>();
        for (int i=0;i<10000;i++){
            User user = new User();
            user.setName("user"+i);
            user.setAge(i);
            user.setAddress("address:"+i);
            list.add(user);
        }
        run(list,5);



    }

    @Override
    protected ExecutorService getThreadPoolExecutor() {
        return ThreadPoolExecutorUtil.instance();
    }

    @Override
    protected int dealData(List<User> partListData, AtomicInteger successNum, AtomicInteger pendingNum, AtomicInteger failNum) {
        Thread  currentThread =  Thread.currentThread();
        String  threadName = currentThread.getName();
        long  threadId = currentThread.getId();
        for (int i =0; i<partListData.size();i++){
              User user = partListData.get(i);
              int age  = user.getAge();

             if (age%10 ==0){
                 pendingNum.getAndIncrement();
                 System.out.println(threadName+"["+threadId+"] pendingNum"+ pendingNum.intValue());
             }else if (age%3 ==0){
                 failNum.getAndIncrement();
                 System.out.println(threadName+"["+threadId+"] failNum"+ failNum.intValue());
             }else{
                 successNum.getAndIncrement();
                 System.out.println(threadName+"["+threadId+"] successNum"+ successNum.intValue());

             }
        }

        return 0;
    }

    public static void main (String[]args){
        TestBatchJob job = new TestBatchJob();
        job.executor();
    }

}
