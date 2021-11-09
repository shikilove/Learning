package design.abstractfactory;

/**
 * Title : design.abstractfactory <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-9 13:30
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (FactoryConstant.COLOR.equalsIgnoreCase(choice)) {
            return new ColorFactory();
        } else if (FactoryConstant.SHAPE.equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        }
        return null;
    }
}
