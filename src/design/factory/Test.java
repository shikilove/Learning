package design.factory;

/**
 * Title : design.factory <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description : 工厂模式 测试类
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-9 11:14
 */
public class Test {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape("circle").draw();
        factory.getShape("rectangle").draw();
        factory.getShape("square").draw();
    }
}
