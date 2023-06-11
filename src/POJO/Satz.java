package POJO;

import java.util.ArrayList;
import java.util.List;


interface iParent {
    List<iChild> GetChildren();
}

public class Satz implements iParent, iChild {
    Subject subject;
    Predicate predicate;
    Objekt object;
    Satzzeichen satzzeichen;

    public Satz (Subject subject, Predicate predicate, Objekt object, Satzzeichen satzzeichen) {
        this.subject = subject;
        this.predicate = predicate;
        this.object = object;
        this.satzzeichen = satzzeichen;
    }



    @Override
    public List<iChild> GetChildren() {
        // TODO Auto-generated method stub
        List<iChild> children = new ArrayList<iChild>();
        children.add(subject);
        children.add(predicate);
        children.add(object);
        children.add(satzzeichen);
        return children;
    }



    @Override
    public void getText() {
        // TODO Auto-generated method stub
        List<iChild> children = this.GetChildren();
        children.forEach(iChild -> iChild.getText());
    }
}
