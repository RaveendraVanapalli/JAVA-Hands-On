package AreaVolumeCalculator;

import java.util.Scanner;

public class Sphere extends Shape implements Spatial {
	private double radius;
    Scanner sc=new Scanner(System.in);
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}public double area() {
		double a=4*Math.PI*Math.pow(radius,2);
		return a;
	}public double volume() {
		double v=(4*Math.PI*Math.pow(radius,3))/3;
		return v;
	}

}
