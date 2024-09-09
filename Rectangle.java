// Imports

// Rectangle class
public class Rectangle {
  double height;
  double width;
  String rectDem;
  
// Rectangle
public Rectangle() {
    height = 1;
    width = 1;
  }

// Rectangle with double len
public Rectangle(int y) {
    height = y;
    width = y;
  }
  
//Rectangle with double len double wid
  public Rectangle(double y, double x) {
    height = y;
    width = x;
  }
  public String toString() {
    rectDem = "rectangle with height " + height + ", width " + width;
    return rectDem;
}
  
}

class MethodExplorer {
	public static void main(String[] args) {
    	Rectangle myRect = new Rectangle();
    	System.out.println(myRect);
  }
}