package se.ifmo.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import se.ifmo.task2.DijkstraAlgorithm;
import se.ifmo.task3.enums.Color;
import se.ifmo.task3.enums.Size;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTest {


    @Nested
    class DisplayTest{

        private  Display display;
        private Star star1 = new Star(new Coordinate(128, 128), "Rubicon", Color.YELLOW, 1000000, Size.BIG);
        private Star star2 = new Star(new Coordinate(122, 121), "Rubicon2", Color.YELLOW, 1000001, Size.BIG);

        private Star star3 = new Star(new Coordinate(102, 121), "Rubicon3", Color.YELLOW, 1000021, Size.BIG);


        @BeforeEach
        void init() {
            display = new Display();
            display.addElement(star1);
            display.addElement(star2);
            display.addElement(star3);
            display.deleteElement(star3);
        }

        @Test
        @DisplayName("Check null SpaceBody")
        void checkNullSpaceBody() {
            assertThrows(IllegalArgumentException.class, () ->   display.addElement(null));

        }


        @Test
        @DisplayName("Check element present")
        void checkElementPresent() {
            assertTrue( () ->   display.hasElement(star1));
        }

        @Test
        @DisplayName("Check element not present")
        void checkElementNotPresent() {
            assertFalse( () ->   display.hasElement(star3));
        }

        @Test
        @DisplayName("Check ade the same element")
        void checkAdeSameElement() {
            assertFalse( () ->   display.addElement(star1));
        }


        @Test
        @DisplayName("Check delete correct element")
        void checkDeleteCorrectElement() {
            assertTrue( () ->   display.deleteElement(star1));
        }


        @Test
        @DisplayName("Check delete not present element ")
        void checkDeleteNotPresentElement() {
            assertFalse( () ->   display.deleteElement(new Star(new Coordinate(128, 108), "Rubicon4", Color.YELLOW, 1000000, Size.BIG)));
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
        @DisplayName("Check the same coordinate")
        void checkTheSameCoordinate() {
            assertDoesNotThrow( () ->  star.moveTo(new Coordinate(128, 128)));
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
