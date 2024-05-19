package Structural_Patterns.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class TreeFactory {
    public static List<TreeType>treeTypes=new ArrayList<>();
    public static TreeType getTreeType(String name, String texture, String color){


        for(TreeType type: treeTypes){
            if (type.getName().equals(name) && type.getTexture().equals(texture) && type.getColor().equals(color)) {
                return type;
            }
        }
        TreeType newtype=new TreeType(name,color,texture);

        treeTypes.add(newtype);
        return newtype;

    }
}
