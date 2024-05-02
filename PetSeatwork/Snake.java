
public class Snake extends Pet implements Sound, Food {
    public Snake(String petName, String owner) {
        super(petName, owner);
    }

    @Override
    public String makeSound() {
        return "Sssss! Sssss! Sssss!";
    }

    @Override
    public String eat() {
        return "Insects.";
    }
}
