package L230925.Task;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MileToKilo extends JFrame {
    MileToKilo() {
        JPanel p1 = new JPanel(); // 패널 1
        JPanel p2 = new JPanel(); // 패널 2
        JPanel p3 = new JPanel(); // 패널 3
        JButton button = new JButton("변환"); // 변환 버튼
        JTextField input = new JTextField(8); // 입력 필드
        JTextField result = new JTextField(20); // 출력 필드
        result.setEditable(false); // 출력 필드 입력 잠금
        button.addActionListener(new ActionListener() { // 리스너 추가
            public void actionPerformed(ActionEvent e) {
                int mile = Integer.parseInt(input.getText()); // 필드 입력 값을 정수로 저장
                // 킬로미터 값을 계산하여 출력 필드에 출력
                result.setText(String.format("%d 마일은 %f 킬로미터입니다.", mile, mile*1.609344));
            }
        });

        p1.add(new JLabel("거리를 마일 단위로 입력하세요.")); // 레이블 추가
        p1.add(input);  // 텍스트 필드 추가
        p2.add(button); // 버튼 추가
        p3.add(result); // 텍스트 필드 추가
        add(p1, BorderLayout.PAGE_START); // 패널 p1을 북쪽에 배치
        add(p2, BorderLayout.CENTER);     // 패널 p2를 중앙에 배치
        add(p3, BorderLayout.PAGE_END);   // 패널 p3를 남쪽에 배치
        setTitle("마일을 킬로미터로 변환"); // 프레임 타이틀 지정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 경우 종료
        setSize(400, 150); // 프레임 사이즈를 400*150으로 설정
        setVisible(true); // 프레임 가시화
    }

    public static void main(String[] args) {
        new MileToKilo(); // 인스턴스 생성
    }
}