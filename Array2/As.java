package Array2;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;

public class As {

    ArrayList<String> carros = new ArrayList<>();
    ArrayList<String> ex = new ArrayList<>(5);

    public void teste() {

        carros.add("Fusca");
        carros.add("Monza");
        carros.add("Brasília");
        carros.add("Chevette");
        carros.add("Corsa");
        carros.add("Gol");
        System.out.println(carros);

        Collections.sort(carros);

        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        for (String nc : carros) {
            System.out.println(nc);

        }
        carros.clear();

    }

    public void teste2(){
        ex.add("10");
        ex.add("20");
        ex.add("15");
        ex.add("5");
        ex.add("25");
        col

    }
}
