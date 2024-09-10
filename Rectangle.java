// imports
import java.lang.Math;
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

// Regular Polygon :(
class RegularPolygon {
  int sides;
  double length;
  double perimeter;
  double area;
  String regDem;

  // regular polygon
  public RegularPolygon() {
    sides = 3;
    length = 1;
  }
  // regular polygon with given side length
  public RegularPolygon(double l) {
    sides = 3;
    length = l;
  }
  // regular polygon with gigven number of sides
  public RegularPolygon(int s) {
    sides = s;
    length = 1;
  }
  // regular polygon with given number of sides and given side length
  public RegularPolygon(int s, double l) {
    sides = s;
    length = l;
  }

  // add one side if amount is not specified
  int addSides() {
    sides++;
    return sides;
  } 
  // add specified number of sides
  int addSides(int ps) {
    sides = sides + ps;
    return sides;
  }
  // get area
  // kill me
  double getArea() {
    area = (sides * (length * length)) / (4.0 * Math.tan((Math.PI / sides)));
    return area;
  }

  // get num sides
  int getNumSides() {
    return sides;
  }
  // get perimeter
  double getPerimeter() {
    perimeter = sides * length;
    return perimeter;
  }
  // get side length
  double getSideLength() {
    return length;
  }
  // set num sides
  int setNumSide(int ss) {
    sides = ss;
    return sides;
  }
  //set side length
  double setSideLength(int sl) {
    length = sl;
    return length;
  }

  // string output
  public String toString() {
    // triangle
    if(sides == 3) {
      regDem = "equilateral triangle with side length " + length;
      return regDem;
    }
    // square
    if(sides == 4) {
      regDem = "square with side length " + length;
      return regDem;
    }
    // pentagon
    if(sides == 5) {
      regDem = "pentagon with side length " + length;
      return regDem;
    }
    // hexagon
    if(sides == 6) {
      regDem = "hexagon with side length " + length;
      return regDem;
    }
    // septagon
    if(sides == 7) {
      regDem = "septagon with side length " + length;
      return regDem;
    }
    // octagon
    if(sides == 8) {
      regDem = "octagon with side length " + length;
      return regDem;
    }
    // nonagon
    if(sides == 9) {
      regDem = "nonagon with side length " + length;
      return regDem;
    }
    // decagon
    if(sides == 10) {
      regDem = "decagon with side length " + length;
      return regDem;
    }
    // hendecagon
    if(sides == 11) {
      regDem = "hendecagon with side length " + length;
      return regDem;
    }
    // dodecagon
    if(sides == 12) {
      regDem = "dodecagon with side length " + length;
      return regDem;
    }
    // tridecagon
    if(sides == 13) {
      regDem = "tridecagon with side length " + length;
      return regDem;
    }
    // tetradecagon
    if(sides == 14) {
      regDem = "tetradecagon with side length " + length;
      return regDem;
    }
    // pendedecagon
    if(sides == 15) {
      regDem = "pendedecagon with side length " + length;
      return regDem;
    // else
    

  }
}
}

class MethodExplorer {
  public static void main(String[] args) {
    RegularPolygon p1 = new RegularPolygon();
    RegularPolygon p2 = new RegularPolygon(4);
    RegularPolygon p3 = new RegularPolygon(5);
    RegularPolygon p4 = new RegularPolygon(6);
    RegularPolygon p5 = new RegularPolygon(7);

    System.out.println(p1.getArea());
    System.out.println(p2.getArea());
    System.out.println(p3.getArea());
    System.out.println(p4.getArea());
    System.out.println(p5.getArea());
    
  }
}