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

    public boolean addElement(SpaceBody spaceBody){
        if(spaceBody == null){
            throw new IllegalArgumentException();
        }
        if (list.contains(spaceBody)){
            return false;
        } else {
            return list.add(spaceBody);
        }
    }

    public boolean deleteElement(SpaceBody spaceBody) {
        if (spaceBody == null) {
            throw new IllegalArgumentException();
        }
        if (!list.contains(spaceBody)) {
            return false;
        } else {
            return list.remove(spaceBody);
        }
    }

    public boolean hasElement(SpaceBody spaceBody){
        if (spaceBody == null) {
            throw new IllegalArgumentException();
        }
        return list.contains(spaceBody);
    }
    //todo добавить тотже элемент
    //todo удаление проверить что нету
    //todo при добавление проверить что элемента нету
    //todo координаты положительные
}
