import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("A");
        lista.add("B");

        System.out.println(lista);
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }

        /// /uysunac liste
        lista.remove(lista.indexOf(0));
        lista.remove(lista.lastIndexOf(0));


    }
}