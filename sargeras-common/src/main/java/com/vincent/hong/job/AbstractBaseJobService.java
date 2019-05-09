package com.vincent.hong.job;

import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class AbstractBaseJobService<T>  {

    Logger logger = LoggerFactory.getLogger(AbstractBaseJobService.class);

    protected abstract  void executor();

    protected int run(List<T> list,int threadPoolSize){

        final CountDownLatch countDownLatch = new CountDownLatch(threadPoolSize);
        final AtomicInteger successNum = new AtomicInteger(0);
        final AtomicInteger pendingNum = new AtomicInteger(0);
        final AtomicInteger failNum = new AtomicInteger(0);

        List<List<T>> partLists = Lists.partition(list,list.size()/threadPoolSize);
        for (final List<T> partList: partLists){
            getThreadPoolExecutor().execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        dealData(partList, successNum, pendingNum, failNum);
                    }finally {
                        countDownLatch.countDown();
                    }
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            logger.error("跑批失败，无法统一完成且进入主线程程 .错误：{} ",e);
            Thread.currentThread().interrupt();
        }

        System.out.println(String.format("处理的总数据量为:%s ,成功数为：%s ,处理中的为：%s ，失败数为： %s",list.size(),successNum.intValue(),pendingNum.intValue(),failNum.intValue()));

        return 0;

    }

    protected abstract ExecutorService getThreadPoolExecutor();

    protected abstract int dealData(final List<T> partListData,
                                    final AtomicInteger successNum,
                                    final AtomicInteger pendingNum,
                                    final AtomicInteger failNum);
}
