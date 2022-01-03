package AreaVolumeCalculator;

import java.util.Scanner;

public class Triangle extends Shape {
	private double base;
	private double height;
	double a;
	Scanner sc=new Scanner(System.in);
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double area() {
		a=(base*height)/2;
		return a;
	}public double volume() {
		return -1;
	}
}
