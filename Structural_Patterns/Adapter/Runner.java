package Structural_Patterns.Adapter;

public class Runner {
    public static void main(String[] args) {
        RoundHole hole=new RoundHole(5);
        RoundPeg roundPeg=new RoundPeg(5);
        System.out.println(hole.fits(roundPeg));

        //An adapter class lets you fit square pegs into round holes.
        SquarePeg squarePeg=new SquarePeg(5);
        SquarePegAdapter squarePegAdapter=new SquarePegAdapter(squarePeg);
        System.out.println(hole.fits(squarePegAdapter));

    }
}
