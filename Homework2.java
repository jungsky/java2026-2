import java.util.Scanner;

// 학생 정보를 저장하는 클래스
class Student {
    // 멤버 변수
    private int studentId;     // 학번
    private String name;       // 이름
    private String major;      // 전공
    private long phoneNumber;  // 전화번호 (맨 앞 0을 제외하고 숫자로 저장)

    // 학번 getter
    public int getStudentId() {
        return studentId;
    }

    // 학번 setter
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // 이름 getter
    public String getName() {
        return name;
    }

    // 이름 setter
    public void setName(String name) {
        this.name = name;
    }

    // 전공 getter
    public String getMajor() {
        return major;
    }

    // 전공 setter
    public void setMajor(String major) {
        this.major = major;
    }

    // 전화번호 getter
    public long getPhoneNumber() {
        return phoneNumber;
    }

    // 전화번호 setter
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


// 메인 클래스
public class Homework2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 학생 3명의 정보를 저장할 배열
        Student[] students = new Student[3];

        // 학생 정보 입력
        for (int i = 0; i < students.length; i++) {

            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            // 공백을 기준으로 각각 입력
            String studentId = scanner.next();
            String name = scanner.next();
            String major = scanner.next();
            String phone = scanner.next();

            // Student 객체 생성
            students[i] = new Student();

            // 학번은 문자열 → 정수로 변환
            students[i].setStudentId(Integer.parseInt(studentId));

            // 이름과 전공 저장
            students[i].setName(name);
            students[i].setMajor(major);

            // 전화번호에 '-'가 들어온 경우 제거
            phone = phone.replace("-", "");

            // 전화번호를 숫자로 변환하면 앞의 0은 자동으로 제거됨
            students[i].setPhoneNumber(Long.parseLong(phone));
        }


        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");

        // 입력된 학생 정보 출력
        for (int i = 0; i < students.length; i++) {

            // 숫자로 저장되어 있는 전화번호를 문자열로 변환
            String phone = Long.toString(students[i].getPhoneNumber());

            // 앞에 삭제되었던 0 복구
            phone = "0" + phone;

            // 010-xxxx-xxxx 형태로 변경
            phone = phone.substring(0, 3)
                    + "-"
                    + phone.substring(3, 7)
                    + "-"
                    + phone.substring(7);

            System.out.println(
                    (i + 1) + "번째 학생: "
                    + students[i].getStudentId() + " "
                    + students[i].getName() + " "
                    + students[i].getMajor() + " "
                    + phone
            );
        }

        scanner.close();
    }
}