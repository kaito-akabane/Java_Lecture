package L231011.Task;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EACalc extends JFrame {
    // 컴포넌트 선언
    JPanel pnl1, pnl2;
    JTextField oprd1, oprd2, result, console;
    JComboBox<String> oprt;
    JButton btn;
    
    EACalc() {
        init();
        depoly();
        showFrame();
    }
    
    void init() {
        // 컴포넌트 초기화
        pnl1 = new JPanel();
        pnl2 = new JPanel();
        oprd1 = new JTextField(5);
        oprd2 = new JTextField(5);
        result = new JTextField(5);
        console = new JTextField(30);
        oprt = new JComboBox<>(new String[]{"+", "-", "*", "/"}); // 사칙연산 기호 배열을 콤보 박스에 사용
        btn = new JButton("=");
        
        // 출력 필드 잠금
        result.setEditable(false);
        console.setEditable(false);
        
        btn.addActionListener(e -> { // 버튼에 ActionListener 추가
            try {
                String select = oprt.getSelectedItem().toString(); // 선택된 연산자를 문자열로 받아 저장
                int op1 = Integer.parseInt(oprd1.getText()); // 첫번째 연산자 필드 입력값을 정수로 저장
                int op2 = Integer.parseInt(oprd2.getText()); // 두번째 연산자 필드 입력값을 정수로 저장
                int res = switch(select) { // 선택된 연산자를 사용한 switch문
                    case "+" -> op1+op2; // "+"일 경우 덧셈
                    case "-" -> op1-op2; // "-"일 경우 뺄셈
                    case "*" -> op1*op2; // "*"일 경우 곱셈
                    case "/" -> op1/op2; // "/"일 경우 나눗셈
                    default -> 0;
                };
                result.setText(res+""); // 연산 결과값을 reuslt 필드에 문자열로 출력
                console.setText("사칙연산 계산 완료!"); // 연산 완료 시
            }
            catch(NumberFormatException ee) { // 정수 변환 도중 예외 발생 시
                console.setText("입력값이 정수가 아님");
            }
            catch(ArithmeticException ee) {
                console.setText("0으로 나눌 수 없음"); // 연산 도중 예외 발생 시
            }
        });
    }
    
    void depoly() {
        add(pnl1, BorderLayout.NORTH);  // 패널 1을 북쪽에 배치
        add(pnl2, BorderLayout.CENTER); // 패널 2를 중앙에 배치
        
        // 패널에 컴포넌트 배치
        pnl1.add(oprd1);
        pnl1.add(oprt);
        pnl1.add(oprd2);
        pnl1.add(btn);
        pnl1.add(result);
        pnl2.add(console);
    }
    
    void showFrame() {
        setTitle("정수 사칙연산 프로그램"); // 프레임 타이틀 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 시 프로그램 종료
        
        pack(); // 컴포넌트에 맞게 프레임 사이즈 조절
        setVisible(true); // 프레임 가시화
    }
    
    public static void main(String[] args) {
        new EACalc(); // 무명 객체 생성
    }
}