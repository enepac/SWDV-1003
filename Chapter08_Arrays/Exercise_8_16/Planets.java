import java.util.Scanner;

public class Planets {
    enum Planet {MERCURY, VENUS, EARTH, MARS, JUPITER, SATURN, URANUS, NEPTUNE};

    public static void main(String[] args) {
        Planet chosenPlanet;
        String userEntry;
        int position;
        int comparison;
        Scanner input = new Scanner(System.in);

        System.out.println("The planets are:");
        for(Planet planet : Planet.values())
            System.out.print(planet + " ");
        System.out.print("\n\nEnter the name of a planet >> ");
        userEntry = input.nextLine().toUpperCase();
        chosenPlanet = Planet.valueOf(userEntry);
        System.out.println("You entered " + chosenPlanet);
        position = chosenPlanet.ordinal();
        System.out.println(chosenPlanet + " is " + (position + 1) + " planet(s) from the sun");
        comparison = chosenPlanet.compareTo(Planet.EARTH);
        if(comparison < 0)
            System.out.println(chosenPlanet + " is closer to the sun than " + Planet.EARTH);
        else if(comparison > 0)
            System.out.println(chosenPlanet + " is farther from the sun than " + Planet.EARTH);
        else
            System.out.println(chosenPlanet + " is " + Planet.EARTH);
        
        input.close();
    }
}
