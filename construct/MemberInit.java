package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(MemberInit this, String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
