
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ID와 비밀번호를 저장할 HashMap 생성
        HashMap<String, String> users = new HashMap<>();

        // ID와 비밀번호 저장
        users.put("myId", "myPass");
        users.put("myId2", "myPass2");
        users.put("myId3", "myPass3");

        while (true) {
            System.out.println("id와 password를 입력해주세요.");

            // ID 입력 및 앞뒤 공백 제거
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            // 입력한 ID가 존재하는지 확인
            if (!users.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                System.out.println();
                continue;
            }

            // 비밀번호 입력 및 앞뒤 공백 제거
            System.out.print("password : ");
            String password = sc.nextLine().trim();

            // 저장된 비밀번호와 입력한 비밀번호 비교
            if (users.get(id).equals(password)) {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            } else {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                System.out.println();
            }
        }

        sc.close();
    }
}
