package Salvere017.Dice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PanelFunction extends JFrame {

	public static void CreatePanel() {
		// 各パーツ定義
		JFrame frame = new JFrame("あんこ"); // 创建Frame窗口

		JPanel topPanel = new JPanel(new GridLayout(3, 2, 20, 10)); // 创建面板
		JPanel centerPanel = new JPanel(new GridLayout(2, 1, 20, 10)); // 创建面板
		JButton buttonGO = new JButton();
		JLabel labelRange = new JLabel();
		JLabel labelSecond = new JLabel();
		JLabel labelResult = new JLabel();
		JLabel labelGO = new JLabel();

		JTextField textRange = new JTextField();
		JTextField textSecond = new JTextField();
		JTextField textResult = new JTextField(35);

		// 初期設定
		textRange.setText("100");
		textSecond.setText("1");

		// 布石
		textResult.setHorizontalAlignment(JTextField.CENTER); // 居中对齐
		buttonGO.setText("GO!");
		buttonGO.setHorizontalAlignment(JTextField.CENTER); // 居中对齐

		labelRange.setText("🎲サイコロ点数");
		labelSecond.setText("🎲サイコロ個数");
		labelResult.setText("結果点数");
		labelResult.setHorizontalAlignment(JTextField.CENTER); // 居中对齐
		labelGO.setText("🎲サイコロ実行=>");

		topPanel.add(labelRange);
		topPanel.add(textRange);
		topPanel.add(labelSecond);
		topPanel.add(textSecond);

		buttonGO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textResult.setText(textSecond.getText() + "d" + textRange.getText() + " = "
						+ DiceLogic.GetRandomNumber(textSecond.getText(), textRange.getText()));
			}
		});
		topPanel.add(labelGO);
		topPanel.add(buttonGO);

		centerPanel.add(labelResult);
		centerPanel.add(textResult);

		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(centerPanel, BorderLayout.CENTER);

		frame.setLayout(new FlowLayout());// 流式布局
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);// 居中
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
