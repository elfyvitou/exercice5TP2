public class Cercle {

    Point centre;
    double rayon;

    // Constructeur
    Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }
    double surface() {
        return Math.PI * rayon * rayon;
    }
    boolean contient(Point p) {
        double d = centre.distance(p);

        if (d <= rayon) {
            return true;
        } else {
            return false;
        }
    }
}
