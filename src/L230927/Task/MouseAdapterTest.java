package L230927.Task;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MouseEventFrame extends JFrame {
    JPanel p1;      // 패널 선언
    JLabel label;   // 레이블 선언

    MouseEventFrame() {
        // 프레임 설정
        setTitle("Mouse Event");        // 타이틀을 "Mouse Event"로 지정
        setSize(300, 200);  // 프레임 사이즈를 300*200으로 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 시 프로그램 종료

        // 컴포넌트 배치
        p1 = new JPanel(); // 패널 초기화
        p1.setBackground(Color.GRAY); // 패널 배경을 회색으로 설정
        add(p1); // 프레임에 패널 추가
        label = new JLabel("X: 0 Y: 0"); // 레이블 생성 및 텍스트를 "X: 0 Y: 0"으로 지정
        p1.add(label); // 패널에 레이블 추가

        // 어댑터 선언 및 추가
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) { // 마우스가 움직일 경우
                // 레이블 텍스트를 "X: {마우스 X좌표값} Y: {마우스 Y좌표값}"으로 설정
                label.setText(String.format("X: %d Y: %d", e.getX(), e.getY()));
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) { // 마우스가 눌렸을 때
                p1.setBackground(Color.pink); // 패널 배경을 핑크색으로 설정
            }
            @Override
            public void mouseReleased(MouseEvent e) { // 마우스가 떼졌을 때
                p1.setBackground(Color.gray); // 패널 배경을 회색으로 설정
            }
        });

        setVisible(true); // 프레임 가시화
    }
}

public class MouseAdapterTest {
    public static void main(String[] args) {
        new MouseEventFrame();
    }
}