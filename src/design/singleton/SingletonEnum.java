package design.singleton;

/**
 * Title : design.singleton <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-9 13:49
 */
public enum SingletonEnum {
    // 单例模式
    INSTANCE;

    public void method() {
        System.out.println("单例");
    }
}
