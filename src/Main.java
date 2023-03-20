public class Main {
    public static void main(String[] args) {

        int balance = 300;
        int amount = 1200;
        int bonus;

        if (amount>1000) {
            bonus = amount / 100;
        } else {
            bonus=0;
        }
        System.out.println("Счет клиента" + (amount + balance + bonus) + "Рублей");
    }

}
