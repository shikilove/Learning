package design.adapter;

/**
 * Title : design.adapter <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-22 17:58
 */
public class Mobile {

    public void inputPower(V5Power power) {
        System.out.println(power.provideV5Power());
    }
}
