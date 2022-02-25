package design.observer;

/**
 * Title : design.observer <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-22 17:15
 */
public class Test {

    public static void main(String[] args) {
        SubjectFor3d subjectFor3d = new SubjectFor3d();
        SubjectFor7c subjectFor7c = new SubjectFor7c();
        ObserverUser user = new ObserverUser();
        user.registerSubject(subjectFor3d);
        user.registerSubject(subjectFor7c);

        subjectFor3d.setMsg("3D彩票 3，6，9");
        subjectFor7c.setMsg("七星彩 1，2，3，4，5，6，7");
    }
}
