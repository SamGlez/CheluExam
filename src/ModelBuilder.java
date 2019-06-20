
 public class ModelBuilder {
    public String firstName;
    public String lastName;

    public ModelBuilder(String firstName) {
        this.firstName = firstName;
    }

    public ModelBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ModelBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Model build() {
        return new Model (firstName, lastName);

    }

    }


