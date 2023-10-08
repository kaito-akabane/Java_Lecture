package L230918.Task;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
    JPanel panel; // 패널 생성
    JTextField tField; // 텍스트 필드 생성
    JButton[] buttons; // 버튼 배열 생성
    String[] labels = { // 레이블에 사용할 문자열 배열 생성 후 값 입력
            "Backspace", "", "", "CE", "C",
            "7", "8", "9", "/", "sqrt",
            "4", "5", "6", "x", "%",
            "1", "2", "3", "-", "1/x",
            "0", "+/-", ".", "+", "=",
    };

    public Calculator() {
        tField = new JTextField("0", 35); // 텍스트 필드 생성 후 기본 입력값 "0", 크기 35로 설정
        tField.setEnabled(true); // 텍스트 필드 입력 허용
        panel = new JPanel(); // 패널 생성
        panel.setLayout(new GridLayout(0, 5, 3, 3)); // 한 행에 5열씩 배치되도록 GridLayour 설정
        buttons = new JButton[25]; // 크기 25인 버튼 배열 생성
        int index = 0; // 배열 인덱스 변수 생성
        for(int rows=0;rows<5;rows++) { // 행 - 5회 반복
            for(int cols=0;cols<5;cols++) { // 열 - 5회 반복
                buttons[index] = new JButton(labels[index]); // 배열 내 버튼 생성 - 문자열 배열 활용
                if(cols>=3) // 한 행의 4열 이상부터
                    buttons[index].setForeground(Color.red); // 텍스트 색상을 빨강으로 설정
                else
                    buttons[index].setForeground(Color.blue); // 텍스트 색상을 파랑으로 설정
                buttons[index].setBackground(Color.yellow); // 버튼 색상을 노랑으로 설정
                panel.add(buttons[index++]); // 패널에 버튼 추가
            }
        }
        add(tField, BorderLayout.NORTH); // 텍스트 필드를 북쪽에 배치
        add(panel, BorderLayout.CENTER); // 패널을 중앙에 배치
        pack(); // pack
        setVisible(true); // 보이게 하기
    }

    public static void main(String[] args) {
        new Calculator(); // 객체 생성
    }
}