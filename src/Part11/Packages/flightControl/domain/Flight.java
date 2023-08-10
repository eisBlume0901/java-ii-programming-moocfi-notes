package Part11.Packages.flightControl.domain;

public class Flight
{
    private Airplane airplane;
    private Place departureAirport;
    private Place targetAirport;

    public Flight(Airplane airplane, Place departureAirport, Place targetAirport)
    {
        this.airplane = airplane;
        this.departureAirport = departureAirport;
        this.targetAirport = targetAirport;
    }

    public Airplane airplane()
    {
        return this.airplane;
    }

    public Place departureAirport()
    {
        return this.departureAirport;
    }

    public Place targetAirport()
    {
        return this.targetAirport;
    }

    @Override
    public String toString() {
        return this.airplane.toString()
                + " (" + this.departureAirport
                + "-" + this.targetAirport + ")";
    }
}
