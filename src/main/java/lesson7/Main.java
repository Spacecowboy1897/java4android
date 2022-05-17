package lesson7;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(20);
        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Pushok", 10);
        catArray[1] = new Cat("Kitty", 5);
        catArray[2] = new Cat("Vaska", 15);
        catArray[3] = new Cat("Petka", 4);
        catArray[4] = new Cat("Kuzka", 9);

        System.out.printf("Сейчас в тарелке %d мышей. Покормим из нее наших зверей\n", plate.getFoodCount() );
        System.out.println();

        for (Cat cat : catArray) {
            cat.eatFromPlate(plate);
        }
        System.out.println();
        System.out.println("Чтобы голодные животные нас не растерзали, предлагаю добавить в тарелку еще пищи!, теперь всем хватит");
        plate.addFood(50); //здесь мы добавили в тарелку 50 мышей
        System.out.printf("Сейчас в тарелке %d мышей. Покормим из нее наших зверей\n", plate.getFoodCount() );
        System.out.println();
        for (Cat cat : catArray) {
            cat.eatFromPlate(plate);
        }

    }
}
