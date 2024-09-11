// imports
import java.lang.Math;
import java.util.*;
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
  public Rectangle(double y) {
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
  double radius2;
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
    radius2 = r;
  }

  // getArea
  double getArea() {
    area = (pi * radius) * (pi * radius);
    return area;
    /* 
    if (radius != 0.0 && radius2 == 0.0) {
      area = (pi * radius) * (pi * radius);
      return area;
    }
    else {
      area = Math.PI * radius * radius2;
      return area;
    }
      */
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
  // scale same way
  double scale(double scal) {
    radius = radius * scal;
    return radius;
  }
  // scale two ways
  double/*[] */ scale(double scal1, double scal2) {
    radius = radius * scal1;
    radius = radius * scal2;
    return radius;
    /* 
    radius = radius * scal1;
    radius2 = radius2 * scal2;
    double[] arr = { radius, radius2 };
    return arr;
    */
    
  }

  public String toString() {
    circleDem = "circle with radius " + radius;
    return circleDem;
    /*if (radius >= 0.0 && radius2 == radius) {
      circleDem = "circle with radius " + radius;
      return circleDem;
    }
    else {
      circleDem = "ellipsis with semi-major radius of " + radius + " and semi-minor radius of " + radius2;
      return circleDem;
    } */
    
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
    }
    else {
      return regDem;
    }
}
}

class MethodExplorer {
  public static void main(String[] args) {
    Circle myCircle = new Circle(3);
    System.out.println(myCircle);
    System.out.println(myCircle.getArea());

    myCircle.scale(4, 10);
    System.out.println(myCircle);
    System.out.println(myCircle.getArea());
    
  }
}