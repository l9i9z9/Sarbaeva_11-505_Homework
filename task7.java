import java.util.regex.*;
public class task7 {
    public static void main(String[] args) {
        a1("аргентина манит негра");
        a2("hello");
        a3("sweettooth");
        System.out.println(a4("alligator"));
        System.out.println(a5(" аргентина  манит   негра  "));
        a6("HELLO", "hello");
        a7("89991234567");
        a8("-20, 57.69, 350");
        System.out.println(a9("  Пробелы      пробелы    пробелы  "));
        a10("my@email.com");
        System.out.println(a11("Молоко", 68.50));
        String[] arr = {"a", "b", "c"};
        System.out.println(a12(arr));
    }

    // 1
    public static void a1(String s) {
        String lower = s.toLowerCase();
        boolean t = true;
        int i = 0, j = lower.length() - 1;
        while (i <= j) {
            if (lower.charAt(i) != lower.charAt(j)) {
                t = false;
                break;
            }
            i++; j--;
        }
        System.out.println(t ? "Палиндром" : "Не палиндром");
    }

    // 2
    public static void a2(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (result.indexOf(s.charAt(i)) == -1) result += s.charAt(i);
        }
        System.out.println(result);
    }

    // 3
    public static void a3(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                System.out.println(s.charAt(i));
                return;
            }
        }
        System.out.println("Нет");
    }

    // 4
    public static String a4(String s) {
        return s.replace('a', '@').replace('A', '@');
    }

    // 5
    public static int a5(String s) {
        return s.trim().split("\\s+").length;
    }

    // 6
    public static void a6(String s, String a) {
        System.out.println(s.equalsIgnoreCase(a) ? "Равны" : "Не равны");
    }

    // 7
    public static void a7(String s) {
        String clean = s.replaceAll("[\\s()\\-]", "");
        boolean valid = clean.matches("(\\+7|8|7)\\d{10}");
        System.out.println(valid ? "Номер РФ" : "Не номер РФ");
    }

    // 8
    public static void a8(String s) {
        Matcher m = Pattern.compile("-?\\d+(\\.\\d+)?").matcher(s);
        while (m.find()) System.out.print(m.group() + " ");
        System.out.println();
    }

    // 9
    public static String a9(String s) {
        return s.trim().replaceAll("\\s+", " ");
    }

    // 10
    public static void a10(String s) {
        boolean valid = s.matches("\\w+@\\w+\\.\\w+");
        System.out.println(valid ? "Почта норм" : "Почта не норм");
    }

    // 11
    public static String a11(String name, double price) {
        return String.format("Товар: %s, Цена: %.2f руб.", name, price);
    }

    // 12
    public static String a12(String[] arr) {
        return String.join("; ", arr);
    }
}
