package L230911;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex4_Component {
    static class MyFrame extends JFrame {
        MyFrame() {
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("MyFrame");

            setLayout(new FlowLayout());
            JButton button = new JButton("버튼");
            this.add(button);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}