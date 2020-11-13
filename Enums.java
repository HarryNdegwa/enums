// enums are special objects for storing constants

public class Enums {

    public enum Direction {
        NORTH("N"), SOUTH("S"), EAST("E"), WEST("W");

        private final String shortCode;

        Direction(String code) {
            this.shortCode = code;
        }

        public String getShortCode() {
            return this.shortCode;
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to enums");

        Direction dir = Direction.NORTH;

        System.out.println("The direction is " + dir);

        System.out.println();

        switch (dir) {
            case NORTH:
                System.out.println("Direction is north");
                break;
            case EAST:
                System.out.println("Direction is east");
                break;
            case WEST:
                System.out.println("Direction is west");
                break;
            case SOUTH:
                System.out.println("Direction is south");
                break;
            default:
                System.out.println("Helloo");
                break;

        }
    }

}