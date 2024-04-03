package se.ifmo.task3;

import se.ifmo.task3.enums.Color;
import se.ifmo.task3.enums.Size;

public class Models {
        public static void go() {
                Star star1 = new Star(new Coordinate(128, 128), "Rubicon", Color.YELLOW, 1000000, Size.BIG);
                Star star2 = new Star(new Coordinate(126, 126), "Rubicon2", Color.YELLOW, 1000000, Size.LARGE);

                BinaryStarSystem starSystem = new BinaryStarSystem(star1, star2);

                Display display = new Display();

                display.getList().add(star1);
                display.getList().add(star2);

                System.out.println(display.toString());

                star1.moveTo(new Coordinate(106, 103));
                star2.moveTo(new Coordinate(107, 110));

                Planet planet = new Planet(new Coordinate(128, 128), "Earth", Color.RED, 1000000, Size.SMALL);
                display.getList().add(planet);

                planet.moveTo(new Coordinate( 118, 118));

                System.out.println(display.toString());
        }

}
