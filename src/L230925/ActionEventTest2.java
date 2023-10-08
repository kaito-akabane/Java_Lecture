package L230925;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame2 extends JFrame {
    JButton button;
    JLabel label;

    public MyFrame2() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("이벤트 예제");

        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르시오");
        label = new JLabel("아직 버튼이 눌려지지 않았습니다");
        button.addActionListener(new MyListener());
        panel.add(button);
        panel.add(label);
        add(panel);

        setVisible(true);
    }

    private class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == button) {
                label.setText("마침내 버튼이 눌렸습니다.");
            }
        }
    }
}

public class ActionEventTest2 {
    public static void main(String[] args) {
        new MyFrame2();
    }
}