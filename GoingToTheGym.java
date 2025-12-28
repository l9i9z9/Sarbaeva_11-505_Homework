import java.util.Random;
import java.util.Scanner;

public class task8 {
    static int energy = 100;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Это симулятор похода в спортзал");
        System.out.println("Твоя энергия: " + energy);

        boolean inGame = true;

        while (inGame && energy > 0) {
            System.out.println("Куда пойдем?");
            System.out.println("1 - Пойти в зал");
            System.out.println("2 - Выпить протеин");
            System.out.println("3 - Проверить энергию");
            System.out.println("4 - Закончить игру");
            System.out.print("Твой выбор: ");

            String choice = scan.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Ты в спортзале. Что будешь делать?");
                    gymChoice(scan, rand);
                    break;

                case "2":
                    if (energy < 100) {
                        energy += 30;
                        if (energy > 100) energy = 100;
                        System.out.println("Выпил протеин. Энергия +30");
                        System.out.println("Энергия: " + energy);
                    } else {
                        System.out.println("У тебя и так полная энергия");
                    }
                    break;

                case "3":
                    System.out.println("Твоя энергия: " + energy);
                    break;

                case "4":
                    System.out.println("Возвращайся завтра");
                    inGame = false;
                    break;

                default:
                    System.out.println("Выбери от 1 до 4");
            }

            if (energy <= 0) {
                System.out.println("Ты слишком устал, пора домой отдыхать");
                inGame = false;
            }
        }
        scan.close();
    }

    public static void gymChoice(Scanner scan, Random rand) {
        System.out.println("1 - Качать бицепс -20 энергии");
        System.out.println("2 - Бегать на дорожке -15 энергии");
        System.out.println("3 - Пойти в душ +10 энергии");
        System.out.println("4 - Вернуться");
        System.out.print("Твой выбор: ");

        String choice = scan.nextLine();

        switch (choice) {
            case "1":
                if (energy >= 20) {
                    energy -= 20;
                    System.out.println("Ты сделал 3 подхода, молодец");
                    System.out.println("Энергия: " + energy);

                    if (rand.nextInt(100) < 30) {
                        System.out.println("Тренер похвалил тебя, молодец");
                    }
                } else {
                    System.out.println("Слишком мало энергии для тренировки");
                }
                break;

            case "2":
                if (energy >= 15) {
                    energy -= 15;
                    System.out.println("Ты пробежал 2 км, молодец");
                    System.out.println("Энергия: " + energy);
                } else {
                    System.out.println("Слишком мало энергии для бега");
                }
                break;

            case "3":
                if (energy <= 90) {
                    energy += 10;
                    System.out.println("Освежился в душе, энергия +10");
                    System.out.println("Энергия: " + energy);
                } else {
                    System.out.println("Ты и так полон сил!");
                }
                break;

            case "4":
                System.out.println("Возвращаемся");
                break;

            default:
                System.out.println("Выбери от 1 до 4");
        }
    }
}

