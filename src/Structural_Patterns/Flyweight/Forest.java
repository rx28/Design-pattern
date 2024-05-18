package Structural_Patterns.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private List<Tree> trees=new ArrayList<>();

    public void plantTree(int x, int y , String name, String color, String texture){
        TreeType type=TreeFactory.getTreeType(name, texture, color);
        Tree tree=new Tree(x,y,type);
        trees.add(tree);
    }
    public void draw(){
        for(var tree: trees){
            tree.draw();
        }
    }

}
