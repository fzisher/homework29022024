class Animal {
    protected String name;
    protected int run;
    protected int swim;

    public Animal(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public void run(int distance) {
        if (distance <= run) {
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " метров.");
        }
    }

    public void swim(int distance) {
        if (swim == 0) {
            System.out.println(name + " не умеет плавать.");
        } else if (distance <= swim) {
            System.out.println(name + " проплыл " + distance + " метров.");
        } else {
            System.out.println(name + " не может проплыть " + distance + " метров.");
        }
    }
}

class Dog extends Animal {
    private static int count = 0;

    public Dog(String name) {
        super(name, 500, 10);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

class Cat extends Animal {
    private static int count = 0;

    public Cat(String name) {
        super(name, 200, 0);
        count++;
    }

    public static int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Шарик");
        Cat catBarsik = new Cat("Дыня");

        dogBobik.run(150);
        dogBobik.swim(5);

        catBarsik.run(250);
        catBarsik.swim(5);

        System.out.println("Количество собак: " + Dog.getCount());
        System.out.println("Количество котов: " + Cat.getCount());
    }
}