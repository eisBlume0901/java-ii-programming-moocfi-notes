package Part8.GroupingDataUsingHashMaps;

public class Main
{
    public static void main(String[] args)
    {
        TaskTracker tracker = new TaskTracker();
        tracker.add("Mary Kate", 9);
        tracker.add("Mary Kate", 1);
        tracker.add("Mary Kate", 10);

        tracker.add("Emerald", 9);
        tracker.add("Emerald", 14);

        tracker.add("Claire", 5);
        tracker.add("Claire", 4);

        tracker.print();
        /*
        Claire: [5, 4]
        Mary Kate: [9, 1, 10]
        Emerald: [9, 14]
         */
    }
}
