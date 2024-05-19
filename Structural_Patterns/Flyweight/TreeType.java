package Structural_Patterns.Flyweight;

import java.util.Objects;

public class TreeType {
    private String name;
    private String color;
    private String texture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public TreeType(String name, String color, String texture){
        this.color=color;
        this.name=name;
        this.texture=texture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeType treeType = (TreeType) o;
        return Objects.equals(name, treeType.name) && Objects.equals(color, treeType.color) && Objects.equals(texture, treeType.texture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, texture);
    }

    public void draw(int x, int y) {
        System.out.println("Drawing a " + name + " tree with " + color + " color and " + texture + " texture at (" + x + ", " + y + ")");
    }
}
