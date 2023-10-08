package L230925.Task;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyPad extends JFrame implements ActionListener { // JFrame 클래스와 ActionListener 클래스를 상속받은 KeyPad 클래스 선언
    private JTextField txt; // 입력값 필드
    private JPanel panel;   // 버튼 패널
    public KeyPad() { // 생성자
        txt = new JTextField(20); // 크기 20인 텍스트 필드 생성
        add(txt, BorderLayout.NORTH);     // 텍스트 필드를 북쪽에 배치
        panel = new JPanel();             // 패널 생성
        panel.setLayout(new GridLayout(3, 3)); // 패널을 3*3 GridLayout으로 지정
        add(panel, BorderLayout.CENTER); // 패널을 중앙에 배치
        for(int i=1;i<=9;i++) { // 9회 반복
            JButton btn = new JButton(""+i); // 버튼을 생성 후 텍스트를 i의 값으로 지정
            btn.addActionListener(this); // 현재 객체가 ActionListner이므로 자기 자신을 리스너로 등록
            btn.setPreferredSize(new Dimension(100, 100)); // 버튼 크기를 100*100으로 지정
            panel.add(btn); // 버튼을 패널에 추가
        }
        pack(); // pack
        setDefaultCloseOperation(EXIT_ON_CLOSE); // 기본 닫음 옵션 설정
        setVisible(true); // 창 보이게 하기
    }

    public void actionPerformed(ActionEvent e) { // 이벤트 발생 시 처리 함수
        String actionCommand = e.getActionCommand(); // 이벤트 커맨드를 문자열로 저장
        txt.setText(txt.getText() + actionCommand); // 문자열을 텍스트 패널에 추가
    }

    public static void main(String[] args) {
        new KeyPad(); // KeyPad 인스턴스 생성
    }
}