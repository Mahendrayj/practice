package com.kn.PolygonTypeIdentifier;

public class PolygonTypeIdentifier {

	public void polygonside(int sides) {
		// TODO Auto-generated method stub
		switch(sides) {
		case 1:
			System.out.println("Triangle");
			break;
		case 2:
			System.out.println("Qutilateral");
			break;
		case 3:
			System.out.println("Hexgon");
			break;
		case 4:
			System.out.println("Hepatagon");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("octagon");
			break;
		case 7:
			System.out.println("nanogon");
			break;
		case 8:
			System.out.println("decagon");
			break;
		default:
			System.out.println("Polygon as more then sides cannot consider");
			break;
		}
		System.out.println();
	}

}
