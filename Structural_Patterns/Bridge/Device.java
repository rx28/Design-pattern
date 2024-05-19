package Structural_Patterns.Bridge;

public interface Device {
    public boolean isEnable();
    public int getVolume();
    public void setVolume(int volume);

    public void enable();
    public void disable();

}
