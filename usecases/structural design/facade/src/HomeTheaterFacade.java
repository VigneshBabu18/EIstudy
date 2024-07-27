// HomeTheaterFacade class provides a simplified interface to the complex home theater subsystem
public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private Amplifier amplifier;
    private Lights lights;

    // Constructor initializes the components of the home theater system
    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, Amplifier amplifier, Lights lights) {
        this.dvd = dvd;
        this.projector = projector;
        this.amplifier = amplifier;
        this.lights = lights;
    }

    // Method to prepare the home theater for watching a movie
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);          // Dim the lights for a better viewing experience
        projector.on();         // Turn on the projector
        projector.wideScreenMode(); // Set the projector to widescreen mode
        amplifier.on();         // Turn on the amplifier
        amplifier.setVolume(5); // Set the amplifier volume to a moderate level
        dvd.on();               // Turn on the DVD player
        dvd.play(movie);        // Play the specified movie on the DVD player
    }

    // Method to shut down the home theater system after watching a movie
    public void endMovie() {
        System.out.println("Shutting down the movie theater...");
        lights.on();            // Turn on the lights
        projector.off();       // Turn off the projector
        amplifier.off();       // Turn off the amplifier
        dvd.off();             // Turn off the DVD player
    }
}
