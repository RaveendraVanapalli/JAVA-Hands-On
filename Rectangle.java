package AreaVolumeCalculator;

import java.util.Scanner;

public class Rectangle extends Shape{
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
	private double length;
	private double width;
	public double area() {
		double a=length*width;
		return a;
		
	}
	public double volume() {
		return-1;
	}
}
