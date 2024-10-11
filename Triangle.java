public class Triangle {
    private double base;
    private double height;
    private double angle;

    public Triangle(double base, double height, double angle) {
        this.base = base;
        this.height = height;
        if (angle >= 180) {
            angle = 179.999;
        }
        this.angle = angle * Math.PI / 180;
    }

    public double hypotenuse() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }
    
    public double angleOppAdj() {
        return Math.atan(height / base);
    }

    public double angleOppHyp() {
        return Math.asin(height / hypotenuse());
    }

    public void setAngle(double newAngle) {
        if (angle >= 180) {
            angle = 179.999;
        }
        this.angle = newAngle;
    }

    public double radToDeg(double rad) {
        return rad * 180 / Math.PI;
    }

    public void printInfo() {
        System.out.println("Triangle Info: ");
        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Hypotenuse: " + hypotenuse());
        System.out.println("Angle of Adjacent Side & Hypotenuse: " + radToDeg(angle));
        System.out.println("Angle of Opposite Side & Hypotenuse: " + radToDeg(angleOppHyp()));
        System.out.println("Angle of Adjacent and Opposite Sides: " + radToDeg(angleOppAdj()));

    }
}
