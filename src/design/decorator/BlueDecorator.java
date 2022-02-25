package design.decorator;

/**
 * Title : design.decorator <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-24 17:00
 */
public class BlueDecorator implements IEquipDecorator {

    private IEquip equip;

    public BlueDecorator(IEquip equip) {
        this.equip = equip;
    }

    @Override
    public int attack() {
        return equip.attack() + 5;
    }

    @Override
    public String desc() {
        return equip.desc() + "蓝宝石";
    }
}
