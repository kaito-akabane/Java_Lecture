import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.Applet;

import javax.swing.*;

class MyFrame extends JFrame implements ActionListener {

	private JButton buttonOK;
	private JCheckBox onion, cheese, tomato;

	public MyFrame() {
		setTitle("üũ�ڽ� �׽�Ʈ");
		setSize(300, 130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label = new JLabel("�ܹ��ſ� ������ �߰��Ͻðڽ��ϱ�?");
		JPanel topPanel = new JPanel();
		topPanel.add(label);
		add(topPanel, BorderLayout.NORTH);

		// üũ �ڽ� ���� �� �߰�
		JPanel panel = new JPanel();
		onion = new JCheckBox("����");
		panel.add(onion);
		cheese = new JCheckBox("ġ��");
		panel.add(cheese);
		tomato = new JCheckBox("�丶��");
		panel.add(tomato);
		add(panel, BorderLayout.CENTER);

		// ��ư ���� �� �߰�
		buttonOK = new JButton("OK");
		JPanel bottomPanel = new JPanel();
		bottomPanel.add(buttonOK);
		add(bottomPanel, BorderLayout.SOUTH);
		buttonOK.addActionListener(this);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonOK) {
			String msg = "";
			if (onion.isSelected())
				msg += "����\n";
			if (cheese.isSelected())
				msg += " ġ��";
			if (tomato.isSelected())
				msg += " �丶��";
			msg = "������ �ɼ��� ������ �����ϴ�.\n " + msg;
			System.out.println(msg);
			onion.setSelected(false);
			cheese.setSelected(false);
			tomato.setSelected(false);
		}
	}
}

public class CheckBoxTest extends JFrame {
	public static void main(String[] args) {
		new MyFrame();
	}

}
