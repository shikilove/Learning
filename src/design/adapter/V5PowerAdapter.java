package design.adapter;

/**
 * Title : design.adapter <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-22 18:03
 */
public class V5PowerAdapter implements V5Power{

    private V220Power power;

    public V5PowerAdapter(V220Power power){
        this.power = power;
    }

    @Override
    public int provideV5Power() {
        power.provide220Power();
        return 5;
    }

}
