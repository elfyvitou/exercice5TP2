public class Rectangle {
    Point coinHautGauche;
    double largeur;
    double hauteur;
    Rectangle(Point coinHautGauche, double largeur, double hauteur) {

        this.coinHautGauche = coinHautGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    double surface() {
        return largeur * hauteur;
    }


    double perimetre() {
        return (largeur + hauteur) * 2;
    }
    Point coinBasDroit() {

        return new Point(
                coinHautGauche.x + largeur,
                coinHautGauche.y + hauteur
        );
    }
    boolean contient(Point p) {
        return p.x >= coinHautGauche.x
                && p.x <= coinHautGauche.x + largeur
                && p.y >= coinHautGauche.y
                && p.y <= coinHautGauche.y + hauteur;
    }
    void translater(double dx, double dy) {

        coinHautGauche.x = coinHautGauche.x + dx;
        coinHautGauche.y = coinHautGauche.y + dy;
    }

}

