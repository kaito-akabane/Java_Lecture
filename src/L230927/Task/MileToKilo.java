package L230927.Task;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MileToKilo extends JFrame {
    JPanel p1; // 패널1 선언
    JPanel p2; // 패널2 선언
    JPanel p3; // 패널3 선언
    JButton button; // 변환 버튼 선언
    JTextField input; // 입력 필드 선언
    JTextField result; // 출력 필드 선언

    MileToKilo() {
        setTitle("마일을 킬로미터로 변환"); // 프레임 타이틀 지정
        setSize(400, 150); // 프레임 사이즈를 400*150으로 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 경우 종료

        // 컴포넌트 선언 및 설정
        p1 = new JPanel(); // 패널1 초기화
        p2 = new JPanel(); // 패널2 초기화
        p3 = new JPanel(); // 패널3 초기화
        button = new JButton("변환"); // 변환 버튼
        input = new JTextField(8); // 입력 필드
        result = new JTextField(20); // 출력 필드
        result.setEditable(false); // 출력 필드 입력 잠금

        // 컴포넌트 배치
        add(p1, BorderLayout.PAGE_START); // 패널 p1을 북쪽에 배치
        add(p2, BorderLayout.CENTER);     // 패널 p2를 중앙에 배치
        add(p3, BorderLayout.PAGE_END);   // 패널 p3를 남쪽에 배치
        p1.add(new JLabel("거리를 마일 단위로 입력하세요.")); // 레이블 추가
        p1.add(input);  // 텍스트 필드 추가
        p2.add(button); // 버튼 추가
        p3.add(result); // 텍스트 필드 추가

        // 리스너 선언 및 추가
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mile = Integer.parseInt(input.getText()); // 필드 입력 값을 정수로 저장
                // 킬로미터 값을 계산하여 출력 필드에 출력
                result.setText(String.format("%d 마일은 %f 킬로미터입니다.", mile, mile*1.609344));
            }
        });

        setVisible(true); // 프레임 가시화
    }

    public static void main(String[] args) {
        new MileToKilo(); // 인스턴스 생성
    }
}