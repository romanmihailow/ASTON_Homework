public class Main {
    public static void main(String[] args) {

        //dog[0] = new Dog("Бобик");
        Dog dog = new Dog("Бобик");                      //создаем конструктор

        Cat[] cat = new Cat[3];                                //создаем массив котов
        cat[0] = new Cat("Мурзик");
        cat[1] = new Cat("Барсик");
        cat[2] = new Cat("Васька");

        System.out.println("Собака бежит: ");                   //отправляем котов бежать
        dog.run(300);
        dog.run(600);
        dog.run(-50);


        System.out.println("\nКоты бегут: ");                    //коты бегут
        for (int i = 0; i < cat.length; i++) {
            cat[i].run(150);
        }
        cat[0].run(-50);


        Bowl bowl = new Bowl(50);                           //кормим котов
        System.out.println("\nКоты бегут: ");   //коты идут есть
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(bowl, 20);
        }

        System.out.println("\nПроверяем сытость котов: ");         //проверяем сытость котов
        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i].name + " - " + (cat[i].isSatiety()));
        }

        bowl.addFood(30);            //добавляем еды
        cat[2].eat(bowl, 20);     //кормим последнего кота

        Animal.printAnimalCount();           //выводис количество созднных животных
        Cat.printCatCount();                 //выводи моличество созданных котов
        Dog.printDogCount();                 //выводим количество созданных собак
    }


}