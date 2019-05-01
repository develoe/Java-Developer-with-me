package ro.git;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //TODO Create a app Home Inteligents
        //TODO Create A Class Home
        Home home = new Home("Nechiforel", true);
        home.setMetriPatrati(home.calculeazaM4(10.5,7.8));
        System.out.printf("%.2f",home.getMetriPatrati());




    }
}
