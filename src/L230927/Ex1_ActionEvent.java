package L230927;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex1_ActionEvent {
    static class MyFrame extends JFrame {
        private JPanel panel;
        private JButton button1;
        private JButton button2;
        private JButton button3;

        public MyFrame() {
            setSize(300, 200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("이벤트 예제");
            panel = new JPanel();
            button1 = new JButton("노란색");
            button1.addActionListener(new MyListener());
            panel.add(button1);
            button2 = new JButton("핑크색");
            button2.addActionListener(new MyListener());
            panel.add(button2);
            button3 = new JButton("파란색");
            button3.addActionListener(new MyListener());
            panel.add(button3);

            add(panel);
            setVisible(true);
        }

        private class MyListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();
                if(source.equals(button1)) {
                    panel.setBackground(Color.yellow);
                }
                else if(source.equals(button2)) {
                    panel.setBackground(Color.pink);
                }
                else if(source.equals(button3)) {
                    panel.setBackground(Color.blue);
                }
            }
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
