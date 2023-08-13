public class Main {
    public static void main(String[] args) {
        int currentBalance = 100; // начальная сумма на счету клиента
        int topUpAmount = 1100; // сумма пополнения

        int bonus = 0;
        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100;
        }

        int totalBalance = currentBalance + topUpAmount + bonus; // вычисляем итоговый счет

        System.out.println("Итоговая сумма на счету: " + totalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus + " рублей");
    }
}