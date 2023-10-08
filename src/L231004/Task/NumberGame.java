package L231004.Task;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGame extends JFrame implements ActionListener {
    // 컴포넌트 선언
    JPanel p1, p2, p3;
    JTextField input;
    JLabel result;
    JButton newGame, exit;
    
    int answer;
    
    NumberGame() {
        init();      // 컴포넌트 초기화
        deploy();    // 컴포넌트 배치
        showFrame(); // 프레임 보이기
    }
    
    private void init() {
        // 패널 1, 2, 3 초기화
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        
        // 텍스트 필드, 레이블, 버튼 초기화
        input = new JTextField(10);
        result = new JLabel("숫자를 입력하시오.");
        newGame = new JButton("새 게임");
        exit = new JButton("종료");
        
        // 난수 생성 (1~100)
        answer = (int)(Math.random()*100+1);
        
        // ActionLister 추가
        input.addActionListener(this);
        newGame.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) { // ActionEvent 발생 시
        if(e.getSource()==input) { // input 필드의 값이 갱신되었을 때
            int inputInt = Integer.parseInt(input.getText()); // input 필드의 값을 정수로 저장
            // 정답과 비교한 결과를 result 레이블에 출력
            if(inputInt>answer) result.setText("높습니다!");
            else if(inputInt<answer) result.setText("낮습니다!");
            else result.setText("정답입니다!");
        }
        if(e.getSource()==newGame) { // 새 게임 버튼이 눌렸을 때
            answer = (int)(Math.random()*100+1); // 난수를 새로 생성
            input.setText(""); // 필드 입력값을 초기화
            result.setText("숫자를 입력하시오."); // result 레이블 값을 변경
        }
    }
    
    private void deploy() {
        // 패널 및 컴포넌트 배치
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
        
        p1.add(new JLabel("숫자를 추측하시오:"));
        p1.add(input);
        p2.add(result);
        p3.add(newGame);
        p3.add(exit);
    }
    
    private void showFrame() {
        pack();
        setTitle("숫자게임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new NumberGame();
    }
}