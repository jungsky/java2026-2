
class Course {
    // 멤버 변수
    String code;
    String name;

    // 생성자
    Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getter 메서드
    String getCode() {
        return code;
    }

    String getName() {
        return name;
    }
}

// Course 클래스를 상속받는 OnlineCourse 클래스
class OnlineCourse extends Course {

    // 생성자
    OnlineCourse(String code, String name) {
        super(code, name);
    }

    // toString() 메서드 오버라이딩
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}

// Course 클래스를 상속받는 OfflineCourse 클래스
class OfflineCourse extends Course {

    // 생성자
    OfflineCourse(String code, String name) {
        super(code, name);
    }

    // toString() 메서드 오버라이딩
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}

// 메인 클래스
public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");

        System.out.println(course1);
        System.out.println(course2);
    }
}
