package design.decorator;

/**
 * Title : design.decorator <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-24 17:02
 */
public class Test {

    public static void main(String[] args) {
        BlueDecorator decorator = new BlueDecorator(new BlueDecorator(new ArmEquip()));
        System.out.println(decorator.attack());
        System.out.println(decorator.desc());
    }
}
