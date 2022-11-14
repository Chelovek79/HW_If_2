public class Main {
    public static void main(String[] args) {
// Задание 2.1.
        int AgeUser = 17;
        if (AgeUser >= 18) {
            System.out.println("Возраст " + AgeUser + ". Поздравляем !!! Вы - совершеннолетний ;)))");
        } else {
            System.out.println("Возраст " + AgeUser + ". Подрасти дружок ;(");
        }
        System.out.println("---------------------------");

// Задание 2.2.
        int HumanAge = 45;
        System.out.print("Возраст человеческого детёныша " + HumanAge);
        if (HumanAge < 7) {
            System.out.println(". Дитё...");
        } else {
            if (HumanAge >= 7) {
                if (HumanAge < 18) {
                    System.out.println(". Ребёнок может посещать школьные занятия.");
                } else {
                    if (HumanAge >= 18) {
                         if (HumanAge < 24) {
                            System.out.println(". Подросток может посещать занятия в университете.");
                        } else {
                            if (HumanAge >= 24) {
                                System.out.println(". Welcome to ... - работай.");
                            }
                        }
                    }
                }
            }
        }
        System.out.println("---------------------------");

// Задание 2.3.
        int PopulationWagon = 102;
        int Seating = 60;
        int Passengers = 99;
        if (Passengers < Seating) {
            System.out.println("В вагоне осталось " + (Seating - Passengers) + " сидячих мест и " +
                    (102 - 60) + " стоячих места");
        } else {
        if (Passengers >= Seating) {
            if (Passengers < PopulationWagon)
                System.out.println("В вагоне осталось " + (PopulationWagon - Passengers) + " стоячих места");
        }
        }
        if (Passengers >= PopulationWagon) {
            System.out.println("Вагон заполнен - возможна давка...");
        } else {
            System.out.println("Вам достанется свой квадратный метр. Приятной поездки.");
        }
        System.out.println("---------------------------");

    }
}