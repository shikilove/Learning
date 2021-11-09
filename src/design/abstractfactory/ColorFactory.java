package design.abstractfactory;

/**
 * Title : design.abstractfactory <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-9 11:25
 */
public class ColorFactory extends AbstractFactory{

    @Override
    Color getColor(String type) {
        if (FactoryConstant.RED.equalsIgnoreCase(type)) {
            return new Red();
        } else if (FactoryConstant.BLUE.equalsIgnoreCase(type)) {
            return new Blue();
        } else if (FactoryConstant.GREEN.equalsIgnoreCase(type)) {
            return new Green();
        } else {
            return new DefaultColor();
        }
    }

    @Override
    Shape getShape(String type) {
        return null;
    }
}
