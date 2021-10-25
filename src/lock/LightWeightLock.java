package lock;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Title : leetcode.thred <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-10-25 15:45
 */
public class LightWeightLock {

    private volatile int state = 0;

    private static final int max = 5;

    private static long stateOffset;

    private Thread thread = null;

    public static Unsafe getUnsafe() {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            return (Unsafe) field.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return Unsafe.getUnsafe();
    }

    static {
        try {
            stateOffset = getUnsafe().objectFieldOffset(LightWeightLock.class.getDeclaredField("state"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public void lock() {
        AtomicInteger count = new AtomicInteger();
        Thread thread = Thread.currentThread();
        while (!getUnsafe().compareAndSwapInt(this, stateOffset, 0, 1) && count.get() < max) {
            count.incrementAndGet();
            System.out.println("自旋:" + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (count.get() < max) {
            System.out.println("获取锁成功" + thread.getName());
            this.thread = thread;
        } else {
            // 自旋失败
            thread.interrupt();
        }
    }

    public void unlock() {
        if (thread == Thread.currentThread() && getUnsafe().compareAndSwapInt(this, stateOffset, 1, 0)) {
            System.out.println("释放锁成功：" + Thread.currentThread().getName());
        }
    }

}
