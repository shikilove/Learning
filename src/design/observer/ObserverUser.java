package design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Title : design.observer <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2022-2-22 17:12
 */
public class ObserverUser implements Observer {

    public void registerSubject(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectFor3d) {
            SubjectFor3d subjectFor3d = (SubjectFor3d) o;
            System.out.println("3D =>" + subjectFor3d.getMsg());
        }
        if (o instanceof SubjectFor7c){
            SubjectFor7c subjectFor7c = (SubjectFor7c) o;
            System.out.println("7C =>" + subjectFor7c.getMsg());
        }
    }
}
