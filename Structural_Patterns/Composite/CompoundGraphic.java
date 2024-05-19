package Structural_Patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphics{

   List<Graphics> children=new ArrayList<>();

   public void add(Graphics child){
       children.add(child);
   }

   public void remove(Graphics child){
       children.remove(child);
   }
    @Override
    public void move(int x, int y) {
      for(Graphics child:children){
          child.move(x,y);
      }
    }

    @Override
    public void draw() {
       for(Graphics child: children){
           child.draw();
       }
    }
}
