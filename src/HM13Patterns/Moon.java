package HM13Patterns;

public class Moon {
    public static Moon instance;

    private Moon() {
    }

    public static Moon getInstance() {
        if (instance == null)
            instance = new Moon();
        return instance;
    }

    public static synchronized double getVolume(int radius) {
        return (4 * Math.PI * Math.pow(radius, 3));
    }

    public static synchronized double getDiameter(int radius) {
        return (2 * radius);
    }
}

