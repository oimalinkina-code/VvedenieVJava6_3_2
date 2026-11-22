public class Main {
    public static void main(String[] args) {

        int addSumma = 5300;
        int initialSumma = 100;

        int totalSumma;
        int numberBonus;

        if (addSumma > 1000)
        {
            numberBonus = addSumma/100;
        }
        else
        {
            numberBonus = 0;
        }
        totalSumma = initialSumma + addSumma + numberBonus;

        System.out.println("Итоговый счёт " + totalSumma);
        System.out.println("Количество бонусных рублей " + numberBonus);
    }
}
