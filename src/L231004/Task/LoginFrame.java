package L231004.Task;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {
    JPanel panel;
    JTextField id, pw;
    JButton loginBtn;
    
    LoginFrame() {
        init();
        deploy();
        showFrame();
    }
    
    private void init() {
        panel = new JPanel();
        id = new JTextField(30);
        pw = new JTextField(30);
        loginBtn = new JButton("로그인");
        
        loginBtn.addActionListener(e -> {
            if(e.getSource()==loginBtn)
                if(id.getText().equals("hong")&&pw.getText().equals("1111"))
                    System.out.println("로그인 성공");
                else
                    System.out.println("로그인 실패");
        });
    }
    
    private void deploy() {
        panel.setLayout(new GridLayout(5, 1));
        panel.add(new JLabel("아이디"));
        panel.add(id);
        panel.add(new JLabel("비밀번호"));
        panel.add(pw);
        panel.add(loginBtn);
        add(panel);
    }
    
    private void showFrame() {
        pack();
        setTitle("LOGIN FORM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new LoginFrame();
    }
}