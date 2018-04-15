package punto;

/**
 *
 * @author Javi Palacios <javi@fjp.es>
 */
public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(Punto p) {
        this.x = p.x;
        this.y = p.y;
    }

    @Override
    public String toString() {
        return "Punto(" + x + ", " + y + ")";
    }

}
