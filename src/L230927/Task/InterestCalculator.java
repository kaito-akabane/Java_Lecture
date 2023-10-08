package L230927.Task;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InterestCalculator extends JFrame {
    // 컴포넌트 선언
    JPanel panel, panel1, panel2, panel3, panel4; // 메인 패널, 서브 패널 1~4
    JTextField principalF, interestF, resultF; // 원금, 이자, 출력 필드
    JButton button; // 버튼

    InterestCalculator() {
        setTitle("이자 계산기"); // 프레임 타이틀 지정
        setSize(300, 200); // 프레임 사이즈를 300*200으로 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창을 닫을 경우 종료

        // 컴포넌트 생성 및 설정
        panel = new JPanel(); // 메인 패널
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // 메인 패널의 배치 관리자를 BoxLayout으로 설정
        panel1 = new JPanel(); // 패널1
        principalF = new JTextField(5); // 원금 입력 필드
        panel2 = new JPanel(); // 패널2
        interestF = new JTextField(5); // 이율 입력 필드
        panel3 = new JPanel(); // 패널3
        button = new JButton("변환"); // 변환 버튼
        panel4 = new JPanel(); // 패널4
        resultF = new JTextField(15); // 출력 필드
        resultF.setEditable(false); // 출력 필드를 편집 금지로 설정

        // 리스너 추가
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==button) { // 버튼이 눌렸을 경우
                    int principal = Integer.parseInt(principalF.getText()); // 원금 필드의 값을 정수로 저장
                    double interest = Double.parseDouble(interestF.getText())/100; // 이율의 필드를 실수로 저장
                    resultF.setText(String.format("이자는 연 %.0f만원입니다.", principal*interest)); // 이자 계산값을 출력 필드에 출력
                }
            }
        });

        add(panel); // 프레임에 패널 추가
        panel.add(panel1); // 패널1 추가
        panel.add(panel2); // 패널2 추가
        panel.add(panel3); // 패널3 추가
        panel.add(panel4); // 패널4 추가
        panel1.add(new JLabel("원금을 입력하시오")); // 패널1에 레이블 추가
        panel1.add(principalF); // 패널1에 필드 추가
        panel2.add(new JLabel("이율을 입력하시오")); // 패널2에 레이블 추가
        panel2.add(interestF); // 패널2에 필드 추가
        panel3.add(button);    // 패널3에 버튼 추가
        panel4.add(resultF);   // 패널4에 필드 추가

        setVisible(true); // 프레임 가시화
    }

    public static void main(String[] args) {
        new InterestCalculator(); // 인스턴스 생성
    }
}