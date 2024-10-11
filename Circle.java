public class Circle {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  /* Returns the area of the circle with given radius
     Area of a circle = pi * r ^ 2
     Use Math.PI for pi and use the pow method
   */
  public double area() {
    /* implement this method */
    return Math.pow(radius, 2) * Math.PI;
  }

  /* Returns the circumference of the circle with given radius
     Circumference of a circle = pi * 2 * r
     Use Math.PI for pi
   */
  public double circumference() {
    /* implement this method */
    return radius * 2 * Math.PI;
  }

  /* Setter method to update the radius of the circle to newRadius
   */
  public void setRadius(double newRadius) {
    /* implement this method */
    radius = newRadius;
  }

  /* Returns a String that includes info about the circle,
     including its radius, area, and circumference on separate lines;
     see example output below (Reminder: the new line escape
     sequence \n allows you to include new lines in Strings)
     This method should call your other methods as appropriate.
   */
  public String getInfo() {
    /* implement this method */
    String info = "";
    info += "This circle's radius is " + radius;
    info += "\nIt's area is " + area();
    info += "\nIt's circumference is " + circumference();
    return info;
  }
}