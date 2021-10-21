package leetcode.thred;

import java.util.concurrent.*;

/**
 * Title : leetcode.thred <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description : 多线程交替打印abc
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-21 17:20
 */
public class Print implements Runnable {

    Semaphore before;
    Semaphore after;
    String log;

    public Print(Semaphore before, Semaphore after, String log) {
        this.before = before;
        this.after = after;
        this.log = log;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                before.acquire();
                System.out.println(Thread.currentThread().getName() + log);
                after.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(0);
        Semaphore s3 = new Semaphore(0);
        ExecutorService pool = new ThreadPoolExecutor(3, 3, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100)
                , r -> new Thread(r, "Thread"));
        pool.submit(new Print(s1, s2, "我是AAA"));
        pool.submit(new Print(s2, s3, "我是BBB"));
        pool.submit(new Print(s3, s1, "我是CCC"));
    }
}


