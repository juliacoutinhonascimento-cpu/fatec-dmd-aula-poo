
public class Ex2 {
    private double x;
    private double y;

    

    public Ex2() {
        x = 0;
        y = 0;
    }

   
    public Ex2(double x, double y) {
        this.x = x;
        this.y = y;
    }

  
    public Ex2(Ex2 ponto) {
        this.x = ponto.x;
        this.y = ponto.y;
    }

    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

  
    public void mover() {
        x = 0;
        y = 0;
    }

    
    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
    }

   
    public void mover(Ex2 ponto) {
        this.x = ponto.x;
        this.y = ponto.y;
    }

   
    public boolean equals(Object objeto) {
        if (objeto instanceof Ex2) {
            Ex2 ponto = (Ex2) objeto;
            return x == ponto.x && y == ponto.y;
        }

        return false;
    }

    
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    
    public double distancia(Ex2 ponto) {
        double diferencaX = x - ponto.x;
        double diferencaY = y - ponto.y;

        return Math.sqrt(
            diferencaX * diferencaX + diferencaY * diferencaY
        );
    }

   
    public Ex2 clone() {
        return new Ex2 (x, y);
    }
}
