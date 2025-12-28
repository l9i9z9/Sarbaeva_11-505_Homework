public class sr {
    public static void main(String[] args) {
        SupportTicket ticket1 = new SupportTicket("описание проблемы", 123);
        SupportTicket ticket2 = new SupportTicket("описание проблемы", 9);
        SupportTicket ticketVIP = new VIPTicket("описание проблемы");

        ticket1.startTicket();
        ticket1.closeTicket();


    }
}

class SupportTicket {
    private static int count = 1;
    private int id;
    private String text;
    private int priority;
    private String status;

    public SupportTicket(String text, int priority) {
        this.id = count++;
        this.text = text;
        if (priority >= 1 && priority <= 5) {
            this.priority = priority;
        } else {
            this.priority = 1;
        }
        this.status = "Opened";
    }

    public void startTicket() {
        this.status = "In Progress";
        System.out.println(this.id);
    }

    public void closeTicket() {
        if (this.status.equals("In Progress")) {
            this.status = "Closed";
            System.out.println(this.id);
        } else {
            System.out.println("Нужно делать тикет");
        }
    }

    public int getPriority() {
        return this.priority;
    }

    public String getStatus() {
        return this.status;
    }

    public void setPriority(int newPriority, String password) {
        if (password.equals("123")) {
            if (newPriority >= 1 && newPriority <= 5) {
                this.priority = newPriority;
                System.out.println("Приоритет изменен");
            } else {
                System.out.println("Приоретет от 1 до 5");
            }
        } else {
            System.out.println("Ошибка, неправильный пароль");
        }
    }
}

class VIPTicket extends SupportTicket {

    public VIPTicket(String text) {
        super(text, 5);
    }
}
