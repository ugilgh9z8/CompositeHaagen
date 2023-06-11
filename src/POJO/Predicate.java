package POJO;

public class Predicate implements iChild {
    String verb;

    public Predicate(String verb) {
        this.verb = verb;
    }

    @Override
    public void getText() {
        // TODO Auto-generated method stub
    System.out.print( " "+ verb );        }

}