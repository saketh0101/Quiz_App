import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizApplication1 extends JFrame implements ActionListener {
    // JFrame used for designing purposes.
    JLabel label;
    JRadioButton radioButtons[] = new JRadioButton[5]; // options for every question
    JButton btnNext, btnResult; // creating button
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1;
    int m[] = new int[10]; // creating the number of questions

    QuizApplication1(String s) {
        super(s);
        label = new JLabel(); // JLabel is a Swing component used to display a text or an image.
        add(label); // add() method is typically used to add components to a container in
                    // Swing-based user interface development.
        bg = new ButtonGroup(); // ButtonGroup is used to group radio buttons together so
        // that only one radio button can be selected at a time within the group.
        for (int i = 0; i < 5; i++) {
            radioButtons[i] = new JRadioButton(); // JRadioButton is a Swing component used to create radio buttons.
            add(radioButtons[i]); // creating number of radio buttons in container
            bg.add(radioButtons[i]); // adding it to a single group so that only one can be selected
        }
        btnNext = new JButton("Next"); // next and result buttons to go
        btnResult = new JButton("Result"); // for next question and to get the result
        btnResult.setVisible(false); // we are making it false so that it won't be visible at first.
        btnResult.addActionListener(this); // When the button is clicked, an action event will be triggered, and the
                                           // listener will be notified.
        btnNext.addActionListener(this); // The addActionListener() method is used to add an ActionListener to the
                                         // button, and
        // the argument this indicates that the current object (the one containing this
        // code) is the ActionListener.

        add(btnNext); // adding the next and result button to container.
        add(btnResult);
        setData();
        label.setBounds(30, 40, 900, 20);
        radioButtons[0].setBounds(50, 80, 450, 20);
        radioButtons[1].setBounds(50, 110, 200, 20);
        radioButtons[2].setBounds(50, 140, 200, 20);
        radioButtons[3].setBounds(50, 170, 450, 20);
        btnNext.setBounds(100, 240, 100, 30);
        btnResult.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);

    }

    void setData() { // method for setting questions and options also
        radioButtons[4].setSelected(true);
        if (current == 0) {
            label.setText("Question 1: Which of the following is a popular front-end JavaScript framework?"); // inserting
                                                                                                              // text in
                                                                                                              // a label
                                                                                                              // and
                                                                                                              // radio
                                                                                                              // buttons.
            radioButtons[0].setText("a) React");
            radioButtons[1].setText("b) Spring");
            radioButtons[2].setText("c) Django");
            radioButtons[3].setText("d) Node.js");

        }
        if (current == 1) {
            label.setText("Question 2: Which technology is used for creating decentralized applications (dApps)?"); // inserting
                                                                                                                    // text
                                                                                                                    // in
                                                                                                                    // a
                                                                                                                    // label
                                                                                                                    // and
                                                                                                                    // radio
                                                                                                                    // buttons.
            radioButtons[0].setText("a) Blockchain");
            radioButtons[1].setText("b) Machine Learning");
            radioButtons[2].setText("c) Artificial Intelligence");
            radioButtons[3].setText("d) Cloud Computing");

        }
        if (current == 2) {
            label.setText(
                    "Question 3: Which programming language is commonly used for developing machine learning models?"); // inserting
                                                                                                                        // text
                                                                                                                        // in
                                                                                                                        // a
                                                                                                                        // label
                                                                                                                        // and
                                                                                                                        // radio
                                                                                                                        // buttons.
            radioButtons[0].setText("a) Python");
            radioButtons[1].setText("b) Java");
            radioButtons[2].setText("c) C++");
            radioButtons[3].setText("d) Ruby");

        }
        if (current == 3) {
            label.setText("Question 4: What is the purpose of Docker?"); // inserting text in a label and radio buttons.
            radioButtons[0].setText("a) Virtualization");
            radioButtons[1].setText("b) Cloud storage");
            radioButtons[2].setText("c) Containerization");
            radioButtons[3].setText("d) Web development");

        }
        if (current == 4) {
            label.setText(
                    "Question 5: Which technology is used for real-time communication between web browsers and servers?"); // inserting
                                                                                                                           // text
                                                                                                                           // in
                                                                                                                           // a
                                                                                                                           // label
                                                                                                                           // and
                                                                                                                           // radio
                                                                                                                           // buttons.
            radioButtons[0].setText("a) WebSockets");
            radioButtons[1].setText("b) Restful API");
            radioButtons[2].setText("c) GraphQL");
            radioButtons[3].setText("d) SOAP");

        }
        if (current == 5) {
            label.setText(
                    "Question 6: Which of the following is an open-source relational database management system?"); // inserting
                                                                                                                    // text
                                                                                                                    // in
                                                                                                                    // a
                                                                                                                    // label
                                                                                                                    // and
                                                                                                                    // radio
                                                                                                                    // buttons.
            radioButtons[0].setText("a) MySQL");
            radioButtons[1].setText("b) MongoDB");
            radioButtons[2].setText("c) Redis");
            radioButtons[3].setText("d) Elasticsearch");

        }
        if (current == 6) {
            label.setText(
                    "Question 7: Which technology is used for building native mobile applications for iOS and Android platforms?"); // inserting
                                                                                                                                    // text
                                                                                                                                    // in
                                                                                                                                    // a
                                                                                                                                    // label
                                                                                                                                    // and
                                                                                                                                    // radio
                                                                                                                                    // buttons.
            radioButtons[0].setText("a) Flutter");
            radioButtons[1].setText("b) React Native");
            radioButtons[2].setText("c) Angular");
            radioButtons[3].setText("d) Xamarin");

        }
        if (current == 7) {
            label.setText("Question 8: What is the purpose of Kubernetes?"); // inserting text in a label and radio
                                                                             // buttons.
            radioButtons[0].setText("a) Container orchestration");
            radioButtons[1].setText("b) Machine learning");
            radioButtons[2].setText("c) Serverless computing");
            radioButtons[3].setText("d) Data visualization");

        }
        if (current == 8) {
            label.setText("Question 9: Which cloud computing provider offers services such as EC2, S3, and Lambda?"); // inserting
                                                                                                                      // text
                                                                                                                      // in
                                                                                                                      // a
                                                                                                                      // label
                                                                                                                      // and
                                                                                                                      // radio
                                                                                                                      // buttons.
            radioButtons[0].setText("a) Amazon Web Services (AWS)");
            radioButtons[1].setText("b) Microsoft Azure");
            radioButtons[2].setText("c) Google Cloud Platform (GCP)");
            radioButtons[3].setText("d) IBM Cloud");

        }
        if (current == 9) {
            label.setText(
                    "Question 10: Which programming language is commonly used for developing smart contracts on blockchain platforms?"); // inserting
                                                                                                                                         // text
                                                                                                                                         // in
                                                                                                                                         // a
                                                                                                                                         // label
                                                                                                                                         // and
                                                                                                                                         // radio
                                                                                                                                         // buttons.
            radioButtons[0].setText("a) Solidity");
            radioButtons[1].setText("b) JavaScript");
            radioButtons[2].setText("c) Swift");
            radioButtons[3].setText("d) Go");

        }
        label.setBounds(30, 40, 600, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++) {
            radioButtons[j].setBounds(50, 80 + i, 450, 20);
        }

    }

    boolean checkAnswer() { // method to set the right option as correct answers
        if (current == 0) {
            return (radioButtons[0].isSelected());
        }
        if (current == 1) {
            return (radioButtons[0].isSelected());
        }
        if (current == 2) {
            return (radioButtons[0].isSelected());
        }
        if (current == 3) {
            return (radioButtons[2].isSelected());
        }
        if (current == 4) {
            return (radioButtons[0].isSelected());
        }
        if (current == 5) {
            return (radioButtons[0].isSelected());
        }
        if (current == 6) {
            return (radioButtons[1].isSelected());
        }
        if (current == 7) {
            return (radioButtons[0].isSelected());
        }
        if (current == 8) {
            return (radioButtons[0].isSelected());
        }
        if (current == 9) {
            return (radioButtons[0].isSelected());
        }

        return false;
    }

    public static void main(String[] args) {
        new QuizApplication1("A Quiz Application");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext) { // going to next question after clicking on every question.
            if (checkAnswer()) {
                count += 1; // grade for correct answer
            }
            current++;
            setData();
            if (current == 9) {
                btnNext.setEnabled(false); // making next button disabled after 10th question
                btnResult.setVisible(true); // making result button visible after 10th question
                btnResult.setText("Result");
            }
        }
        if (e.getActionCommand().equals("Result")) {
            if (checkAnswer())
                count += 1;
            current++;
            JOptionPane.showMessageDialog(this, "Your grade is " + count + " out of 10");
            System.exit(0); // exit the application

        }

    }
}