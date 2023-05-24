import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RandonHome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RandonHome frame = new RandonHome();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RandonHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 340);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBounds(194, 30, 331, 40);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);

		JLabel lblNewLabel = new JLabel("Kyu AnimaRandon Quest");
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));

		textField = new JTextField();
		textField.setBounds(188, 104, 100, 50);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(344, 188, 89, 32);
		contentPane.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("GERAR!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer min = Integer.parseInt(textField.getText());
				Integer max = Integer.parseInt(textField_1.getText());
				Integer numberGenerated = generateRandomNumber(min, max);
				lblNewLabel_2.setText(numberGenerated.toString());

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setBounds(333, 250, 100, 40);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Até");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(355, 120, 46, 14);
		contentPane.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(460, 104, 100, 50);
		contentPane.add(textField_1);

		JLabel lblNewLabel_1_1 = new JLabel("De");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(115, 120, 46, 14);
		contentPane.add(lblNewLabel_1_1);

	}

	public int generateRandomNumber(int min, int max) {
		Random rand = new Random();
		int randomNumber = rand.nextInt((max - min) + 1) + min;
		return randomNumber;
	}
}
