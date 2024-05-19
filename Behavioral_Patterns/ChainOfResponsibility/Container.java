package Behavioral_Patterns.ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Container extends Component{
    protected List<Component> children=new ArrayList<>();
    public void add(Component child){
        children.add(child);
        child.container=this;
//        incomeple.....
    }
}
