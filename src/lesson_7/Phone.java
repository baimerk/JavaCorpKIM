package lesson_7;

public class Phone {
    // Вложенные классы - можно вкладывать класс в классе. Архитектура. Классы неотрывно связанные с основным классом
    // лучше использовать внутри основного класса.
    // Person {} public class Account{}
    // Class.Account acc = p.new Account()
    // нестатический вложенный класс. inner non-static or inner Static. Nested.
    // Класс внутри метода может существовать, однако к нему никак нельзя обратится. Он называется локальный.
    // Анонимные классы.
    private String number;
    private String model;
    private int weight;

    public Phone() {
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private void receiveCall(String name) {
        //String name = "Leonid";
        System.out.println("Звонит " + name);
    }

    private void receiveCall(String name, String callNumber) {
        //String name = "Leonid";
        System.out.println("Звонит " + name + " " + callNumber);
    }

    public void sendMessage(String... numbers) {
        //System.out.println("Номер телефона: " + numbers.length);
        System.out.print("Номер телефона: ");
        for (String s : numbers) {
            System.out.print(s + " ");
        }
    }

    public void dysplay() {
        System.out.printf("Номер звонящего: %s,\nМодель телефона: %s,\nВес телефона: %d",this.number,this.model,this.weight);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
