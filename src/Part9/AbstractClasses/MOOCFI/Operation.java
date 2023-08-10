package Part9.AbstractClasses.MOOCFI;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Operation
{
    private String name;

    public Operation(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public abstract void execute(Scanner scanner);
}

class PlusOperation extends Operation
{
    public PlusOperation()
    {
        super("PlusOperation");
    }

    @Override
    public void execute(Scanner scanner)
    {
        System.out.println("First number: ");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Second number: ");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second));
    }
}

class UserInterface
{
    private Scanner scanner;
    private ArrayList<Operation> operations;

    public UserInterface(Scanner scanner)
    {
        this.scanner = scanner;
        this.operations = new ArrayList<>();
    }

    public void addOperation(Operation operation)
    {
        this.operations.add(operation);
    }

    private void printOperations()
    {
        System.out.println("\t0: Stop");
        int i = 0;
        while (i < this.operations.size())
        {
            String operationName = this.operations.get(i).getName();
            System.out.println("\t" + (i + 1) + ": " + operationName);
            i++;
        }
    }

    private void executeOperation(String choice)
    {
        int operation = Integer.parseInt(choice);
        Operation chosen = this.operations.get(operation - 1);
        chosen.execute(scanner);
    }
    public void start()
    {
        while (true)
        {
            printOperations();
            System.out.println("Choice: ");

            String choice = this.scanner.nextLine();
            if (choice.equals("0"))
            {
                break;
            }

            executeOperation(choice);
            System.out.println();
        }
    }
}

class Main
{
    public static void main(String[] args)
    {
        UserInterface userInterface = new UserInterface(new Scanner(System.in));
        userInterface.addOperation(new PlusOperation());

        userInterface.start();
    }
}