package Acess;

public class Runner {
    public static void main(String[] args) {
        Jail jail = new Jail("Alpha Jail", "Mars", "John Doe", 100);
        Satellite[] satellites = { new Satellite(SatelliteType.GPS, 500000, 2000, 300) };
        IdCard idCard = new IdCard("Plastic", new String[]{"Red", "Blue"}, 50, "NASA");
        Alien[] aliens = { new Alien("Dr. Smith", "2025-03-25", "Green and tall") };
        Camera camera = new Camera("Canon", 1200, CameraType.DSLR, "WiFi");

        SpaceResearch research = new SpaceResearch();
        research.conductResearch(jail, satellites, idCard, aliens, camera);
}

