package POJO;

public class Subject implements iChild {
    String praedikat;
    String nomen;
    public Subject(String praedikat, String nomen) {
        this.praedikat = praedikat;
        this.nomen = nomen;
    }
    @Override
    public void getText() {
        // TODO Auto-generated method stub
    System.out.print( praedikat + " " + nomen);        }
}