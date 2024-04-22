package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {
    JButton deposit, withdrawal, fastCash, miniStatement, pinChange, balanceEnq, exit;

    Transactions() {

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 800);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setFont(new Font("Arial", Font.BOLD, 12));
        text.setBounds(235, 250, 700, 35);
        text.setForeground(Color.WHITE);
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setBounds(170, 365, 150, 30);
        image.add(deposit);

        withdrawal = new JButton("Cash Withdrawal");
        withdrawal.setBounds(355, 365, 150, 30);
        image.add(withdrawal);

        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(170, 400, 150, 30);
        image.add(fastCash);

        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(355, 400, 150, 30);
        image.add(miniStatement);

        pinChange = new JButton("Pin Change");
        pinChange.setBounds(170, 435, 150, 30);
        image.add(pinChange);

        balanceEnq = new JButton("Balance Enquiry");
        balanceEnq.setBounds(355, 435, 150, 30);
        image.add(balanceEnq);

        exit = new JButton("Exit");
        exit.setBounds(355, 470, 150, 30);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900, 900);
        setLocation(300, 0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
        new Transactions();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit) {
            System.exit(0);
        }





    }
}
