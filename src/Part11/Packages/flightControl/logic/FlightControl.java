package Part11.Packages.flightControl.logic;

import Part11.Packages.flightControl.domain.Airplane;
import Part11.Packages.flightControl.domain.Flight;
import Part11.Packages.flightControl.domain.Place;

import java.util.*;
public class FlightControl
{
    private Map<String, Airplane> airplanes;
    private Map<String, Flight> flights;
    private Map<String, Place> places;

    public FlightControl()
    {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity)
    {
        Airplane plane = new Airplane(ID, capacity);
        this.airplanes.put(ID, plane);
    }

    public void addFlight(Airplane plane, String departureID, String destinationID)
    {
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(destinationID, new Place(destinationID));

        Flight flight =
                new Flight(plane, this.places.get(departureID), this.places.get(destinationID));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes()
    {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights()
    {
        return this.flights.values();
    }

    public Airplane getAirplane(String ID)
    {
        return this.airplanes.get(ID);
    }
}
