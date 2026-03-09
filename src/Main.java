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
        int theAmount = 600;
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
    }
}