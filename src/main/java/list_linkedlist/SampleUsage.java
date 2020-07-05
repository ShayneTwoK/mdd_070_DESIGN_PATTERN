package list_linkedlist;

import java.util.Iterator;

public class SampleUsage {

    public static void main(String[] args) {
        System.out.println("Mon ArrayMaList :");
        ArrayMaList arrayMaList = new ArrayMaList();

        arrayMaList.add("cocombre");
        arrayMaList.add("carotte");
        arrayMaList.add("courgette");
        arrayMaList.add("oignon");
        arrayMaList.add("radis");

        arrayMaList.add(1,"LegumeInconnu1");
        arrayMaList.add(4,"LegumeInconnu2");

        for (Iterator<String> IteratorArray = arrayMaList.iterator(); IteratorArray.hasNext();){
            String element = IteratorArray.next();
            System.out.println(element);
        }

        System.out.println("---------------");
        System.out.println("---------------");

        System.out.println("Ma LinkedMaListe :");

        LinkedMaList linkedMaList = new LinkedMaList();
        linkedMaList.add("0");
        linkedMaList.add("1");
        linkedMaList.add("2");
        linkedMaList.add("3");
        linkedMaList.add("4");
        linkedMaList.add("5");

        linkedMaList.add(1, "nombreInconnu1");
        linkedMaList.add(3, "nombreInconnu2");

        for (Iterator<String> IteratorArray = linkedMaList.iterator(); IteratorArray.hasNext();) {
            String element = IteratorArray.next();
            System.out.println(element);
        }
    }
}