package ro.git;

public class Home {
    // TODO Atribute
    private String numeCasa;
    private double metriPatrati;
    private boolean casaPasiva;
    private boolean bransamentGaz;
    // TODO Acesta nu este considerat fiind mebru al clasei
    public Home(String numeCasa , boolean casaPasiva){
        this.numeCasa = numeCasa;
        this.casaPasiva = casaPasiva;
    }
    public boolean izoleazaCasa(){
        return casaPasiva == false ? false : true;
    }
    public double calculeazaM4(double lungime,double latime){
        return lungime*latime;
    }

    public void setMetriPatrati(double metriPatrati) {
        this.metriPatrati = metriPatrati;
    }
    public double getMetriPatrati(){
        return this.metriPatrati;
    }

    @Override
    public String toString() {
        return "Casa pe care ati apelat-o se cheama " + this.numeCasa + " metriPatrati  = " + this.metriPatrati;
    }
}
