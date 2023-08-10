package Part11.Packages.flightControl.ui;
import java.util.*;
import static java.lang.System.*;

import Part11.Packages.flightControl.domain.Airplane;
import Part11.Packages.flightControl.domain.Flight;
import Part11.Packages.flightControl.logic.FlightControl;


public class TextUI
{
    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(Scanner scanner)
    {
        this.flightControl = new FlightControl();
        this.scanner = scanner;
    }

    public void start()
    {
        startAssetControl();
        out.println();
        startFlightControl();
        out.println();
    }

    private void startAssetControl()
    {
        out.println("Airport Asset Control");
        out.println("---------------------");
        out.println();

        while (true)
        {
            out.println("""
                    Choose an action
                    [1] Add an airplane\s
                    [2] Add a flight\s
                    [x] Exit Airport Asset Control
                    >
                    """);

            String input = this.scanner.nextLine();

            if (input.equals("1"))
                addAirplane();
            else if (input.equals("2"))
                addFlight();
            else if (input.equals("x"))
                break;
        }
    }

    private void addAirplane()
    {
        out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        out.println("Give the airplane capacity: ");
        int capacity = Integer.parseInt(this.scanner.nextLine());

        this.flightControl.addAirplane(id, capacity);
    }

    private Airplane askForAirplane()
    {
        Airplane airplane = null;
        while (airplane == null)
        {
            String id = this.scanner.nextLine();
            airplane = flightControl.getAirplane(id);

            if (airplane == null)
            {
                out.println("No airplane with the id "+ id + ".");
            }
        }
        return airplane;
    }
    private void addFlight()
    {
        out.println("Give the airplane id: ");
        Airplane airplane = askForAirplane();
        out.println("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        out.println("Give the target airport id: ");
        String destinationID = scanner.nextLine();

        this.flightControl.addFlight(airplane, departureID, destinationID);
    }

    private void printAirplanes()
    {
        for (Airplane plane : flightControl.getAirplanes())
            out.println(plane);
    }

    private void printFlights()
    {
        for (Flight flight : flightControl.getFlights())
        {
            out.println(flight);
            out.println();
        }
    }

    private void printAirplaneDetails()
    {
        out.println("Give the airplane id: ");
        Airplane plane = askForAirplane();
        out.println(plane);
        out.println();
    }
    private void startFlightControl()
    {
        out.println("Flight Control");
        out.println("--------------");
        out.println();

        while (true)
        {
            out.println("""
                    Choose an action:
                    [1] Print airplanes\s
                    [2] Print flights\s
                    [3] Print airplane details\s
                    [x] Quit
                    >
                    """);

            String input = this.scanner.nextLine();

            if (input.equals("1"))
                printAirplanes();
            else if (input.equals("2"))
                printFlights();
            else if (input.equals("3"))
                printAirplaneDetails();
            else if (input.equals("x"))
                break;
        }
    }

}
