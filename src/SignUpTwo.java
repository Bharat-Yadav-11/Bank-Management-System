package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import static bank.management.system.SignUpOne.random;


public class SignUpTwo extends JFrame implements ActionListener {
    JComboBox religionCB, categoryCB, incomeCB, educationCB, occupationCB;
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton syes, sno, exyes, exno;
    SignUpTwo(){
        //To set Background color
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");


        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Arial", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Arial", Font.BOLD, 22));
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        String[] valReligion = { " ", "Hindu", "Muslim", "Sikh", "Christian", "Other"};

        religionCB = new JComboBox(valReligion);
        religionCB.setBounds(300, 140, 400, 30);
        add(religionCB);


        JLabel category = new JLabel("Category :");
        category.setFont(new Font("Arial", Font.BOLD, 22));
        category.setBounds(100, 190, 200, 30);
        add(category);

        String[] valCategory = { " ", "General", "OBC", "SC", "ST", "Other"};
        categoryCB = new JComboBox(valCategory);
        categoryCB.setBounds(300, 190, 400, 30);
        add(categoryCB);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Arial", Font.BOLD, 22));
        income.setBounds(100, 240, 200, 30);
        add(income);

        String[] valIncome = { "Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", ">10,00,000"};

        incomeCB = new JComboBox(valIncome);
        incomeCB.setBounds(300, 240, 400, 30);
        add(incomeCB);

        JLabel Educational = new JLabel("Educational");
        Educational.setFont(new Font("Arial", Font.BOLD, 22));
        Educational.setBounds(100, 290, 200, 30);
        add(Educational);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Arial", Font.BOLD, 22));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);

        String[] valEducation = {"", "Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Other"};

        educationCB = new JComboBox(valEducation);
        educationCB.setBounds(300, 290, 400, 30);
        add(educationCB);


        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Arial", Font.BOLD, 22));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);

        String[] valOccupation = { " ", "Salaried", "Self-Employed", "Business", "Student", "Others"};

        occupationCB = new JComboBox(valOccupation);
        occupationCB.setBounds(300, 390, 400, 30);
        add(occupationCB);



        JLabel panNumber = new JLabel("PAN Number:");
        panNumber.setFont(new Font("Arial", Font.BOLD, 22));
        panNumber.setBounds(100, 440, 200, 30);
        add(panNumber);
        panTextField = new JTextField();
        panTextField.setFont(new Font("Arial", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);


        JLabel aadharNo = new JLabel("Aadhar Number:");
        aadharNo.setFont(new Font("Arial", Font.BOLD, 22));
        aadharNo.setBounds(100, 490, 200, 30);
        add(aadharNo);
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Arial", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);


        JLabel sCitizen = new JLabel("Senior Citizen:");
        sCitizen.setFont(new Font("Arial", Font.BOLD, 22));
        sCitizen.setBounds(100, 540, 200, 30);
        add(sCitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup sCitizenGroup = new ButtonGroup();
        sCitizenGroup.add(syes);
        sCitizenGroup.add(sno);


        JLabel exAccount = new JLabel("Existing Account:");
        exAccount.setFont(new Font("Arial", Font.BOLD, 22));
        exAccount.setBounds(100, 590, 200, 30);
        add(exAccount);

        exyes = new JRadioButton("Yes");
        exyes.setBounds(300, 590, 100, 30);
        exyes.setBackground(Color.WHITE);
        add(exyes);

        exno = new JRadioButton("No");
        exno.setBounds(450, 590, 100, 30);
        exno.setBackground(Color.WHITE);
        add(exno);

        ButtonGroup exAccountGroup = new ButtonGroup();
        exAccountGroup.add(exyes);
        exAccountGroup.add(exno);


        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Arial", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        setSize(850, 800);
        setLocation(350,10);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);


    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SignUpTwo());


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = "" + random;
        String religion = (String) religionCB.getSelectedItem();
        String category = (String) categoryCB.getSelectedItem();
        String income = (String) incomeCB.getSelectedItem();
        String education = (String) educationCB.getSelectedItem();
        String occupation = (String) occupationCB.getSelectedItem();
        String sCitizen = null;
        if(syes.isSelected()) {
            sCitizen = "Yes";
        } else {
            sCitizen = "No";
        }

        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        String exAccount = null;
        if(exyes.isSelected()) {
            exAccount = "Yes";
        } else {
            exAccount = "No";
        }


        try {
            assert religion != null;
            if (religion.isEmpty() || Objects.requireNonNull(category).isEmpty() || Objects.requireNonNull(income).isEmpty() || Objects.requireNonNull(education).isEmpty() || Objects.requireNonNull(occupation).isEmpty() || pan.isEmpty() || aadhar.isEmpty()) {
                JOptionPane.showMessageDialog(null, "All fields are required");
            } else {
                Conn c = new Conn();
                String query = "insert into signuptwo values( '"+formNo+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+sCitizen+"', '"+pan+"', '"+aadhar+"', '"+exAccount+"')";
                c.s.executeUpdate(query);

                //SignUp3 Object
                setVisible(false);
                new SignUpThree().setVisible(true);

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }




    }

}
