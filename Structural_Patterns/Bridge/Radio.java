package Structural_Patterns.Bridge;

public class Radio implements Device{
    private boolean enable;
    private int volume;


    @Override
    public boolean isEnable() {
        return enable;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
       this.volume=volume;
    }

    @Override
    public void enable() {
       enable=true;
    }

    @Override
    public void disable() {
        enable=false;
    }
}
