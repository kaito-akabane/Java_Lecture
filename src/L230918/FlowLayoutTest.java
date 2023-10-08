package L230918;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest {
    static class MyFrame extends JFrame {
        JPanel panel;

        public MyFrame() {
            panel = new JPanel();
            panel.setLayout(new FlowLayout(FlowLayout.CENTER));
            panel.add(new JButton("Button1"));
            panel.add(new JButton("Button2"));
            panel.add(new JButton("Button3"));
            panel.add(new JButton("B4"));
            panel.add(new JButton("Long Button5"));

            add(panel);

            pack();

            setTitle("FlowLayoutTest");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
