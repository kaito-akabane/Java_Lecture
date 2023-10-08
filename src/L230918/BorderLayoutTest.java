package L230918;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BorderLayoutTest {
    static class MyFrame extends JFrame {
        JPanel p1;
        JPanel p2;
        JPanel p3;

        public MyFrame() {
            p1 = new JPanel();
            p2 = new JPanel();
            p3 = new JPanel();

            p1.add(new JLabel("거리를 마일 단위로 입력하세요."));
            p1.add(new JTextField(3));
            p2.add(new JButton("변환"));
            p3.add(new JTextField(15));

            add(p1, BorderLayout.PAGE_START);
            add(p2, BorderLayout.CENTER);
            add(p3, BorderLayout.PAGE_END);

            pack();

            setTitle("FlowLayoutTest");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
