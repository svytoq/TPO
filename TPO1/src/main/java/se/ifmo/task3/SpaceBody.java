package se.ifmo.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import se.ifmo.task3.enums.Color;


public interface SpaceBody {


    public  void moveTo(Coordinate coordinate2);


    public String toString();
}
