import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.Statement;

public class Register extends JFrame {

    private JPanel contentPane;
    private JTextField Usern;
    private JPasswordField Passw;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Register frame = new Register();
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
    public Register() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(30, 144, 255));
        panel_1.setBounds(0, 0, 474, 58);
        panel.add(panel_1);

        JLabel label = new JLabel("G.O.A.T Bank");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Broadway", Font.BOLD, 26));
        label.setBounds(134, 11, 209, 36);
        panel_1.add(label);

        JLabel lblRegister = new JLabel("Register");
        lblRegister.setHorizontalAlignment(SwingConstants.CENTER);
        lblRegister.setFont(new Font("Sitka Small", Font.BOLD, 30));
        lblRegister.setBounds(151, 88, 155, 70);
        panel.add(lblRegister);

        Usern = new JTextField();
        Usern.setColumns(10);
        Usern.setBounds(151, 192, 155, 28);
        panel.add(Usern);

        Passw = new JPasswordField();
        Passw.setBounds(151, 249, 155, 28);
        panel.add(Passw);

        JLabel label_1 = new JLabel("Username:");
        label_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        label_1.setBounds(60, 192, 81, 28);
        panel.add(label_1);

        JLabel label_2 = new JLabel("Password:");
        label_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        label_2.setBounds(60, 248, 81, 28);
        panel.add(label_2);

        JButton btnRegister = new JButton("Register");
        btnRegister.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
            }
        });
        btnRegister.setBounds(327, 328, 89, 23);
        panel.add(btnRegister);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {

                dispose();
                Login log = new Login();
                log.setVisible(true);
            }
        });
        btnCancel.setBounds(220, 328, 89, 23);
        panel.add(btnCancel);
    }
}