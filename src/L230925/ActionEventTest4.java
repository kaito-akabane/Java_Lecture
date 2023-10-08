package L230925;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame4 extends JFrame {
    JButton button;
    JLabel label;
    JPanel panel;

    public MyFrame4() {
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("이벤트 예제");

        panel = new JPanel();
        button = new JButton("버튼을 누르시오");
        label = new JLabel("아직 버튼이 눌려지지 않았습니다");
        button.addActionListener(e -> {
            if(e.getSource() == button) {
                label.setText("마침내 버튼이 눌렸습니다.");
            }
        });
        panel.add(button);
        panel.add(label);
        add(panel);
        setVisible(true);
    }
}

public class ActionEventTest4 {
    public static void main(String[] args) {
        new MyFrame4();
    }
}