package Part9.WarehousingExercise;

import java.util.ArrayList;

public class ChangeHistory
{
    private ArrayList<Double> historyList;

    public ChangeHistory()
    {
        this.historyList = new ArrayList<>();
    }

    public void add(double status)
    {
        this.historyList.add(status);
    }

    public void clear()
    {
        this.historyList.clear();
    }

    public String toString()
    {
        return historyList.toString();
    }

    public double maxValue()
    {
        if (historyList.isEmpty())
        {
            return 0.0;
        }
        double max = historyList.get(0);
        for (double val : historyList)
        {
            if (max <= val)
            {
                max = val;
            }
        }
        return max;
    }

    public double minValue()
    {
        if (historyList.isEmpty())
        {
            return 0.0;
        }
        double min = historyList.get(0);
        for (double val : historyList)
        {
            if (val <= min)
            {
                min = val;
            }
        }
        return min;
    }

    public double average()
    {
        if (historyList.isEmpty())
        {
            return 0.0;
        }
        double sum = 0.0;
        int count = historyList.size();
        for (double val : historyList)
        {
            sum += val;
        }
        return sum / count;
    }
}