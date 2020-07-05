package list_linkedlist;

public class Demo {

    public void compterLesNombresPairs(MaList arrayMaList) {
//
//        for (int i = 0; i <= arrayMaList.size(); i++) {
//
//            if (arrayMaList[i] % 2 == 0){
//                System.out.println(arrayMaList[i] + "est pair");
//            }
//            else {
//                System.out.println(arrayMaList[i] + "est impair");
//            }
//
//        }
//        // TODO
    }

    public void test() {
        ArrayMaList arrayMaList = new ArrayMaList();
        LinkedMaList linkedMaList = new LinkedMaList();

        compterLesNombresPairs(arrayMaList);
        compterLesNombresPairs(linkedMaList);
    }
}
