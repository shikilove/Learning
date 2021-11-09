package design.abstractfactory;

/**
 * Title : design.abstractfactory <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-9 13:32
 */
public class Test {

    public static void main(String[] args) {
        AbstractFactory color = FactoryProducer.getFactory("color");
        color.getColor("red").fill();
        color.getColor("blue").fill();
        color.getColor("green").fill();
        AbstractFactory shape = FactoryProducer.getFactory("shape");
        shape.getShape("rectangle").draw();
        shape.getShape("circle").draw();
        shape.getShape("Square").draw();
    }
}
