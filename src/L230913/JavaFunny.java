package L230913;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JavaFunny extends JFrame {
    JPanel panel;
    JLabel label;
    JButton b1;
    JButton b2;

    JavaFunny() {
        panel = new JPanel();
        label = new JLabel("자바는 재미있나요?");
        b1 = new JButton("No");
        b2 = new JButton("아니오");

        panel.add(label);
        panel.add(b1);
        panel.add(b2);
        add(panel);

        setSize(500, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("테스트 프레임");
        setVisible(true);
    }

    public static void main(String[] args) {
        new JavaFunny();
    }
}