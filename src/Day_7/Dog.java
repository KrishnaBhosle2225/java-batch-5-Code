package Day_7;



public class Dog {

    //states
    public String  name;
    String breed;
    String color;

    //behaviour
    void barking() {
        System.out.println("My dog is barking");
    }

    public void playing() {
        System.out.println("Dog is playing with ball");
    }
    public static void main(String[] args) {

        //object creation
        Dog tommy = new Dog();
        tommy.name = "Tommy";
        tommy.breed = "Labro";
        tommy.color = "golden";

        System.out.println("My dog name is : "+tommy.name);
        System.out.println("My dog breed is : "+tommy.breed);
        System.out.println("My dog color is : "+tommy.color);

        tommy.barking();
        tommy.playing();

    }
}

//public class Cat {
//
//}
