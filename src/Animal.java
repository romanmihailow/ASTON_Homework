public class Animal {
    String name;
    static int animalCount=0;


    public Animal(String name) {
        this.name = name;
        animalCount++;

    }


    public void run(int distance) {
        if (distance <= 0 ) {
            System.out.println(name + " дистанция не может быть отрицательной или равна нулю");
        } else {
            System.out.println(name + " пробежал " + distance + "метров");
        }
    }



    public void swim(int distance) {
        if (distance <= 0 ) {
            System.out.println(name + " дистанция не может быть отрицательной или равна нулю");
        } else {
            System.out.println(name + " пробежал " + distance + "метров");
        }
    }





    public static void printAnimalCount() {
        System.out.println("\nВсего животных создано: " + animalCount);
    }
}

class Cat extends Animal {
    static final int runLimit=200;
    static int catCount=0;
    boolean satiety = false;         // Кот голодный

    public Cat(String name) {
        super(name);
        catCount++;

    }

    @Override
    public void run(int distance) {
        if (distance <= 0) {
            System.out.println(" дистанция не может быть отрицательной или равна нулю");
        } else if (distance > runLimit) {
            System.out.println(name + " не может пробежать " + distance + "метров");
        } else  {
            System.out.println(name + " пробежал " + distance + "метров");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + "не умеет плавать");
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.getFood()>=foodAmount){
            bowl.decreaseFood(foodAmount);
            satiety = true;
            System.out.println(name + " поел и теперь сыт");
        } else {
            System.out.println(name + "не смог поесть, еды недостаточно");
        }

    }

    public boolean isSatiety() {
        return satiety;
    }

    public static void printCatCount(){
        System.out.println("Всего котов: " + catCount);
    }





}

class Dog extends Animal {
    static final int runLimit =500;
    static final int swimLimit =10;
    static int dogCount=0;

    public Dog(String name) {
        super(name);
        dogCount++;

    }


    @Override
    public void run(int distance) {
        if (distance <= 0) {
            System.out.println(" дистанция не может быть отрицательной или равна нулю");
        } else if (distance > runLimit) {
            System.out.println(name + " не может пробежать " + distance + "метров");
        } else  {
            System.out.println(name + " пробежал " + distance + "метров");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 0) {
            System.out.println(" дистанция не может быть отрицательной или равна нулю");
        } else if (distance > swimLimit) {
            System.out.println(name + " не может проплыть " + distance + "метров");
        } else  {
            System.out.println(name + " проплыл " + distance + "метров");
        }
    }

    public static void printDogCount() {
        System.out.println("Всего собак: " + dogCount);
    }
}

class Bowl {
    int food;


    public Bowl(int food) {
        this.food = food;
    }

    public void decreaseFood(int amount) {       //коты едят, еда убавляется
        food -= amount;
    }

    public void addFood(int amount) {            //обавляем еду в миску
        food += amount;
        System.out.println("В миску добавили: " + amount + " еды. Теперь в миске: " + food);
    }

    public int getFood() {
        return food;
    }




}