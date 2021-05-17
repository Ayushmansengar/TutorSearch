import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUILayout{
    public static void main(String[] args)
    {

        //Frame Start
        JFrame frame =new JFrame("TutorDhundo");
        frame.setSize(800,800);
        frame.setBackground(Color.CYAN);
        frame.setVisible(true);
        //frame.pack();
        frame.setLayout(null);
        //Frame Ends

        //Panels Initialization
        Panel mainPanel = new Panel();
        mainPanel.setBounds(0,100,800,700);
        mainPanel.setBackground(Color.CYAN);
        Panel Start = new Panel();
        Start.setBackground(Color.CYAN);
        Panel selectionPanel = new Panel();
        selectionPanel.setBackground(Color.CYAN);
        Panel teacherPanel = new Panel(new GridLayout(7,1));
        teacherPanel.setBackground(Color.CYAN);
        Panel studentPanel = new Panel(new GridLayout(5,1));
        studentPanel.setBackground(Color.CYAN);
        selectionPanel.setBounds(0,0,800,100);
        Panel teacher_detail = new Panel(new GridLayout(2,1));
        teacher_detail.setBackground(Color.CYAN);
        //Panels Ends

        CardLayout cardLayout1= new CardLayout();
        mainPanel.setLayout(cardLayout1);

        //mainPanel Start
        mainPanel.add(Start, "Panel1");
        mainPanel.add(teacherPanel,"Panel2");
        mainPanel.add(studentPanel, "Panel3");
        mainPanel.add(teacher_detail,"Panel4");
        //mainPanel Ends

        //TeachersPanel Start
        Panel Heading = new Panel();
        Heading.setBackground(Color.CYAN);
        JLabel Label1 = new JLabel("New Registration!!!");
        Label1.setFont(new Font("Verdana", Font.PLAIN, 20));
        Label1.setForeground(Color.BLUE);
        Heading.add(Label1);

        Panel Content = new Panel();
        Content.setBackground(Color.CYAN);
        JLabel Label2 = new JLabel("Name", JLabel.LEADING);
        Label2.setFont(new Font("Verdana", Font.BOLD, 14));
        JTextField textField1 = new JTextField(JTextField.LEADING);
        String n = textField1.getText();
        textField1.setSize(50 , 50);
        Content.add(Label2);
        Content.add(textField1);

        Panel Content1 = new Panel();
        Content1.setBackground(Color.CYAN);
        JLabel Label3 = new JLabel("Subject");
        Label3.setFont(new Font("Verdana", Font.BOLD, 14));
        JTextField textField2 = new JTextField(JTextField.LEADING);
        String s = textField2.getText();
        Content1.add(Label3);
        Content1.add(textField2);

        JPanel Content2 = new JPanel();
        Content2.setBackground(Color.CYAN);
        JLabel Label4 = new JLabel("Class");
        Label4.setFont(new Font("Verdana", Font.BOLD, 14));
        JTextField textField3 = new JTextField(JTextField.LEADING);
        String c = textField3.getText();
        Content2.add(Label4);
        Content2.add(textField3);

        Panel Content3 = new Panel();
        JLabel Label5 = new JLabel("Locality");
        Label5.setFont(new Font("Verdana", Font.BOLD, 14));
        JTextField textField4 = new JTextField(JTextField.LEADING);
        String l = textField4.getText();
        Content3.add(Label5);
        Content3.add(textField4);

        Panel Content4 = new Panel();
        JLabel Label6 = new JLabel("PhoneNo.");
        Label6.setFont(new Font("Verdana", Font.BOLD, 14));
        JTextField textField5 = new JTextField(JTextField.LEADING);
        String p = textField5.getText();
        Content4.add(Label6);
        Content4.add(textField5);

        Panel Submit1 = new Panel();
        Submit1.setBackground(Color.CYAN);
        JButton b1=new JButton("Register Now!");
        b1.setSize(10,5);
        Submit1.add(b1);

        JTextArea data = new JTextArea();
        data.setBackground(Color.LIGHT_GRAY);
        data.setFont(new Font("Verdana", Font.BOLD, 16));
        teacher_detail.add(data);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                cardLayout1.show(mainPanel,"Panel4");

                data.setText("Name"+"\t");
                data.append(textField1.getText());
                data.append("\nSubject"+"\t");
                data.append(textField2.getText());
                data.append("\nClass"+"\t");
                data.append(textField3.getText());
                data.append("\nLocality"+"\t");
                data.append(textField4.getText());
                data.append("\nPhoneNo."+"\t");
                data.append(textField5.getText());
                data.append("\n\n\t\t*****Registration Successful*****"+"\t");
            }
        });
        teacherPanel.add(Heading);
        teacherPanel.add(Content);
        teacherPanel.add(Content1);
        teacherPanel.add(Content2);
        teacherPanel.add(Content3);
        teacherPanel.add(Content4);
        teacherPanel.add(Submit1);
        //TeacherPanel Ends

        String[] a ={"R kumar","Maths","9th","Sec 125","2233445566"};
        String[] b ={"R P Jaiswal","Chem","11th","Sec 75","4567896745"};

        //StudentsPanel Start
        JPanel Spanel4 = new JPanel();
        Spanel4.setBackground(Color.CYAN);
        JLabel Label8 = new JLabel("Locality");
        Label8.setFont(new Font("Verdana",Font.BOLD, 14));
        JComboBox comboBox4= new JComboBox();
        comboBox4.addItem("--SELECT--");
        comboBox4.addItem("Sec 125");
        comboBox4.addItem("Sec 75");
        comboBox4.addItem("Sec 35");
        comboBox4.addItem("Sec 65");
        String locality = (String)comboBox4.getSelectedItem();
        Spanel4.add(Label8);
        Spanel4.add(comboBox4);

        JPanel Spanel5 = new JPanel();
        Spanel5.setBackground(Color.CYAN);
        Spanel5.setLayout(new FlowLayout());
        JButton Sbutton = new JButton("Find");
        Sbutton.setSize(5,5);
        Spanel5.add(Sbutton);
        Sbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(((String)comboBox4.getSelectedItem())==a[3])
                {
                    cardLayout1.show(mainPanel,"Panel4");
                    data.setText("Name"+"\t");
                    data.append(a[0]);
                    data.append("\nSubject"+"\t");
                    data.append(a[1]);
                    data.append("\nClass"+"\t");
                    data.append(a[2]);
                    data.append("\nLocality"+"\t");
                    data.append(a[3]);
                    data.append("\nPhoneNo."+"\t");
                    data.append(a[4]);

                }else if(((String)comboBox4.getSelectedItem())==b[3])
                {
                    cardLayout1.show(mainPanel,"Panel4");
                    data.setText("Name"+"\t");
                    data.append(b[0]);
                    data.append("\nSubject"+"\t");
                    data.append(b[1]);
                    data.append("\nClass"+"\t");
                    data.append(b[2]);
                    data.append("\nLocality"+"\t");
                    data.append(b[3]);
                    data.append("\nPhoneNo."+"\t");
                    data.append(b[4]);
                }
                else
                {
                    cardLayout1.show(mainPanel,"Panel4");
                    data.setText("\t\t******No Data Available******"+"\t");
                }
            }
        });
        studentPanel.add(Spanel4);
        studentPanel.add(Spanel5);
        //StudentsPanel Ends
        //selectionPanel Starts
        JButton button1 = new JButton("Submit");
        JRadioButton radioButton1 = new JRadioButton("Teacher");
        radioButton1.setBackground(Color.CYAN);
        JRadioButton radioButton2 = new JRadioButton("Student");
        radioButton2.setBackground(Color.CYAN);
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(radioButton1.isSelected())
                {
                    cardLayout1.show(mainPanel,"Panel2");
                }
                if(radioButton2.isSelected())
                {
                    cardLayout1.show(mainPanel,"Panel3");
                }
            }
        });
        JButton b2= new JButton("Back");
        b2.setSize(10,5);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout1.show(mainPanel,"Panel1");
            }
        });
        //selectionPanel Ends
        selectionPanel.add(radioButton1);
        selectionPanel.add(radioButton2);
        selectionPanel.add(button1);
        selectionPanel.add(b2);
        selectionPanel.setVisible(true);
        mainPanel.setVisible(true);
        frame.add(selectionPanel, BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.SOUTH);
    }
}