package L230913;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PizzaColor extends JFrame {
    PizzaColor() {
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        JPanel panel = new JPanel();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();
        panel.setBackground(Color.BLUE);
        panelA.setBackground(Color.CYAN);
        panelB.setBackground(Color.GREEN);

        JLabel label1 = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하세요.");

        JButton b1 = new JButton("콤보 피자");
        JButton b2 = new JButton("포테이토 피자");
        JButton b3 = new JButton("불고기 피자");

        panelA.add(label1);
        panelB.add(b1);
        panelB.add(b2);
        panelB.add(b3);
        panel.add(panelA);
        panel.add(panelB);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new PizzaColor();
    }
}