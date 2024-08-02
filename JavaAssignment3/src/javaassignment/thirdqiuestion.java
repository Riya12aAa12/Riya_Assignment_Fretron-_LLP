package javaassignment;

import java.util.*;

public class thirdquestion {

    private static final int BOARD_SIZE = 8; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of soldiers
        System.out.print("Enter number of soldiers: ");
        int numberOfSoldiers = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        Set<Point> soldiers = new HashSet<>();
        for (int i = 1; i <= numberOfSoldiers; i++) {
            System.out.print("Enter coordinates for soldier " + i + ": ");
            String[] coords = scanner.nextLine().split(",");
            int x = Integer.parseInt(coords[0].trim());
            int y = Integer.parseInt(coords[1].trim());
            soldiers.add(new Point(x, y));
        }

       
        System.out.print("Enter the coordinates for your “special” castle: ");
        String[] startCoords = scanner.nextLine().split(",");
        int startX = Integer.parseInt(startCoords[0].trim());
        int startY = Integer.parseInt(startCoords[1].trim());
        Point start = new Point(startX, startY);
        List<List<Point>> paths = findPaths(start, soldiers);
        System.out.println("Thanks. There are " + paths.size() + " unique paths for your ‘special_castle’");
        int pathCount = 1;
        for (List<Point> path : paths) {
            System.out.println("Path " + pathCount++);
            System.out.println("=======");
            for (Point point : path) {
                System.out.println("Kill (" + point.x + "," + point.y + "). Turn Left");
            }
            System.out.println("Arrive (" + start.x + "," + start.y + ")");
        }

        scanner.close();
    }

    private static List<List<Point>> findPaths(Point start, Set<Point> soldiers) {
        List<List<Point>> paths = new ArrayList<>();
        // Implement the pathfinding algorithm here
        // This is a placeholder implementation and needs to be replaced with actual pathfinding logic
        return paths;
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Point point = (Point) obj;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }
    }
}
