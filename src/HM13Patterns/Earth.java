package HM13Patterns;

public class Earth {
    public static Earth instance;

    private int radius;

    private Earth() {
    }

    public static Earth getInstance() {
        if (instance == null)
            instance = new Earth();
        return instance;
    }

    public static synchronized double getVolume(int radius) {
        return (4 * Math.PI * Math.pow(radius, 3));
    }

    public static synchronized double getDiameter(int radius) {
        return (2 * radius);
    }
}

