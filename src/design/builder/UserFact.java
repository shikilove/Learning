package design.builder;

/**
 * Title : design.builder <br>
 * Company : 北京华宇元典信息服务有限公司 <br>
 * Description :
 *
 * @author lizhongyang
 * @version 1.0
 * @date 2021-11-9 14:49
 */
public class UserFact {

    private final String name;

    private final String age;

    public static UserFactBuilder builder() {
        return new UserFactBuilder();
    }

    public UserFact(UserFactBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "UserFact{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static class UserFactBuilder implements Builder<UserFact> {

        private String name;

        private String age;

        private UserFactBuilder name(String name) {
            this.name = name;
            return this;
        }

        private UserFactBuilder age(String age) {
            this.age = age;
            return this;
        }

        @Override
        public UserFact build() {
            return new UserFact(this);
        }
    }

    public static void main(String[] args) {
        System.out.println(UserFact.builder().name("shiki").age("18").build());
        System.out.println(UserFact.builder().name("x").age("18x").build());
    }
}
