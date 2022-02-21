package leetcode.thred;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Title : leetcode.thred <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description : 多线程交替打印abc
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-21 17:20
 */
public class Print2 implements Runnable {

    Semaphore before;
    Semaphore after;
    int n;

    public Print2(Semaphore before, Semaphore after, int n) {
        this.before = before;
        this.after = after;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                before.acquire();
                System.out.println(Thread.currentThread().getName() + "===>" + (i * 2 + n));
                after.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);
        AtomicInteger integer = new AtomicInteger(1);
        ExecutorService pool = new ThreadPoolExecutor(3, 3, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100)
                , r -> new Thread(r, "Thread" + integer.getAndIncrement()));
        pool.submit(new Print2(s1, s2, 1));
        pool.submit(new Print2(s2, s1, 2));
        pool.shutdown();
    }
}


