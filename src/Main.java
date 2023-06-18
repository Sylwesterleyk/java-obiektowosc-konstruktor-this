public class Main {
    public static void main(String[] args) {
        char[] name1 = {'b', 'm', 'w'};
        int price1 = 65345;
        Car c1 = new Car(name1, price1);

        char[] name2 = {'a', 'u', 'd', 'i'};
        int price2 = 145999;
        Car c2 = new Car(name2, price2);

        char[] name3 = {'f', 'i', 'a', 't'};
        int price3 = 43700;
        Car c3 = new Car(name3, price3);

        Car[] cars = {c1, c2, c3};
        for (Car car : cars) {
            System.out.print("Marka samochodu: ");
            for (char c : car.name) {
                System.out.print(c);
            }
            System.out.println();
            System.out.println("Cena: " + car.price);
        }


    }
}
