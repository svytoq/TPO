package se.ifmo.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import se.ifmo.task2.DijkstraAlgorithm;
import se.ifmo.task3.enums.Color;
import se.ifmo.task3.enums.Size;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class WorldTest {

    @Nested
    class CoordinateTest{

        private Coordinate coordinate;

        @BeforeEach
        void init() {
            coordinate = new Coordinate(5, 5);
        }

        @Test
        @DisplayName("Check constructor to negative value")
        void checkConstructorNegativeValue() {
            assertThrows(IllegalArgumentException.class, () ->   coordinate = new Coordinate(-6, 5));
            assertThrows(IllegalArgumentException.class, () ->   coordinate = new Coordinate(5, -6));
            assertThrows(IllegalArgumentException.class, () ->   coordinate = new Coordinate(-6, -6));
        }

        @Test
        @DisplayName("Check setters to negative value")
        void checkSettersNegativeValue() {
            assertThrows(IllegalArgumentException.class, () ->   coordinate.setX(-5));
            assertThrows(IllegalArgumentException.class, () ->   coordinate.setY(-3));
        }


    }


    @Nested
    class DisplayTest{

        private  Display display;

        @BeforeEach
        void init() {
            display = new Display();
        }

        @Test
        @DisplayName("Check null SpaceBody")
        void checkNullSpaceBody() {
            assertThrows(IllegalArgumentException.class, () ->   display.addElement(null));

        }
    }


    @Nested
    class BinaryStarSystemTest{

        @Test
        @DisplayName("Check Constructor to null")
        void checkConstructorNull() {
            assertThrows(IllegalArgumentException.class, () ->  new BinaryStarSystem(new Star(new Coordinate(128, 128), "Rubicon", Color.YELLOW, 1000000, Size.BIG), null));
            assertThrows(IllegalArgumentException.class, () ->  new BinaryStarSystem(null, new Star(new Coordinate(128, 128), "Rubicon", Color.YELLOW, 1000000, Size.BIG)));
            assertThrows(IllegalArgumentException.class, () ->  new BinaryStarSystem(null, null));
        }
    }


    @Nested
    class  StarTest{

        private Star star;


        @BeforeEach
        void init() {
            star = new Star(new Coordinate(128, 128), "Rubicon", Color.YELLOW, 1000000, Size.BIG);
        }

        @Test
        @DisplayName("Check constructor to illegal value")
        void checkConstructorNegativeValue() {
            assertThrows(IllegalArgumentException.class, () ->   new Star(null, "Rubicon", Color.YELLOW, 1000000, Size.BIG));
            assertThrows(IllegalArgumentException.class, () ->   new Star(new Coordinate(128, 128), null, Color.YELLOW, 1000000, Size.BIG));
            assertThrows(IllegalArgumentException.class, () ->   new Star(new Coordinate(128, 128), "", Color.YELLOW, 1000000, Size.BIG));
            assertThrows(IllegalArgumentException.class, () ->   new Star(new Coordinate(128, 128), "Rubicon", null, 1000000, Size.BIG));
            assertThrows(IllegalArgumentException.class, () ->   new Star(new Coordinate(128, 128), "Rubicon", Color.YELLOW, -6, Size.BIG));
            assertThrows(IllegalArgumentException.class, () ->   new Star(new Coordinate(128, 128), "Rubicon", Color.YELLOW, 1000000, null));
        }


        @Test
        @DisplayName("Check move to null")
        void checkMoveNull() {
            assertThrows(IllegalArgumentException.class, () ->  star.moveTo(null));

        }

        @Test
        @DisplayName("Check setter coordinate to null")
        void checkSetterCoordinateNull() {
            assertThrows(IllegalArgumentException.class, () ->  star.setCoordinate(null));
        }

        @Test
        @DisplayName("Check setter color to null")
        void checkSetterColorNull() {
            assertThrows(IllegalArgumentException.class, () ->  star.setColor(null));
        }

        @Test
        @DisplayName("Check setter size to null")
        void checkSetterSizeNull() {
            assertThrows(IllegalArgumentException.class, () ->  star.setSize(null));
        }

        @Test
        @DisplayName("Check setter age to negative value")
        void checkSetterAgeNegativeValue() {
            assertThrows(IllegalArgumentException.class, () ->  star.setAge(-1));
        }
    }

    @Nested
    class  PlanetTest{

        private Planet planet;


        @BeforeEach
        void init() {
            planet = new Planet(new Coordinate(128, 128), "Rubicon", Color.YELLOW, 1000000, Size.BIG);
        }

        @Test
        @DisplayName("Check constructor to illegal value")
        void checkConstructorNegativeValue() {
            assertThrows(IllegalArgumentException.class, () ->   new Planet(null, "Rubicon", Color.YELLOW, 1000000, Size.BIG));
            assertThrows(IllegalArgumentException.class, () ->   new Planet(new Coordinate(128, 128), null, Color.YELLOW, 1000000, Size.BIG));
            assertThrows(IllegalArgumentException.class, () ->   new Planet(new Coordinate(128, 128), "", Color.YELLOW, 1000000, Size.BIG));
            assertThrows(IllegalArgumentException.class, () ->   new Planet(new Coordinate(128, 128), "Rubicon", null, 1000000, Size.BIG));
            assertThrows(IllegalArgumentException.class, () ->   new Planet(new Coordinate(128, 128), "Rubicon", Color.YELLOW, -6, Size.BIG));
            assertThrows(IllegalArgumentException.class, () ->   new Planet(new Coordinate(128, 128), "Rubicon", Color.YELLOW, 1000000, null));
        }


        @Test
        @DisplayName("Check move to null")
        void checkMoveNull() {
            assertThrows(IllegalArgumentException.class, () ->  planet.moveTo(null));

        }

        @Test
        @DisplayName("Check setter coordinate to null")
        void checkSetterCoordinateNull() {
            assertThrows(IllegalArgumentException.class, () ->  planet.setCoordinate(null));
        }

        @Test
        @DisplayName("Check setter color to null")
        void checkSetterColorNull() {
            assertThrows(IllegalArgumentException.class, () ->  planet.setColor(null));
        }

        @Test
        @DisplayName("Check setter size to null")
        void checkSetterSizeNull() {
            assertThrows(IllegalArgumentException.class, () ->  planet.setSize(null));
        }

        @Test
        @DisplayName("Check setter age to negative value")
        void checkSetterAgeNegativeValue() {
            assertThrows(IllegalArgumentException.class, () ->  planet.setAge(-1));
        }
    }

}
