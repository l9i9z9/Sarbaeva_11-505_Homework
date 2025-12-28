import java.util.Scanner;

public class task6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int bakingTray = 0;
        System.out.println("Сколько у вас теста? (в граммах)");
        int dough = s.nextInt();
        System.out.println("Сколько у вас шоколада? (в кусочках)");
        int chocolate = s.nextInt();
        while ((dough > 0) & (chocolate > 0)){
            dough -= 100;
            chocolate -= 4;
            bakingTray ++;
        }
        System.out.println("Отделяем кусочек теста, добавляем кусочки шоколада, придаем форму и выкладываем на противень");
        if (bakingTray > 0) {
            System.out.println("Поставить в духовку, подождать 30м. Печенье готово! У вас " + bakingTray + " штук");
        } else {
            System.out.println("Ошибка, мало ингредиентов");
        }
    }
}
