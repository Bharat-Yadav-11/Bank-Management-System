package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import static bank.management.system.SignUpOne.random;

public class SignUpThree extends JFrame implements ActionListener {
    JRadioButton sAccount, cAccount, fdAccount, rdAccount;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    SignUpThree() {
        //To set Background color
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        JLabel accountDetails = new JLabel("Page 3: Account Details");
        accountDetails.setFont(new Font("Arial", Font.BOLD, 22));
        accountDetails.setBounds(290, 60, 400, 30);
        add(accountDetails);

        JLabel accountType = new JLabel("Account Type:");
        accountType.setFont(new Font("Arial", Font.BOLD, 22));
        accountType.setBounds(100, 120, 200, 30);
        add(accountType);

        sAccount = new JRadioButton("Saving Account");
        sAccount.setBounds(120, 160, 200, 30);
        sAccount.setBackground(Color.WHITE);
        add(sAccount);

        cAccount = new JRadioButton("Current Account");
        cAccount.setBounds(120, 210, 200, 30);
        cAccount.setBackground(Color.WHITE);
        add(cAccount);

        fdAccount = new JRadioButton("Fixed Deposit Account");
        fdAccount.setBounds(400, 160, 200, 30);
        fdAccount.setBackground(Color.WHITE);
        add(fdAccount);

        rdAccount = new JRadioButton("Recurring Deposit Account");
        rdAccount.setBounds(400, 210, 200, 30);
        rdAccount.setBackground(Color.WHITE);
        add(rdAccount);

        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(sAccount);
        accountGroup.add(cAccount);
        accountGroup.add(fdAccount);
        accountGroup.add(rdAccount);

        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Arial", Font.BOLD, 22));
        card.setBounds(100, 280, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-7152");
        number.setFont(new Font("Arial", Font.BOLD, 22));
        number.setBounds(330, 280, 300, 30);
        add(number);

        JLabel cardDetails = new JLabel("Your 16 Digit Card Number");
        cardDetails.setFont(new Font("Arial", Font.BOLD, 12));
        cardDetails.setBounds(100, 310, 300, 20);
        add(cardDetails);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Arial", Font.BOLD, 22));
        pin.setBounds(100, 350, 300, 30);
        add(pin);

        JLabel pinNumber = new JLabel("XXXX");
        pinNumber.setFont(new Font("Arial", Font.BOLD, 22));
        pinNumber.setBounds(330, 350, 300, 30);
        add(pinNumber);

        JLabel pinDetails = new JLabel("Your 4 Digit Password");
        pinDetails.setFont(new Font("Arial", Font.BOLD, 12));
        pinDetails.setBounds(100, 380, 300, 20);
        add(pinDetails);

        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Arial", Font.BOLD, 22));
        services.setBounds(100, 430, 300, 30);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Arial", Font.BOLD, 12));
        c1.setBounds(120, 480, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Arial", Font.BOLD, 12));
        c2.setBounds(400, 480, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Arial", Font.BOLD, 12));
        c3.setBounds(120, 530, 200, 30);
        add(c3);

        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Arial", Font.BOLD, 12));
        c4.setBounds(400, 530, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Arial", Font.BOLD, 12));
        c5.setBounds(120, 580, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Arial", Font.BOLD, 12));
        c6.setBounds(400, 580, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above fields are correct to the best of my Knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Arial", Font.BOLD, 10));
        c7.setBounds(180, 650, 600, 30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Arial", Font.BOLD, 14));
        submit.setBounds(200, 700, 150, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Arial", Font.BOLD, 14));
        cancel.setBounds(400, 700, 150, 30);
        cancel.addActionListener(this);
        add(cancel);





        setSize(850, 800);
        setLocation(350,10);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

    public static void main(String[] args) {
        new SignUpThree();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = "" + random;
    if (e.getSource() == submit) {
        String accountType = null;
        if (sAccount.isSelected()) accountType = "Saving Account";
        else if (cAccount.isSelected()) accountType = "Current Account";
        else if (fdAccount.isSelected()) accountType = "Fixed Deposit Account";
        else accountType = "Recurring Deposit Account";

        Random random = new Random();
        String cardNumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
        String pinNumber = "" + Math.abs((random.nextLong() % 9000L)+  1000L);

        String facility = "";
        if (c1.isSelected()) facility += "ATM Card";
        else if (c2.isSelected()) facility += "Internet Banking";
        else if (c3.isSelected()) facility += "Mobile Banking";
        else if (c4.isSelected()) facility += "EMAIL & SMS Alerts";
        else if (c5.isSelected()) facility += "Cheque Book";
        else if(c6.isSelected()) facility += "E-Statement";

        try {
            if(accountType.equals("")) {
                JOptionPane.showMessageDialog(null, "Account Type is Required");
            }
            Conn conn = new Conn();
            String query1 = "insert into signupthree values( '"+formNo+"', '"+accountType+"', '"+cardNumber+"', '"+pinNumber+"', '"+facility+"')";
            String query2 = "insert into login values('"+formNo+"', '"+cardNumber+"', '"+pinNumber+"')";
            conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query2);

            JOptionPane.showMessageDialog(null, "Card Number: " + cardNumber + "\n PIN: " + pinNumber);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    } else if (e.getSource() == cancel) {

    }




    }
}
