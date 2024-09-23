package Day_10;


//examle of Hierarchical Inheritance
public class Animal {

    void getAnimal() {
        System.out.println("I am in animal class");
    }
}

class Human extends Animal{

    void getHuman() {
        System.out.println("I am in Human class");
    }

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.getHuman();
    }
}

class Cat extends Animal{
    void getCat() {
        System.out.println("I am in Cat class");
    }
}

class Dog extends Animal{

    void getDog() {
        System.out.println("I am in Dog class");
    }
}
