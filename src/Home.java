import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

public class Home extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Home frame = new Home();
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
    public Home() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 964, 550);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(30, 144, 255));
        panel_1.setBounds(0, 0, 938, 75);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblGoatBank = new JLabel("G.O.A.T Bank");
        lblGoatBank.setForeground(new Color(255, 255, 255));
        lblGoatBank.setFont(new Font("Broadway", Font.BOLD, 50));
        lblGoatBank.setHorizontalAlignment(SwingConstants.CENTER);
        lblGoatBank.setBounds(262, 0, 414, 75);
        panel_1.add(lblGoatBank);

        JLabel My_acc = new JLabel("New label");
        My_acc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        My_acc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                Transaction Ta = new Transaction();
                Ta.setVisible(true);
            }
        });
        My_acc.setIcon(new ImageIcon("C:\\Users\\ranj9\\Desktop\\Presintation\\Transaction_r.png"));
        My_acc.setBounds(50, 150, 150, 150);
        panel.add(My_acc);

        JLabel Transfer = new JLabel("New label");
        Transfer.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Transfer.setForeground(Color.WHITE);
        Transfer.setBackground(Color.WHITE);
        Transfer.setIcon(new ImageIcon("C:\\Users\\ranj9\\Desktop\\Presintation\\deposit_r.png"));
        Transfer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }
        });
        Transfer.setBounds(250, 150, 150, 150);
        panel.add(Transfer);
    }
}
