//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// task 1
        int firstFriday = 5;
        for (int a = firstFriday; a <= 31; a += 7) {
            System.out.println("Сегодня пятница, " + a + "-e число. Необходимо подготовить отчет");
        }
        /// task 2
        int marathonDistance = 42195;
        int checkpointInterval = 500;
        int distanceCovered = 0;

        do {
            int remainingDistance = marathonDistance - distanceCovered;
            System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
            distanceCovered += checkpointInterval;
        } while (distanceCovered < marathonDistance);


        for (int currentDistance = 0; currentDistance < marathonDistance; currentDistance += checkpointInterval) {
            int remainingDistance = marathonDistance - currentDistance;
            System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
        }
        /// task 3
        int theAmount = 800;
        int currentDay = 0;
        int costOfParking = 100;
        while (theAmount >= costOfParking) {
            currentDay++;
            if (currentDay % 5 == 0) {
                continue;
            }
            theAmount -= costOfParking;
        }
        System.out.println("Количество дней: " + currentDay);


        for (int day = 1; theAmount >= costOfParking; day++) {
            currentDay++;
            if (currentDay % 5 == 0) {
                continue;
            }
            theAmount -= costOfParking;
        }
        System.out.println("Количество дней: " + currentDay);

        /// task 4
        int month = 0;
        double total = 0;
        int recommendedAmount = 15000;
        double purpose = 12000000.0;

        while (true) {
            month++;
            total += recommendedAmount;
            if (month % 6 == 0) {
                double interest = total * 0.07;
                total += interest;
                if (total >= purpose) {
                    System.out.printf("Цель достигнута в месяце %d. Итоговая сумма: %.2f рублей\n", month, total);
                    break;
                }
            }
        }
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                if (overheats > 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }
                minute += 2;
                continue;
            }
            charge += 2;
            if (charge == 100) {
                break;
            }
        }
        System.out.println("Время зарядки составило " + minute + " минут.");
    }
}