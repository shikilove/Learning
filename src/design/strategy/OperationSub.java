package design.strategy;

/**
 * Title : design.strategy <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-22 17:45
 */
public class OperationSub implements Operation {

    @Override
    public Double getResult(double d1, double d2) {
        return d1 - d2;
    }
}
