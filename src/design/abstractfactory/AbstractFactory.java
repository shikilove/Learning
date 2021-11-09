package design.abstractfactory;

/**
 * Title : design.abstractfactory <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-9 13:24
 */
public abstract class AbstractFactory {

    /**
     * 获取颜色
     * @param type
     * @return
     */
    abstract Color getColor(String type);

    /**
     * 获取图形
     * @param type
     * @return
     */
    abstract Shape getShape(String type);
}
