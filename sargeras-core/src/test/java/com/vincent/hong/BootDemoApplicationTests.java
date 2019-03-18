package com.vincent.hong;

import com.vincent.hong.threadbean.TestThreadBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootDemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("TESTSSSS");
    }

    @Test
    public void testSingleThreadExecutor() {
        /*SingleThreadExecutor :提交多个任务, 那么这些任务会排队进行, 所有的线程会使用同一个线程号
         * 线程会阻塞执行
		 * 应用场景: 起线程处理文件, 可用这个线程池技术
		 *
		 */

        Executor threadExecutor = Executors.newSingleThreadExecutor();
        Thread currentThread = Thread.currentThread();
        long currentThreadId = currentThread.getId();
        String currentThreadName = currentThread.getName();
        System.out.println("*****************线程池启动开始*****************-->当前线程号:[" + currentThreadId + "],当前线程名:[" + currentThreadName + "]");
        for (int i = 0; i < 100; i++) {
            threadExecutor.execute(new TestThreadBean(i));
        }
        System.out.println("*****************线程池启动结束*****************-->当前线程号:[" + currentThreadId + "],当前线程名:[" + currentThreadName + "]");
    }

    @Test
    public void testCachedThreadPool() {
        //CachedThreadPool 创建所需线程相同的线程, 然后在它回收线程时,停止创建线程.
        Executor threadExecutor = Executors.newCachedThreadPool();
        System.out.println("*****************线程池启动开始*****************");

        for (int i = 0; i < 1000; i++) {
            threadExecutor.execute(new TestThreadBean(i));
        }
        System.out.println("*****************线程池启动结束*****************");
    }

    @Test
    public void  testFixThreadPool(){
        //预先分配固定量的线程资源
        ExecutorService threadExecutor =Executors.newFixedThreadPool(6);
        for (int i = 0; i<1000;i++){
            threadExecutor.execute(new TestThreadBean(i));
        }

    }

    public  static  void  main(String[] args){
        ExecutorService threadExecutor =Executors.newFixedThreadPool(6);
        System.out.println("*****************线程池启动开始*****************");

        for (int i = 0; i < 1000; i++) {
            threadExecutor.execute(new TestThreadBean(i));
        }
        System.out.println("*****************线程池启动结束*****************");

    }


}
