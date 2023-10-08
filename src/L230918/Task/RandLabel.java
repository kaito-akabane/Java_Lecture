package L230918.Task;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RandLabel extends JFrame {
    JPanel p = new JPanel(); // 패널 생성
    JLabel[] labels = new JLabel[30]; // 30 크기의 레이블 배열 생성

    RandLabel() {
        p.setLayout(null); // 패널 레이아웃을 null로 설정 - 절대 배치
        p.setBackground(Color.YELLOW); // 배경을 노랑으로 설정
        for (int i=0;i<30;i++) { // 30회 반복
            labels[i] = new JLabel(""+i); // i을 문자열로 바꿔 레이블 값으로 입력
            int x = (int)(500*Math.random()); // 0~500 사이의 난수 발생
            int y = (int)(200*Math.random()); // 0~200 사이의 난수 발생
            labels[i].setForeground(Color.MAGENTA); // 레이블 색상을 마젠타로 설정
            labels[i].setLocation(x, y); // 레이블 위치를 x, y로 설정
            labels[i].setSize(20, 20); // 레이블 사이즈를 20*20으로 설정
            p.add(labels[i]); // 패널에 레이블을 추가
        }
        add(p); // 프레임에 패널 추가

        setSize(500, 300); // 프레임 사이즈를 500*300으로 설정
        setVisible(true); // 프레임을 화면에 표시
    }

    public static void main(String[] args) {
        new RandLabel();
    }
}



