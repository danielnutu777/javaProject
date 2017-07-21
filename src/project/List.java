package project;

import com.company.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class List {
    ArrayList<Integer> lista = new ArrayList<>();
    int x, a, b;
    int n = 4;

    public void addElementsToList(){
        com.company.ReadInput readInput = new com.company.ReadInput();
        System.out.println("Introduceti un numar: ");
         a = readInput.readNumber();
        System.out.println("Introduceti inca un numar: ");
         b = readInput.readNumber();
    }
    public void createList(){

        for(x = a; a < b; a++){
            lista.add(a);
        }
        Collections.shuffle(lista);
        System.out.println(lista);
    }
    public void removeNthElemAndSort(){
        Collections.sort(lista);
        System.out.println(lista);
        for(int m = 0; m < lista.size(); m++){
            lista.get(m);
               for(int v = m; v < lista.size(); v++){
                   if(lista.get(v)% 4 == 0){
                       lista.remove(v);
                   }
               }
        }
        System.out.println(lista);
    }

}
