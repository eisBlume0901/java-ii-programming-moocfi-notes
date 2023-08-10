package Part12.ArrayListAndHashTable;

public class Arrays
{
    public static void main(String[] args)
    {
        int[] numbers = new int[3];
        numbers[0] = 3;
        numbers[1] = 6;
        numbers[2] = 9;
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println("Length of numbers: " + numbers.length);
        System.out.println("Loop: ");

        for (Integer n : numbers)
            System.out.println(n);

        String[] sentences = new String[5];
        sentences[0] = "Life is unfair";
        sentences[1] = "No matter how much you work hard";
        sentences[2] = "It will always be the same";
        sentences[3] = "Why do I even work hard";
        sentences[4] = "When the outcome is just the same";
        System.out.println(java.util.Arrays.toString(sentences));
        System.out.println("Length of sentences: " + sentences.length);
    }

    public static class Main
    {
        public static void main(String[] args)
        {
        }
    }
}
