package design.singleton;

/**
 * Title : design.singleton <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-9 13:51
 */
public class Test {
    public static void main(String[] args) {
        SingletonEnum.INSTANCE.method();
        Singleton.getSingleton().method();
    }
}
