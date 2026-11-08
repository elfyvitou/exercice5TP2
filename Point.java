public class Point {
    double x;
    double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    double distance(Point autre) {
    double dx = autre.x - this.x;
    double dy = autre.y - this.y;

        return Math.sqrt(dx * dx + dy * dy);
}
}
