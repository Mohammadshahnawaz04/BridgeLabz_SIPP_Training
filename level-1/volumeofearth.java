package operators;

public class volumeofearth {

	public static void main(String[] args) {
	
		        double radiusKm = 6378.0;

		        // Conversion factor from kilometers to miles
		        double kmToMiles = 0.621371;

		        // Volume of a sphere = (4/3) * pi * r^3
		        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

		        // Convert radius to miles and calculate volume in cubic miles
		        double radiusMiles = radiusKm * kmToMiles;
		        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

		        // Output the result
		        System.out.printf("The volume of Earth in cubic kilometers is %.2f km³%n", volumeKm3);
		        System.out.printf("The volume of Earth in cubic miles is %.2f mi³%n", volumeMiles3);
		    }
		}



