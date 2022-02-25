package design.decorator;

/**
 * Title : design.decorator <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-24 16:58
 */
public class ArmEquip implements IEquip {

    @Override
    public int attack() {
        return 5;
    }

    @Override
    public String desc() {
        return "护手";
    }
}
