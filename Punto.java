import java.util.Scanner;

class Punto {
    private double x;
    private double y;
    private static final Punto G = new Punto(0, 0);

    Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void coordenadaCartesiana() {
        System.out.println("(" + x + ", " + y + ")");
    }

    void coordenadaPolar() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        System.out.println("(r=" + r + ", θ=" + Math.toDegrees(theta) + "°)");
    }

    void leerPunto() {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();
        y = scanner.nextDouble();
    }

    public static void main(String[] args) {
        Punto p = new Punto(3, 4);
        p.coordenadaCartesiana();
        p.coordenadaPolar();
    }
}
