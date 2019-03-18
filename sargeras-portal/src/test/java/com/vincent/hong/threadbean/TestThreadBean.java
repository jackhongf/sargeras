
package com.vincent.hong.threadbean;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;

/**
 *
 */
public class TestThreadBean implements  Runnable{

    private Integer indexNum;

    public  TestThreadBean(Integer indexNum){
        this.indexNum = indexNum;
    }
    @Override
    public void run() {
        Thread currentThread =  Thread.currentThread();
        currentThread.setPriority(Thread.MIN_PRIORITY);
         long  currentThreadId  =currentThread.getId();
        String currentThreadName=currentThread.getName();
//        try {
//            System.out.println("睡眠中");
//            TimeUnit.MILLISECONDS.sleep(1000L);
//        }catch (Exception e){
//            e.fillInStackTrace();
//        }
        System.out.println("执行次数"+indexNum+"-->当前线程号:["+currentThreadId+"],当前线程名:["+currentThreadName+"]");
    }

    public static void main(String [] args) throws Exception {
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        System.out.println(Runtime.getRuntime().maxMemory());
//        ServerSocket serverSocket = new ServerSocket();

        //socket 代码示例
//        serverSocket.bind(new InetSocketAddress("localhost",8898));
//        serverSocket.accept();
//       String str = "你好牛逼a";
//        String result =subStringByBytes(str,11,"utf-8");
//       System.out.println(result);

    }



    static void fun1(String str, int length)
            throws UnsupportedEncodingException {

        // System.out.println(str.getBytes().length);
        byte[] bt = str.getBytes("gbk");
        for (int i = 0; i < bt.length; i++) {
            // 打印出字节数组中的值，可以看出只要是汉字[采用GBK编码时占两个字节/UTF-8占3个字节]，并且为两个负整数
            // 由于字节的第一位都是1,所以它就是由负数来表示的
            System.out.println(bt[i]);
        }

        // 打印出按实际出入的字节数的所截字符串
        // System.out.println(new String(bt,0,length));

        // 判断最后一个是否为负，如果是负的则丢掉该字节
        if (bt[length] < 0) {
            System.out.println(new String(bt, 0, --length, "gbk"));
        } else {
            System.out.println(new String(bt, 0, length, "gbk"));
        }
    }

    private void  getInfo() throws IOException {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().maxMemory());
        ServerSocket serverSocket = new ServerSocket();
        System.out.println("sdfsdf");

        //socket 代码示例sd
        serverSocket.bind(new InetSocketAddress("localhost",8898));
        serverSocket.accept();

    }


}
