
//Linked Page
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;

public class Part2_Registration_form_with_SQL_linking extends JFrame {

	private JPanel contentPane;
	private JTextField Fname;
	private JTextField Lname;
	private JTextField emailT;
	private JTextField pnum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Part2_Registration_form_with_SQL_linking frame = new Part2_Registration_form_with_SQL_linking();
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
	public Part2_Registration_form_with_SQL_linking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(44, 65, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Ubuntu Medium", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 70, 74, 18);
		contentPane.add(lblNewLabel);

		Fname = new JTextField();
		Fname.setBackground(UIManager.getColor("TabbedPane.light"));
		Fname.setBounds(132, 68, 186, 20);
		contentPane.add(Fname);
		Fname.setColumns(10);

		Lname = new JTextField();
		Lname.setBackground(UIManager.getColor("TabbedPane.light"));
		Lname.setColumns(10);
		Lname.setBounds(132, 115, 186, 20);
		contentPane.add(Lname);

		emailT = new JTextField();
		emailT.setBackground(UIManager.getColor("TabbedPane.light"));
		emailT.setColumns(10);
		emailT.setBounds(132, 157, 186, 20);
		contentPane.add(emailT);

		pnum = new JTextField();
		pnum.setBackground(UIManager.getColor("TabbedPane.light"));
		pnum.setColumns(10);
		pnum.setBounds(132, 197, 186, 20);
		contentPane.add(pnum);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Ubuntu Medium", Font.PLAIN, 14));
		lblEmail.setBounds(10, 157, 64, 18);
		contentPane.add(lblEmail);

		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(new Color(255, 255, 255));
		lblPhoneNumber.setFont(new Font("Ubuntu Medium", Font.PLAIN, 14));
		lblPhoneNumber.setBounds(10, 197, 98, 18);
		contentPane.add(lblPhoneNumber);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(255, 255, 255));
		lblLastName.setFont(new Font("Ubuntu Medium", Font.PLAIN, 14));
		lblLastName.setBounds(10, 115, 74, 18);
		contentPane.add(lblLastName);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(138, 43, 226));
		panel.setBounds(0, 0, 434, 39);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Workspace Logon Form");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(102, 11, 245, 21);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("A25-SQUANOVA", Font.PLAIN, 20));

		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(57, 327, 89, 23);
		contentPane.add(btnNewButton);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Manager");
		rdbtnNewRadioButton.setBounds(132, 241, 74, 18);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnManager = new JRadioButton("Worker");
		rdbtnManager.setBounds(230, 241, 74, 18);
		contentPane.add(rdbtnManager);

		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setForeground(Color.WHITE);
		lblDesignation.setFont(new Font("Ubuntu Medium", Font.PLAIN, 14));
		lblDesignation.setBounds(10, 240, 98, 18);
		contentPane.add(lblDesignation);

		JRadioButton rdbtnIntern = new JRadioButton("Intern");
		rdbtnIntern.setBounds(326, 241, 74, 18);
		contentPane.add(rdbtnIntern);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Male", "Female", "Others" }));
		comboBox.setBounds(345, 67, 64, 22);
		contentPane.add(comboBox);

		JSpinner spinner = new JSpinner();
		spinner.setBounds(249, 282, 30, 20);
		contentPane.add(spinner);

		JLabel lblHowManyPc = new JLabel("How many PC you want to acess");
		lblHowManyPc.setForeground(Color.WHITE);
		lblHowManyPc.setFont(new Font("Ubuntu Medium", Font.PLAIN, 14));
		lblHowManyPc.setBounds(10, 282, 209, 18);
		contentPane.add(lblHowManyPc);

		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					String root = "root";
					String pass = "AmanRaut@23102003";
					String url = "jdbc:mysql://localhost:3306/aman";
					Connection con = DriverManager.getConnection(url, root, pass);
					String query = "insert into account(Fname,Lname,Email,Pnum) values(?,?,?,?)";
					PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1, Fname.getText());
					pst.setString(2, Lname.getText());
					pst.setString(3, emailT.getText());
					pst.setString(4, pnum.getText());
					int i = pst.executeUpdate();
					JOptionPane.showMessageDialog(submit, "Done");
					pst.close();
					con.close();

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		submit.setBackground(new Color(0, 191, 255));
		submit.setBounds(291, 327, 89, 23);
		contentPane.add(submit);

	}
}
