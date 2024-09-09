// Imports

// Rectangle class
public class Rectangle {
  int height;
  int width;
  String rectDem;
  
  

  public Rectangle(int y, int x) {
    height = y;
    width = x;
  }
  public String toString() {
    rectDem = "A rectangle with a height of " + height + " and a width of " + width;
    return rectDem;
}
  
}

class MethodExplorer {
	public static void main(String[] args) {
    	Rectangle myRect = new Rectangle(5, 4);
    	System.out.println(myRect);
  }
}