package L231004.Task;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CafeComboBox extends JFrame {
    JPanel p1, p2, p3;
    JComboBox size;
    JButton confirm;
    JTextField result;
    
    String[] sizes = {"Small", "Medium", "Large"};
    
    CafeComboBox() {
        init();
        deploy();
        showFrame();
    }
    
    private void init() {
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        size = new JComboBox(sizes);
        confirm = new JButton("확인");
        result = new JTextField(20);
        result.setEditable(false);
        
        confirm.addActionListener(e -> {
            if(e.getSource()==confirm) {
                int price = 0;
                if(size.getSelectedItem()=="Small")
                    price = 3000;
                if(size.getSelectedItem()=="Medium")
                    price = 4000;
                if(size.getSelectedItem()=="Large")
                    price = 5000;
                result.setText(String.format("%s 사이즈는 %d원입니다.", size.getSelectedItem().toString(), price));
            }
        });
    }
    
    private void deploy() {
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);
        
        p1.add(new JLabel("사이즈를 선택해주세요"));
        p2.add(size);
        p2.add(confirm);
        p3.add(result);
    }
    
    private void showFrame() {
        pack();
        setTitle("콤보 박스");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new CafeComboBox();
    }
}