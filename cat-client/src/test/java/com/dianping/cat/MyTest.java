package com.dianping.cat;

import com.dianping.cat.Cat;
import com.dianping.cat.message.Transaction;
import org.junit.Test;


/**
 * @author xiezhenwei
 * @date 2019/9/14
 */
public class MyTest {
    @Test
    public void test() {
        //静态方法获取Transaction对象
        Transaction t = Cat.newTransaction("logTransaction", "logTransaction");

        Transaction t2 = Cat.newTransaction("logTransaction2", "logTransaction2");

        Cat.logEvent("test", "test");
        sleep(1000);

        t2.setStatus("0");
        t2.complete();

        t.setStatus("0");
        t.complete();
    }


    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

