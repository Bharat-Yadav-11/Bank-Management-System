package bank.management.system;
import javax.swing.*;
import java.awt.*;

public class SignUpThree extends JFrame {
    JRadioButton sAccount, cAccount, fdAccount, rdAccount;
    SignUpThree() {
        //To set Background color
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        JLabel accountDetails = new JLabel("Page 2: Account Details");
        accountDetails.setFont(new Font("Arial", Font.BOLD, 22));
        accountDetails.setBounds(290, 80, 400, 30);
        add(accountDetails);

        JLabel accountType = new JLabel("Account Type:");
        accountType.setFont(new Font("Arial", Font.BOLD, 22));
        accountType.setBounds(100, 140, 200, 30);
        add(accountType);

        sAccount = new JRadioButton("Saving Account");
        sAccount.setBounds(100, 180, 200, 30);
        sAccount.setBackground(Color.WHITE);
        add(sAccount);

        cAccount = new JRadioButton("Current Account");
        cAccount.setBounds(100, 230, 200, 30);
        cAccount.setBackground(Color.WHITE);
        add(cAccount);

        fdAccount = new JRadioButton("Fixed Deposit Account");
        fdAccount.setBounds(300, 180, 200, 30);
        fdAccount.setBackground(Color.WHITE);
        add(fdAccount);

        rdAccount = new JRadioButton("Recurring Deposit Account");
        rdAccount.setBounds(300, 230, 200, 30);
        rdAccount.setBackground(Color.WHITE);
        add(rdAccount);

        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(sAccount);
        accountGroup.add(cAccount);
        accountGroup.add(fdAccount);
        accountGroup.add(rdAccount);

        JLabel cardNo = new JLabel("Card Number:");
        cardNo.setFont(new Font("Arial", Font.BOLD, 22));
        cardNo.setBounds(100, 270, 200, 30);
        add(cardNo);



        setVisible(true);
        setSize(850, 800);
        setLocation(350,10);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new SignUpThree();





    }
}
