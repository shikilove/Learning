package design.factory;

/**
 * Title : design.factory <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-9 11:11
 */
public class Default implements Shape {
    @Override
    public void draw() {
        System.out.println("default");
    }
}
