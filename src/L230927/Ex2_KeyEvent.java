package L230927;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex2_KeyEvent extends JFrame implements KeyListener {
    private JPanel panel;
    private JTextField field;
    private JTextArea area;

    public Ex2_KeyEvent() {
        panel = new JPanel(new GridLayout(0, 2));
        panel.add(new JLabel("문자를 입력하시오: "));
        field = new JTextField(10);
        panel.add(field);
        area = new JTextArea(3, 30);
        add(panel, BorderLayout.NORTH);
        add(area, BorderLayout.CENTER);

        field.addKeyListener(this);
        setTitle("KeyEvent Test");
        setSize(400, 200);
        setVisible(true);
    }

    public void keyTyped(KeyEvent e) {
        display(e, "Key Typed\t");
    }

    public void keyPressed(KeyEvent e) {
        display(e, "Key Pressed\t");
    }

    public void keyReleased(KeyEvent e) {
        display(e, "Key Released\t");
    }

    private void display(KeyEvent e, String s) {
        char c = e.getKeyChar();
        int keyCode = e.getKeyCode();
        String modifiers = String.format("Alt: %bCtrl: %bShift: %b", e.isAltDown(), e.isControlDown(), e.isShiftDown());
        area.append(String.format("%s문자 %c(코드: %d) %s\n", s, c, keyCode, modifiers));
    }

    public static void main(String[] args) {
        new Ex2_KeyEvent();
    }
}
