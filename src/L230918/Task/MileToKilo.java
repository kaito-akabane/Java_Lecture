package L230918.Task;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MileToKilo {
    static class MyFrame extends JFrame {
        MyFrame() {
            setTitle("마일을 킬로미터로 변환"); // 프레임 타이틀 지정
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 경우 종료
            setSize(400, 150);

            // 패널 객체 생성
            JPanel p1 = new JPanel();
            JPanel p2 = new JPanel();
            JPanel p3 = new JPanel();

            p1.add(new JLabel("거리를 마일 단위로 입력하세요.")); // 레이블 추가
            p1.add(new JTextField(3)); // 텍스트 필드 추가
            p2.add(new JButton("변환")); // 버튼 추가
            p3.add(new JTextField("", 15)); // 텍스트 필드 추가

            add(p1, BorderLayout.PAGE_START); // 패널 p1을 북쪽에 배치
            add(p2, BorderLayout.CENTER);     // 패널 p2를 중앙에 배치
            add(p3, BorderLayout.PAGE_END);   // 패널 p3를 남쪽에 배치
        }
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setVisible(true);
    }
}