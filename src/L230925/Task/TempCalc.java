package L230925.Task;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TempCalc extends JFrame { // JFrame 클래스 상속
    TempCalc() {
        JPanel panel = new JPanel(); // 메인 패널
        JTextField fieldF = new JTextField(15); // 화씨 온도 입력 필드
        JTextField fieldC = new JTextField(15); // 섭씨 온도 출력 필드
        JButton button = new JButton("변환"); // 변환 버튼
        button.addActionListener(new ActionListener() { // 리스너 추가
            public void actionPerformed(ActionEvent e) { // 메소드 구현
                fieldC.setText( // 섭씨 온도 출력 필드의 값을
                        // 섭씨 온도 계산 결과값으로 설정
                        String.format("%f", (Integer.parseInt(fieldF.getText())-32)/1.8)
                );
            }
        });

        panel.add(new JLabel("화씨 온도")); // 패널에 라벨 배치
        panel.add(fieldF);                     // 패널에 필드 배치
        panel.add(new JLabel("섭씨 온도")); // 패널에 라벨 배치
        panel.add(fieldC);                     // 패널에 필드 배치
        panel.add(button);                     // 패널에 버튼 배치
        add(panel); // 프레임에 필드 배치

        setTitle("온도 변환기"); // 타이틀 설정
        setSize(300, 150); // 프레임 사이즈 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 기본 닫기 옵션 설정
        setVisible(true); // 보이기 설정
    }

    public static void main(String[] args) {
        new TempCalc(); // 인스턴스 생성
    }
}