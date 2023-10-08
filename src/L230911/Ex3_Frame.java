package L230911;

import javax.swing.JFrame;

public class Ex3_Frame extends JFrame {
    Ex3_Frame() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");
    }

    public static void main(String[] args) {
        Ex3_Frame f = new Ex3_Frame();
        f.setVisible(true);
    }
}