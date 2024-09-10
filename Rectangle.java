// Rectangle class
class Rectangle {
  double length;
  double width;
  double area;
  String rectDem;

  // Rectangle
  public Rectangle() {
    length = 1;
    width = 1;
  }

  // Rectangle with double len
  public Rectangle(int y) {
    length = y;
    width = y;
  }

  // Rectangle with double len double wid
  public Rectangle(double y, double x) {
    length = y;
    width = x;
  }

  // set Length
  double setLength(double y) {
    length = y;
    return length;
  }
  // set Width
  double setWidth(double x) {
    width = x;
    return width;
  }

  // get Area
  double getArea() {
    return (length * width);
  }
  // get Length
  double getLength() {
    return length;
  }
  // get Perimeter
  double getPerimeter() {
    area = (2*length) + (2*width);
    return area;
  }
  // get Width
  double getWidth() {
    return width;
  }

  public String toString() {
    rectDem = "rectangle with length " + length + ", width " + width;
    return rectDem;
  }

}

// Circle Class
class Circle {
  double radius;
  double area;
  double cum;
  double pi = 3.14;
  String circleDem;

  // Circle
  public Circle() {
    radius = 1;
  }
  // Circle with specified radius
  public Circle(double r) {
    radius = r;
  }

  // getArea
  double getArea() {
    area = (pi * radius) * (pi * radius);
    return area;
  }

  // get Circumference
  double getCircumference() {
    cum = (2 * pi * radius);
    return cum;
  }

  // set Radius
  double setRadius(double r) {
    radius = r;
    return radius;
  }

  public String toString() {
    circleDem = "circle with radius " + radius;
    return circleDem;
  }

}


class MethodExplorer {
  public static void main(String[] args) {
    Rectangle myRect = new Rectangle(5, 2);
    Circle myCircle = new Circle(4);
    System.out.println(myCircle);
    myCircle.setRadius(2);
    System.out.println(myCircle);
    
  }
}