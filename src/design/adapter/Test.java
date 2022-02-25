package design.adapter;

/**
 * Title : design.adapter <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-22 18:04
 */
public class Test {
    public static void main(String[] args) {
        V220Power power = new V220Power();
        Mobile mobile = new Mobile();
        mobile.inputPower(new V5PowerAdapter(power));
    }
}
