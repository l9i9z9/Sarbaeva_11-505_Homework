import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Опрос о фильмах");

        System.out.println("Ты любишь смотреть фильмы? (да/нет)");
        String answer1 = scanner.nextLine();
        if (answer1.equals("да")) {
            System.out.println("Отлично! Давай поговорим о фильмах!");
        } else if (answer1.equals("нет")) {
            System.out.println("Жаль... Может, сериалы?");
            return;
        } else {
            System.out.println("Непонятный ответ...");
            return;
        }

        System.out.println("Какой жанр тебе нравится больше?");
        System.out.println("Комедия, драма, фантастика, ужасы или др");
        String genre = scanner.nextLine();

        System.out.println("Как часто ты смотришь фильмы? (напиши цифру)");
        System.out.println("1) Каждый день");
        System.out.println("2) Несколько раз в неделю");
        System.out.println("3) Раз в неделю");
        System.out.println("4) Редко");
        String frequency = scanner.nextLine();

        if (frequency.equals("1")) {
            System.out.println("Ты настоящий киноман!");
        } else if (frequency.equals("2")) {
            System.out.println("Хороший ритм!");
        } else if (frequency.equals("3")) {
            System.out.println("Неплохо!");
        } else if (frequency.equals("4")) {
            System.out.println("Бывает...");
        }

        System.out.println("Какой последний фильм ты смотрел?");
        String lastMovie = scanner.nextLine();
        System.out.println("'" + lastMovie + "' - интересный выбор!");

        System.out.println("Ты хочешь получить рекомендацию фильма? (да/нет)");
        String wantRecommendation = scanner.nextLine();

        if (wantRecommendation.equals("да")) {
            if (genre.equals("1") || genre.equals("Комедия")) {
                System.out.println("Советую посмотреть: 'Один дома'");
            } else if (genre.equals("2") || genre.equals("Драма")) {
                System.out.println("Советую посмотреть: '1 + 1'");
            } else if (genre.equals("3") || genre.equals("Фантастика")) {
                System.out.println("Советую посмотреть: 'Интерстеллар'");
            } else if (genre.equals("4") || genre.equals("Ужасы")) {
                System.out.println("Советую посмотреть: 'Оно'");
            } else {
                System.out.println("Советую посмотреть: 'Побег из Шоушенка'");
            }
        }

        System.out.println("Итог:");
        System.out.println("Твой любимый жанр: " + genre);
        System.out.println("Частота просмотра: " + frequency);
        System.out.println("Последний фильм: " + lastMovie);

    }
}
