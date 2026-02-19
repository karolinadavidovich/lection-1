package HM13Patterns;

public class Sun {
    public static Sun instance;

    private Sun() {
    }

    public static Sun getInstance() {
        if (instance == null)
            instance = new Sun();
        return instance;
    }

    public static synchronized double getVolume(int radius) {
        return (4 * Math.PI * Math.pow(radius, 3));
    }

    public static synchronized double getDiameter(int radius) {
        return (2 * radius);
    }
}
