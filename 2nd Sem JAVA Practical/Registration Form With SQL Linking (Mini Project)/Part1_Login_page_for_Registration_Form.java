
//MainFrame
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;

public class Part1_Login_page_for_Registration_Form extends JFrame {

	private JPanel contentPane;
	private JTextField Usernamefield;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Part1_Login_page_for_Registration_Form frame = new Part1_Login_page_for_Registration_Form();
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
	public Part1_Login_page_for_Registration_Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 345);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(44, 65, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Login to Workspace");
		lblNewLabel.setFont(new Font("Candara", Font.BOLD, 34));
		lblNewLabel.setForeground(SystemColor.text);
		lblNewLabel.setBounds(111, 11, 295, 62);
		contentPane.add(lblNewLabel);

		Usernamefield = new JTextField();
		Usernamefield.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		Usernamefield.setColumns(10);
		Usernamefield.setBounds(235, 128, 171, 30);
		contentPane.add(Usernamefield);

		lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Candara", Font.BOLD, 22));
		lblNewLabel_1.setForeground(SystemColor.textHighlightText);
		lblNewLabel_1.setBounds(111, 129, 108, 30);
		contentPane.add(lblNewLabel_1);

		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Candara", Font.BOLD, 22));
		lblNewLabel_2.setBounds(111, 183, 108, 30);
		contentPane.add(lblNewLabel_2);

		passwordField = new JPasswordField();
		passwordField.setBackground(UIManager.getColor("ComboBox.buttonBackground"));
		passwordField.setBounds(235, 183, 171, 28);
		contentPane.add(passwordField);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Part2_Registration_form_with_SQL_linking reg = new Part2_Registration_form_with_SQL_linking();
				reg.setVisible(true);
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Russo One", Font.PLAIN, 15));
		btnNewButton.setBounds(298, 240, 108, 30);
		contentPane.add(btnNewButton);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 69, 0));
		panel.setBounds(0, 0, 490, 73);
		contentPane.add(panel);
	}

	public Color getContentPaneBackground() {
		return contentPane.getBackground();
	}

	public void setContentPaneBackground(Color background) {
		contentPane.setBackground(background);
	}
}
