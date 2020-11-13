
public class Enums {

    public enum Planet {
        MERCURY(3.303e+23, 2.4397e6), VENUS(4.869e+24, 6.0518e6), EARTH(5.976e+24, 6.37814e6),
        MARS(6.421e+23, 3.3972e6), JUPITER(1.9e+27, 7.1492e7), SATURN(5.688e+26, 6.0268e7), URANUS(8.686e+25, 2.5559e7),
        NEPTUNE(1.024e+26, 2.4746e7);

        private final double mass;

        private final double radius;

        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }

        public double getMass() {
            return mass;
        }

        public double getRadius() {
            return radius;
        }

        public static final double G = 6.67300E-11;

        double surfaceGravity() {
            return G * mass / (radius * radius);
        }

        double surfaceWeight(double weightedMass) {
            return weightedMass * surfaceGravity();
        }
    }

    Enums() {

    }

    public static void main(String[] args) {
        Planet earth = Planet.EARTH;

        if (args.length != 1) {
            System.out.println("Provide earth mass!");
            return;
        }

        double earthWeight = Double.parseDouble(args[0]);

        double earthMass = earthWeight / earth.surfaceGravity();

        for (Planet p : Planet.values()) {
            System.out.printf("Your weight on %s is %f%n", p, p.surfaceWeight(earthMass));
        }

    }
}

// public class Enums {

// public enum PizzaStatus {
// READY(0) {
// @Override
// public boolean isReady() {
// return true;
// }
// },

// ORDERED(1) {
// @Override
// public boolean isOrdered() {
// return true;
// }
// },

// DELIVERED(2) {
// @Override
// public boolean isDelivered() {
// return true;
// }
// }
// ;

// private Integer statusCode;

// PizzaStatus(Integer statusCode) {
// this.statusCode = statusCode;
// }

// public boolean isReady() {
// return false;
// };

// public boolean isOrdered() {
// return false;
// }

// public boolean isDelivered() {
// return false;
// }

// public Integer getStatusCode() {
// return this.statusCode;
// }
// }
// }