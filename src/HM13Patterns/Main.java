package HM13Patterns;


//Планеты солнечной системы. Создайте три Singleton-класса: Sun, Moon и Earth.
//Затем реализуйте в них интерфейс CosmicBody с некоторыми характерными операциями
public class Main {
    public static void main(String[] args) {

        Earth earth = Earth.getInstance();

        System.out.println("Earth volume: " + Earth.getVolume(6371) + "\nEarth diameter:" + Earth.getDiameter(6371));

        System.out.println("Moon volume: " + Moon.getVolume(1737) + "\nMoon diameter:" + Moon.getDiameter(1737));

        System.out.println("Sun volume: " + Sun.getVolume(696340) + "\nSun diameter:" + Sun.getDiameter(696340));


    }
}
