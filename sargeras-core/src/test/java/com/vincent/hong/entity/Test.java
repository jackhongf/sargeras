package com.vincent.hong.entity;

/**
 * Created by vincent.hong on 2018/4/23.
 */
public class Test extends Thread {

    private int threadId;

    public int getThreadId() {
        return threadId;
    }

    public  Test(int threadId){
        this.threadId=threadId;
    }
    public void setThreadId(int threadId) {
        this.threadId = threadId;
    }

    public static void main(String [] args){
//        long a=12;
       // byte as= 158;
        //String b= 'a';
        //char c= c;


        //        String  s1 = "ABC";
//        String s2="ABC";
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s2);

//        String  s1 = new String("ABC");
//        String s2= new String("ABC");
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s2);

        for (int i=0;i<1000000;i++){
            Test test = new Test(i);
            test.start();
        }
    }
    public void run(){
          System.out.println("start ,threadId:"+getThreadId());
          System.out.println("running,threadId:"+getThreadId());
        System.out.println("end ,threadId:"+getThreadId());

    }

    



}
