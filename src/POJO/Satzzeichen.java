package POJO;

public class Satzzeichen implements iChild {
    String satzzeichen;

    public Satzzeichen(String satzzeichen) {
        this.satzzeichen = satzzeichen;
    }

    @Override
    public void getText() {
        // TODO Auto-generated method stub
    System.out.print( " "+satzzeichen);        }

}