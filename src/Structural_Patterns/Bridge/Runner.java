package Structural_Patterns.Bridge;

public class Runner {
    public static void main(String[] args) {
        Tv tv=new Tv();
        tv.enable();
        tv.setVolume(10);
        RemoteControl remote=new RemoteControl(tv);
        remote.togglePower();
        System.out.println(tv.isEnable());

    }
}
