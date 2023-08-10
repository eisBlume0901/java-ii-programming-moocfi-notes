package Part8.GroupingDataUsingHashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class TaskTracker
{
    private HashMap<String, ArrayList<Integer>> completedExercises;

    public TaskTracker()
    {
        this.completedExercises = new HashMap<>();
    }

    public void add(String user, int exercise)
    {
        /* an empty list has to be added for a new user if one has not already
        been added
         */
        this.completedExercises.putIfAbsent(user, new ArrayList<>());

        // Retrieve the list containing the exercises completed by the user and add
        ArrayList<Integer> completed = this.completedExercises.get(user); //For every user
        completed.add(exercise);
    }

    public void print()
    {
        for (String name : completedExercises.keySet())
        {
            System.out.println(name + ": " + completedExercises.get(name));
        }
    }
}