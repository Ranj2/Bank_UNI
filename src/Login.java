import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Login extends JFrame {

    private JPanel contentPane;
    private JTextField Usertxt;
    public boolean ls = false;
    private JPasswordField Passtxt;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
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
    public Login() {
        Main M = new Main();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 479);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(30, 144, 255));
        panel_1.setBounds(0, 0, 474, 58);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblGoatBank = new JLabel("G.O.A.T Bank");
        lblGoatBank.setFont(new Font("Broadway", Font.BOLD, 26));
        lblGoatBank.setForeground(new Color(255, 255, 255));
        lblGoatBank.setHorizontalAlignment(SwingConstants.CENTER);
        lblGoatBank.setBounds(135, 11, 203, 36);
        panel_1.add(lblGoatBank);

        JLabel lblNewLabel = new JLabel("Login");
        lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(151, 85, 155, 70);
        panel.add(lblNewLabel);

        Usertxt = new JTextField();
        Usertxt.setBounds(151, 193, 155, 28);
        panel.add(Usertxt);
        Usertxt.setColumns(10);

        JButton btnNewButton = new JButton("Login");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                Home H = new Home();
                H.setVisible(true);
                dispose();
            }
        });
        btnNewButton.setBounds(347, 371, 89, 23);
        panel.add(btnNewButton);

        JLabel lblNewLabel_1 = new JLabel("Username:");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(60, 193, 81, 28);
        panel.add(lblNewLabel_1);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblPassword.setBounds(60, 249, 81, 28);
        panel.add(lblPassword);

        Passtxt = new JPasswordField();
        Passtxt.setBounds(151, 250, 155, 28);
        panel.add(Passtxt);

        JButton btnRegister = new JButton("Register");
        btnRegister.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                Register rg = new Register();
                rg.setVisible(true);
                dispose();




            }
        });
        btnRegister.setBounds(239, 371, 89, 23);
        panel.add(btnRegister);
    }
}