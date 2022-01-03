package AreaVolumeCalculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public void main() {
		Scanner sc=new Scanner(System.in);
		String[] s=new String[4];
		Cube c=new Cube();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Sphere sp=new Sphere();
		for(int i=0;i<s.length;i++) {
			String k=sc.next();
			if(k.equalsIgnoreCase("Triangle")) {
				s[i]=k;
				
				t.setBase(sc.nextDouble());
				t.setHeight(sc.nextDouble());
			}
			if(k.equalsIgnoreCase("Sphere")) {
				s[i]=k;
				
				sp.setRadius(sc.nextDouble());
			}
			if(k.equalsIgnoreCase("Rectangle")) {
				s[i]=k;
				
				r.setLength(sc.nextDouble());
				
				r.setWidth(sc.nextDouble());
			}
			if(k.equalsIgnoreCase("Cube")) {
				s[i]=k;
				
				c.setHeight(sc.nextDouble());
				
				c.setLength(sc.nextDouble());
				
				c.setWidth(sc.nextDouble());
			}
		}
			for(int i=0;i<s.length;i++) {
		if(s[i].equalsIgnoreCase("Cube")) {
			double a=c.area();
			double v=c.volume();
			System.out.println("Area "+a);
			System.out.println("Volume "+v);
		}
		if(s[i].equalsIgnoreCase("Rectangle")) {
			double a=r.area();
			System.out.println("Area "+a);
		}
		if(s[i].equalsIgnoreCase("Triangle")) {
			double a=t.area();
			System.out.println("Area "+a);
			
		}
		if(s[i].equalsIgnoreCase("Sphere")) {
			double a=sp.area();
			System.out.println("Area "+a);
			double v=sp.volume();
			System.out.println("Volume "+v);
		}
		}}
	public static void main(String[] args) {
		Main m=new Main();
	m.main();
	}

}
