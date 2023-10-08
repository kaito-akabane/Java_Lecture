package L230913;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hotel extends JFrame {
    JPanel panel;
    JPanel panelA;
    JPanel panelB;
    JLabel label;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;

    Hotel() {
        panel = new JPanel();
        panelA = new JPanel();
        panelB = new JPanel();
        label = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.");
        b1 = new JButton("1명");
        b2 = new JButton("2명");
        b3 = new JButton("3명");
        b4 = new JButton("4명");
        b5 = new JButton("5명");

        add(panel);
        panel.add(panelA);
        panel.add(panelB);
        panelA.add(label);
        panelB.add(b1);
        panelB.add(b2);
        panelB.add(b3);
        panelB.add(b4);
        panelB.add(b5);

        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("테스트 프레임");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Hotel();
    }
}