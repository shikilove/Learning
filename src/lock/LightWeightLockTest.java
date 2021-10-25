package lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Title : PACKAGE_NAME <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-25 16:13
 */
public class LightWeightLockTest {

    public static void main(String[] args) {
        AtomicInteger integer = new AtomicInteger();
        ExecutorService pool = new ThreadPoolExecutor(2, 2,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(), r -> new Thread(r, "light-weight-lock-->" + integer.incrementAndGet()));
        LightWeightLock lock = new LightWeightLock();
        pool.submit(new LightWeightRunnable(lock));
        pool.submit(new LightWeightRunnable(lock));
        pool.shutdown();
    }

    static class LightWeightRunnable implements Runnable {

        private final LightWeightLock lock;

        public LightWeightRunnable(LightWeightLock lock) {
            this.lock = lock;
        }

        @Override
        public void run() {
            lock.lock();
            try {
                Thread.sleep(1000);
                System.out.println("++++++++++++++++++++++++++");
                lock.unlock();
            } catch (InterruptedException e) {
                System.out.println("线程中止");
            }
        }
    }
}
