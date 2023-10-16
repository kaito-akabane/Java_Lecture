package L231016.Task;

import java.util.Iterator;
import java.util.LinkedList;

class Student { // 학생 클래스
    // 객체 멤버 선언
    int stuNum;
    String name, phone;
    
    // 생성자
    public Student(int stuNum, String name, String field) {
        this.stuNum = stuNum;
        this.name = name;
        this.phone = field;
    }
}

class StuCtrl { // 학생 관리 클래스
    LinkedList<Student> list = new LinkedList<>(); // 학생 객체 리스트
    public void addStudent(int stuNum, String name, String field) { // 학생 추가 메소드
        list.add(new Student(stuNum, name, field));
    }
    
    public Student searchByStudentNum(int stuNum) { // 학생 검색 메소드(학번으로 검색)
        Iterator<Student> e = list.iterator(); // Iterator 선언
        while(e.hasNext()) { // Iterator 순회
            Student temp = e.next(); // temp에 객체 임시 저장
            if(temp.stuNum==stuNum) // temp의 학번 값과 찾는 학번의 값이 같으면
                return temp; // temp를 반환
        }
        return null; // 반복문이 완전히 종료되었으면 찾지 못한 것이므로 null 출력
    }
    
    public Student searchByPhone(String phone) { // 학생 검색 메소드(학번으로 검색)
        Iterator<Student> e = list.iterator(); // Iterator 선언
        while(e.hasNext()) { // Iterator 순회
            Student temp = e.next(); // temp에 객체 임시 저장
            if(temp.phone.equals(phone)) // temp의 학번 값과 찾는 학번의 값이 같으면
                return temp; // temp를 반환
        }
        return null; // 반복문이 완전히 종료되었으면 찾지 못한 것이므로 null 출력
    }
}

public class stuUi {
    public static void main(String[] args) {
        StuCtrl ctrl = new StuCtrl(); // 학생 관리 인스턴스 선언 및 초기화
        
        // 학생 추가
        ctrl.addStudent(1901307, "A", "010-1111-1111");
        ctrl.addStudent(2001255, "B", "010-1111-1112");
        ctrl.addStudent(2001336, "C", "010-1111-1113");
        ctrl.addStudent(2201382, "D", "010-1111-1114");
        
        // 학번으로 학생을 찾아 temp에 저장
        Student temp = ctrl.searchByPhone("010-1111-1112");
        
        // 학생을 찾았으면 정보 출력
        if(temp!=null) System.out.printf("찾았다! 학번: %d\t이름: %s\t전화번호: %s%n", temp.stuNum, temp.name, temp.phone);
        // 찾지 못했을 경우 메세지 출력
        else System.out.println("해당 학번이 없습니다.");
    }
}