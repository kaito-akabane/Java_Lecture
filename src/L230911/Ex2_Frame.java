package L230911;

import javax.swing.JFrame;

public class Ex2_Frame {
    static class MyFrame extends JFrame {
        MyFrame() {
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("MyFrame");
        }
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setVisible(true);
    }
}