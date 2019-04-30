package ro.git;

public class Exerciti {
    public static void fibonaci(int a){
        /*
        Avem formula fibonaci
        noi am atribuit lui n1 si lui n2
        si am introdus intr-un for si la fiecare iterare ne zice cine ii numarul din fibonaci
        astfel avem o suma care ne aduna n1+n2
        dupa aceia lui n1 ii este atribuit n2
        lui n2 ii este atribuit suma din n1+n2 ;
         */
        int n1 = 0,n2=1;
        for (int i = 0;i<= a; i++){
            System.out.println("Number is : "+ n1);
            int sum = n1+n2;
            n1 = n2;
            n2= sum;
        }

    }
}
