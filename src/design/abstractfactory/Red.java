package design.abstractfactory;

/**
 * Title : design.abstractfactory <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-9 11:24
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("红色");
    }
}
