package Structural_Patterns.Bridge;

public class RemoteControl {
    protected Device device;
    public RemoteControl(Device device){
        this.device=device;
    }

    public void togglePower(){
        if(device.isEnable()){
            device.disable();
        }
        else device.enable();
    }

    public void volumeUp(){
        device.setVolume(device.getVolume()+1);
    }
    public void volumeDown(){
        device.setVolume(device.getVolume()-1);
    }

}
