import javax.swing.*;
import java.awt.*;

public class View {

    // View uses Swing framework to display UI to user
    private JFrame frame;
    private JLabel FirstNameLabel;
    private JLabel LastNameLabel;
    private JTextField FirstNameTextfield;
    private JTextField LastNameTextfield;
    private JButton FirstNameSaveButton;
    private JButton LastNameSaveButton;
    private JButton jokeGenerator;
    private JButton bye;

    public View(String title) {
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 120);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // Create UI elements
        FirstNameLabel = new JLabel("Wannabe-Chuck Name :");
        LastNameLabel = new JLabel("Wannabe-Chuck Last Name :");
        FirstNameTextfield = new JTextField();
        LastNameTextfield = new JTextField();
        FirstNameSaveButton = new JButton("Save Name");
        LastNameSaveButton = new JButton("Save Last Name");
        jokeGenerator = new JButton("JokeGenerator!");
        bye = new JButton("Bye!");

        // Add UI element to frame
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(FirstNameLabel)
                        .addComponent(LastNameLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(FirstNameTextfield)
                        .addComponent(LastNameTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(FirstNameSaveButton)
                        .addComponent(LastNameSaveButton))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jokeGenerator)
                        .addComponent(bye)));
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(FirstNameLabel)
                        .addComponent(FirstNameTextfield).addComponent(FirstNameSaveButton).addComponent(jokeGenerator))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(LastNameLabel)
                        .addComponent(LastNameTextfield).addComponent(LastNameSaveButton).addComponent(bye)));

        layout.linkSize(SwingConstants.HORIZONTAL, FirstNameSaveButton, LastNameSaveButton);
        layout.linkSize(SwingConstants.HORIZONTAL, jokeGenerator, bye);
        frame.getContentPane().setLayout(layout);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getFirstNameLabel() {
        return FirstNameLabel;
    }

    public void setFirstNameLabel(JLabel FirstNameLabel) {
        this.FirstNameLabel = FirstNameLabel;
    }

    public JLabel getLastNameLabel() {
        return LastNameLabel;
    }

    public void setLastNameLabel(JLabel LastNameLabel) {
        this.LastNameLabel = LastNameLabel;
    }

    public JTextField getFirstNameTextfield() {
        return FirstNameTextfield;
    }

    public void setFirstNameTextfield(JTextField FirstNameTextfield) {
        this.FirstNameTextfield = FirstNameTextfield;
    }

    public JTextField getLastNameTextfield() {
        return LastNameTextfield;
    }

    public void setLastNameTextfield(JTextField LastNameTextfield) {
        this.LastNameTextfield = LastNameTextfield;
    }

    public JButton getFirstNameSaveButton() {
        return FirstNameSaveButton;
    }

    public void setFirstNameSaveButton(JButton FirstNameSaveButton) {
        this.FirstNameSaveButton = FirstNameSaveButton;
    }

    public JButton getLastNameSaveButton() {
        return LastNameSaveButton;
    }

    public void setLastNameSaveButton(JButton LastNameSaveButton) {
        this.LastNameSaveButton = LastNameSaveButton;
    }

    public JButton getjokeGenerator() {
        return jokeGenerator;
    }

    public void setjokeGenerator(JButton jokeGenerator) {
        this.jokeGenerator = jokeGenerator;
    }

    public JButton getBye() {
        return bye;
    }

    public void setBye(JButton bye) {
        this.bye = bye;
    }



   //


}