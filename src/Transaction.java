import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Transaction extends JFrame {

    private JPanel contentPane;
    private JTextField usertxt;
    private JTextField montxt;
    public static int R_money;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Transaction frame = new Transaction();
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
    public Transaction() {
        Main M = new Main();
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
        panel_1.setBounds(0, 0, 474, 401);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(0, 0, 474, 58);
        panel_2.setBackground(new Color(30, 144, 255));
        panel_1.add(panel_2);
        panel_2.setLayout(null);

        JLabel label = new JLabel("G.O.A.T Bank");
        label.setBounds(134, 11, 209, 36);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Broadway", Font.BOLD, 26));
        panel_2.add(label);

        usertxt = new JTextField();
        usertxt.setBounds(175, 121, 147, 29);
        panel_1.add(usertxt);
        usertxt.setColumns(10);

        JLabel label11 = new JLabel("Reciver Username:");
        label11.setHorizontalAlignment(SwingConstants.CENTER);
        label11.setFont(new Font("Sitka Subheading", Font.PLAIN, 15));
        label11.setBounds(10, 120, 155, 29);
        panel_1.add(label11);

        montxt = new JTextField();
        montxt.setColumns(10);
        montxt.setBounds(175, 195, 147, 29);
        panel_1.add(montxt);

        JLabel lblMoney = new JLabel("Money:");
        lblMoney.setHorizontalAlignment(SwingConstants.CENTER);
        lblMoney.setFont(new Font("Sitka Subheading", Font.PLAIN, 18));
        lblMoney.setBounds(70, 194, 95, 29);
        panel_1.add(lblMoney);

        JButton btnNewButton = new JButton("Submit");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        btnNewButton.setBounds(340, 320, 89, 23);
        panel_1.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Cancel");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();

            }
        });
        btnNewButton_1.setBounds(241, 320, 89, 23);
        panel_1.add(btnNewButton_1);
    }
}