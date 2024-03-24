package se.ifmo.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        if (x < 0 || y < 0){
            throw new IllegalArgumentException();
        }
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        if (x < 0 ){
            throw new IllegalArgumentException();
        }
        this.x = x;
    }

    public void setY(int y) {
        if ( y < 0){
            throw new IllegalArgumentException();
        }
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
