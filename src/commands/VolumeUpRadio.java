package commands;

import devices.ElectronicDevice;

public class VolumeUpRadio implements Command {
    private ElectronicDevice device;
    public VolumeUpRadio(ElectronicDevice device){
        this.device=device;
    }
    @Override
    public void execute() {
        device.volumUp();
    }

    @Override
    public void undo() {
        device.volumDown();
        
    }
}
