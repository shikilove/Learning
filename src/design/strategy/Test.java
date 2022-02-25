package design.strategy;

/**
 * Title : design.strategy <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-22 17:47
 */
public class Test {

    public static void main(String[] args) {
        Operation operation = new OperationAdd();
        System.out.println(operation.getResult(1, 2));
    }
}
