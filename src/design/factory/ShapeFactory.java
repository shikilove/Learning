package design.factory;

/**
 * Title : design.factory <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-9 11:10
 */
public class ShapeFactory {

    public Shape getShape(String type) {
        if (FactoryConstant.RECTANGLE.equalsIgnoreCase(type)) {
            return new Rectangle();
        } else if (FactoryConstant.SQUARE.equalsIgnoreCase(type)) {
            return new Square();
        } else if (FactoryConstant.CIRCLE.equalsIgnoreCase(type)) {
            return new Circle();
        } else {
            return new Default();
        }
    }
}
