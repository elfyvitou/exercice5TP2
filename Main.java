
public class Main {

    public static void main(String[] args) {

        Rectangle R = new Rectangle(new Point(1, 1), 4, 3);
        Cercle C = new Cercle(new Point(0, 0), 5);

        Point[] points = {
                new Point(2, 2),
                new Point(5, 4),
                new Point(6, 1),
                new Point(3, 4),
                new Point(0, 5)
        };
        System.out.println("Surface du rectangle : " + R.surface());
        System.out.println("Perimetre du rectangle : " + R.perimetre());
        System.out.println("Surface du cercle : " + C.surface());
        for (Point p : points) {
            System.out.println("\nPoint : " + p.x + ", " + p.y);
            System.out.println("Dans le rectangle : " + R.contient(p));
            System.out.println("Dans le cercle : " + C.contient(p));
        }
    }
}
