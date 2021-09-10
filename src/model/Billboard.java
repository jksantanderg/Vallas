package model;

public class Billboard {
	private  double width;
	private double height;
	private boolean inUse;
	private String brand;
	
	public Billboard(double w, double h, boolean iu, String b) {
		super();
		this.width = w;
		this.height = h;
		this.inUse = iu;
		this.brand = b;
	}
	
	public double calculateArea() {
		double area = width*height;
		return area;
		
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isInUse() {
		return inUse;
	}
	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
