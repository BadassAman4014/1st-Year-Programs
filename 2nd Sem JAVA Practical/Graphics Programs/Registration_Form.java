
//No linking
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration_Form extends JFrame {

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
					Registration_Form frame = new Registration_Form();
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
	public Registration_Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 354);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 220));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("University Registration");
		lblNewLabel.setBounds(103, 11, 187, 22);
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 18));
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Name of Student");
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 49, 127, 14);
		contentPane.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(176, 44, 156, 17);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("College Name");
		lblNewLabel_2.setFont(new Font("Candara", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 74, 127, 14);
		contentPane.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(176, 75, 156, 17);
		contentPane.add(textField_1);

		JLabel lblNewLabel_3 = new JLabel("Address of Communication");
		lblNewLabel_3.setFont(new Font("Candara", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 99, 156, 14);
		contentPane.add(lblNewLabel_3);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(176, 100, 156, 36);
		contentPane.add(textArea);

		JLabel lblNewLabel_4 = new JLabel("Stream");
		lblNewLabel_4.setFont(new Font("Candara", Font.BOLD, 12));
		lblNewLabel_4.setBounds(10, 144, 46, 14);
		contentPane.add(lblNewLabel_4);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Engg");
		rdbtnNewRadioButton.setBackground(new Color(245, 245, 220));
		rdbtnNewRadioButton.setFont(new Font("Candara", Font.BOLD, 12));
		rdbtnNewRadioButton.setBounds(6, 165, 72, 14);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("CT");
		rdbtnNewRadioButton_1.setBackground(new Color(245, 245, 220));
		rdbtnNewRadioButton_1.setFont(new Font("Candara", Font.BOLD, 12));
		rdbtnNewRadioButton_1.setBounds(80, 165, 72, 14);
		contentPane.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("IT");
		rdbtnNewRadioButton_2.setBackground(new Color(245, 245, 220));
		rdbtnNewRadioButton_2.setFont(new Font("Candara", Font.BOLD, 12));
		rdbtnNewRadioButton_2.setBounds(156, 165, 72, 14);
		contentPane.add(rdbtnNewRadioButton_2);

		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("EE");
		rdbtnNewRadioButton_3.setBackground(new Color(245, 245, 220));
		rdbtnNewRadioButton_3.setFont(new Font("Candara", Font.BOLD, 12));
		rdbtnNewRadioButton_3.setBounds(230, 165, 72, 14);
		contentPane.add(rdbtnNewRadioButton_3);

		JRadioButton rdbtnEt = new JRadioButton("ET");
		rdbtnEt.setBackground(new Color(245, 245, 220));
		rdbtnEt.setFont(new Font("Candara", Font.BOLD, 12));
		rdbtnEt.setBounds(6, 189, 72, 14);
		contentPane.add(rdbtnEt);

		JRadioButton rdbtnMe = new JRadioButton("ME");
		rdbtnMe.setBackground(new Color(245, 245, 220));
		rdbtnMe.setFont(new Font("Candara", Font.BOLD, 12));
		rdbtnMe.setBounds(80, 189, 72, 14);
		contentPane.add(rdbtnMe);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Candara", Font.BOLD, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "101", "102", "103", "104", "105", "106" }));
		comboBox.setBounds(91, 222, 46, 22);
		contentPane.add(comboBox);

		JLabel lblNewLabel_5 = new JLabel("College Code");
		lblNewLabel_5.setFont(new Font("Candara", Font.BOLD, 12));
		lblNewLabel_5.setBounds(10, 222, 68, 14);
		contentPane.add(lblNewLabel_5);

		JButton btnNewButton = new JButton("Reset");
		btnNewButton.setFont(new Font("Candara", Font.BOLD, 12));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(8, 281, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Candara", Font.BOLD, 12));
		btnSubmit.setForeground(Color.BLACK);
		btnSubmit.setBounds(156, 281, 89, 23);
		contentPane.add(btnSubmit);

		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.setFont(new Font("Candara", Font.BOLD, 12));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\91902\\Desktop\\Icons\\16.png"));
		btnNewButton_1.setBounds(293, 281, 89, 23);
		contentPane.add(btnNewButton_1);

		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 392, 33);
		contentPane.add(panel);
	}
}
