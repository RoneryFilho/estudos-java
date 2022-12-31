package entities;

public class Rectangle {
	public double heigth;
	public double width;
	
	public double area () {
		return heigth * width;
	}
	
	public double perimeter () {
		return (heigth + width) * 2;
	}
	
	public double diagonal () { 
		return Math.sqrt(Math.pow(heigth,2)+Math.pow(width, 2));
	}
	
	public String toString() {
		return "AREA: " + String.format("%.2f", area()) +"\n" + "PERIMETER: " + String.format("%.2f", perimeter()) + "\n" + "DIAGONAL: " + String.format("%.2f", diagonal());
	}
	
}
