// Main class to test the Home Theater Facade pattern implementation
public class Main {
    public static void main(String[] args) {
        // Create instances of the subsystem components
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        Amplifier amplifier = new Amplifier();
        Lights lights = new Lights();

        // Create a facade to simplify interactions with the subsystem
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, amplifier, lights);

        // Use the facade to start watching a movie
        homeTheater.watchMovie("Inception");

        // Use the facade to shut down the home theater system
        homeTheater.endMovie();
    }
}
