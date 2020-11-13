// enums are special objects for storing constants

public class Enums {

    public enum Direction {
        NORTH, SOUTH, EAST, WEST;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to enums");

        Direction north = Direction.NORTH;

        System.out.println("The direction is " + north);
    }

}