public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog("Brownie", "Shania");
        System.out.println("The dog's name is " + dog.getPetName());
        System.out.println("The owner's name is " + dog.getOwner());
        System.out.println("The sound that a dog makes is " + ((Sound) dog).makeSound());
        System.out.println("The dog is eating " + ((Food) dog).eat());
        System.out.println();

        Pet snake = new Snake("Tom", "Miguel");
        System.out.println("The snake's name is " + snake.getPetName());
        System.out.println("The owner's name is " + snake.getOwner());
        System.out.println("The sound that a dog makes is " + ((Sound) snake).makeSound());
        System.out.println("The snake is eating " + ((Food) snake).eat());
    }
}
