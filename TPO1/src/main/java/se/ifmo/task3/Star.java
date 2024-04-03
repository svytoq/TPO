package se.ifmo.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import se.ifmo.task3.enums.Color;
import se.ifmo.task3.enums.Size;

import java.util.Objects;

@Getter

public class Star implements SpaceBody {

    private Coordinate coordinate;
    private String Name;

    private Color color;

    private int age;

    private Size size;


    public Star(Coordinate coordinate, String name, Color color, int age, Size size) {
        if(coordinate == null || name == null || name.isEmpty() || color == null || age < 0 || size == null){
            throw new IllegalArgumentException();
        }
        this.coordinate = coordinate;
        Name = name;
        this.color = color;
        this.age = age;
        this.size = size;
    }

    public void moveTo(Coordinate coordinate2){
        if (coordinate2 == null){
            throw new IllegalArgumentException();
        }
        System.out.println(Name + " is starting moving from " + coordinate.toString() + " to " + coordinate2.toString() + " !");
        coordinate = coordinate2;
        System.out.println(Name + " now on " + coordinate2.toString() + " !");

    }

    public void setCoordinate(Coordinate coordinate) {
        if (coordinate == null){
            throw new IllegalArgumentException();
        }
        this.coordinate = coordinate;
    }

    public void setColor(Color color) {
        if (color == null){
            throw new IllegalArgumentException();
        }
        this.color = color;
    }

    public void setAge(int age) {
        if (age < 0){
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    public void setSize(Size size) {
        if (size == null){
            throw new IllegalArgumentException();
        }
        this.size = size;
    }

    @Override
    public String toString() {
        return "Name='" + Name + '\'' +
                "coordinate=" + coordinate.toString() +
                ", color=" + color +
                ", age=" + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Star star = (Star) o;
        return age == star.age && Objects.equals(coordinate, star.coordinate) && Objects.equals(Name, star.Name) && color == star.color && size == star.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate, Name, color, age, size);
    }
}
