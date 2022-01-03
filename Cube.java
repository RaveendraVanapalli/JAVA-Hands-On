package AreaVolumeCalculator;

import java.util.Scanner;

public class Cube extends Shape implements Spatial{
	private double length;
	private double width;
	private double height;
	Scanner sc=new Scanner(System.in);
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
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
	public double area() {
		double a=2*width*length+2*length*height+2*height*width;
		return a;
	}public double volume() {
		Cube c=new Cube();
		double v=height*length*width;
	return v;
	}

}
