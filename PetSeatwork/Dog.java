public class Dog extends Pet implements Sound, Food {
    public Dog(String petName, String owner) {
        super(petName, owner);
    }

    @Override
    public String makeSound() {
        return "Aw! Aw! Aw!";
    }

    @Override
    public String eat() {
        return "Eating dog food.";
    }
}
