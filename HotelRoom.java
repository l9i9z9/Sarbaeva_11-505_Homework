abstract class HotelRoom {
    private int roomNumber;
    private String category;
    private String status;

    private static int roomCount = 0;

    public HotelRoom(int roomNumber, String category) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.status = "Свободен";
        roomCount++;
    }

    public abstract String getRoomInfo();
    public abstract void displayFeatures();
    public static int getRoomCount() {
        return roomCount;
    }


    public int getRoomNumber() {
        return roomNumber;
    }
    public String getCategory() {
        return category;
    }
    public String getStatus() {
        return status;
    }


    public boolean checkIn() {
        if ("Свободен".equals(status)) {
            status = "Занят";
            System.out.println("Гость успешно заселён в номер " + roomNumber);
            return true;
        } else {
            System.out.println("Нельзя заселить гостя. Номер " + roomNumber +
                    " имеет статус: " + status);
            return false;
        }
    }

    public boolean checkOut() {
        if ("Занят".equals(status)) {
            status = "На уборке";
            System.out.println("Гость выселен из номера " + roomNumber +
                    ". Комната переведена в статус 'На уборке'");
            return true;
        } else {
            System.out.println("Нельзя выселить гостя. Номер " + roomNumber +
                    " имеет статус: " + status);
            return false;
        }
    }

    public boolean completeCleaning() {
        if ("На уборке".equals(status)) {
            status = "Свободен";
            System.out.println("Уборка номера " + roomNumber + " завершена. " +
                    "Комната свободна для заселения");
            return true;
        } else {
            System.out.println("Нельзя завершить уборку. Номер " + roomNumber +
                    " имеет статус: " + status);
            return false;
        }
    }
}


class StandardRoom extends HotelRoom {
    public StandardRoom(int roomNumber) {
        super(roomNumber, "Стандарт");
    }

    @Override
    public String getRoomInfo() {
        return "Стандартный номер №" + getRoomNumber() +
                " (Категория: " + getCategory() + ", Статус: " + getStatus() + ")";
    }

    @Override
    public void displayFeatures() {
        System.out.println("Стандартный номер включает: кровать, ванная, телевизор, Wi-Fi");
    }
}

class SuiteRoom extends HotelRoom {
    public SuiteRoom(int roomNumber) {
        super(roomNumber, "Люкс");
    }

    @Override
    public String getRoomInfo() {
        return "Люкс номер №" + getRoomNumber() +
                " (Категория: " + getCategory() + ", Статус: " + getStatus() + ")";
    }

    @Override
    public void displayFeatures() {
        System.out.println("Люкс номер включает: большая кровать, джакузи, " +
                "мини-бар, панорамный вид, кондиционер");
    }

    public void orderDinner() {
        if ("Занят".equals(getStatus())) {
            System.out.println("Ужин заказан и будет доставлен в люкс номер " +
                    getRoomNumber() + " в течение 30 минут");
        } else {
            System.out.println("Невозможно заказать ужин. Номер " +
                    getRoomNumber() + " не занят гостями (статус: " +
                    getStatus() + ")");
        }
    }
}


public class HotelManagementSystem {
    public static void main(String[] args) {
        System.out.println("СИСТЕМА УПРАВЛЕНИЯ ОТЕЛЕМ");
        System.out.println("Создание комнат:");
        StandardRoom room801 = new StandardRoom(801);
        SuiteRoom room385 = new SuiteRoom(385);
        StandardRoom room123 = new StandardRoom(123);

        System.out.println("Создано комнат: " + HotelRoom.getRoomCount());
        System.out.println();

        System.out.println("Информация о комнатах:");
        System.out.println(room801.getRoomInfo());
        room801.displayFeatures();
        System.out.println();

        System.out.println(room385.getRoomInfo());
        room385.displayFeatures();
        System.out.println();


        System.out.println("Процесс заселения:");
        room801.checkIn();
        room801.checkIn();
        room385.checkIn();
        System.out.println();

        System.out.println("Заказ ужина в люксе:");
        room385.orderDinner();

        StandardRoom testRoom = new StandardRoom(999);
        System.out.println();

        System.out.println("Процесс выселения:");
        room801.checkOut();
        room801.checkOut();
        System.out.println();

        System.out.println("Процесс уборки:");
        room801.completeCleaning();
        room385.completeCleaning();
        System.out.println();

        System.out.println("Полный цикл для люкса:");
        room385.checkOut();
        room385.orderDinner();
        room385.completeCleaning();
        room385.checkIn();
        room385.orderDinner();
        System.out.println();

        System.out.println("Финальный статус:");
        System.out.println(room801.getRoomInfo());
        System.out.println(room385.getRoomInfo());
        System.out.println(room123.getRoomInfo());
        System.out.println("Всего создано комнат: " + HotelRoom.getRoomCount());
    }
}
