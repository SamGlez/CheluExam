import javax.swing.*;

public class Controller {

    private Model model;
    private View view;
    private ModelBuilder ModelBuilder;
    private Response response;


    public Controller(Model m, View v) {
        model = m;
        view = v;
    }

    public void initView() {
        view.getFirstNameTextfield().setText(model.getFirstName());
        view.getLastNameTextfield().setText(model.getLastName());
    }

    public void initController() {
        view.getFirstNameSaveButton().addActionListener(e -> saveFirstname());
        view.getLastNameSaveButton().addActionListener(e -> saveLastname());
        view.getjokeGenerator().addActionListener(e -> generateJoke());
        view.getBye().addActionListener(e -> sayBye());
    }

    private void saveFirstname() {
        model.setFirstName(view.getFirstNameTextfield().getText());
        JOptionPane.showMessageDialog(null, "Name saved : " + model.getFirstName(), "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void saveLastname() {
        model.setLastName(view.getLastNameTextfield().getText());
        JOptionPane.showMessageDialog(null, "Category saved : " + model.getLastName(), "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void generateJoke() {
        Connection connection = new Connection(model.getFirstName(), model.getLastName());
        String jsonData = connection.request();
        System.out.println(jsonData);
        //String joke = Parser.parse(jsonData);
       // System.out.println(joke);
        JOptionPane.showMessageDialog(null, "Hello " + model.getFirstName() +  model.getLastName() + ", You built the hospital you were born in.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void sayBye() {
        JOptionPane.showMessageDialog(null, "Bye, Great Wannabe Chuck. But there's only one real one.", "Info", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }


}
