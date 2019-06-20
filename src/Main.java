public class Main {

    public static void main(String[] args) {
        // Assemble all the pieces of the MVC
       // Model m = new Model("Chuck", "Norris");
        Model m = new ModelBuilder("Ellen").setLastName ("Degeneres").build();
        View v = new View("Wannabe Chuck Norris");
        Controller c = new Controller(m, v);
        c.initController();
    }

}
