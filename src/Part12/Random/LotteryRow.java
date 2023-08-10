package Part12.Random;

import java.util.*;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random random = new Random();

        Set<Integer> uniqueNumbers = new HashSet<>();

        while (uniqueNumbers.size() < 7)
        {
            int randomNum = random.nextInt(40) + 1;
            uniqueNumbers.add(randomNum);
        }
        this.numbers.addAll(uniqueNumbers);
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for (int n : this.numbers)
            if (n == number)
                return true;
        return false;
    }

    public static void main(String[] args) {
        LotteryRow row = new LotteryRow();
        ArrayList<Integer> lotteryNumbers = row.numbers();

        System.out.println("Lottery numbers:");
        for (Integer number : lotteryNumbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}

