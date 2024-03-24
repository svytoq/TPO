package se.ifmo.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
public class BinaryStarSystem {
    private Star star1;
    private Star start2;


    public BinaryStarSystem(Star star1, Star start2) {
        if(star1 == null || start2 == null){
            throw new IllegalArgumentException();
        }
        this.star1 = star1;
        this.start2 = start2;
    }
}
