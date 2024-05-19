package Structural_Patterns.Flyweight;

public class Runner {
    public static void main(String[] args) {
        Forest forest=new Forest();
        forest.plantTree(1, 2, "oak", "green", "smooth");
        forest.plantTree(3, 4, "pine", "brown", "rough");
        forest.plantTree(5, 6, "oak", "green", "smooth");
        forest.plantTree(7, 8, "pine", "brown", "rough");
        forest.plantTree(9, 10, "willow", "green", "smooth");
        forest.plantTree(11, 12, "oak", "green", "smooth");

        System.out.println("Number of unique TreeType instances created: " + TreeFactory.treeTypes.size());
        forest.draw();
    }
}
