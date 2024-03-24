package se.ifmo.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
public class Display {

    private ArrayList<SpaceBody> list = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("on Display: \n");
        for (SpaceBody spaceBody : list){
            s.append(spaceBody.toString()).append("\n");
        }
        return s.toString();
    }

    public void addElement(SpaceBody spaceBody){
        if(spaceBody == null){
            throw new IllegalArgumentException();
        }
        list.add(spaceBody);
    }
}
