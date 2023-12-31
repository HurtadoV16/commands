package commands;
import devices.ElectronicDevice;

public class VolumeDownTelevision implements Command{
    private ElectronicDevice device;
    public VolumeDownTelevision(ElectronicDevice device){
        this.device=device;
    }
    @Override
    public void execute() {
        device.volumDown();
    }

    @Override
    public void undo() {
        device.volumUp();
    }
    
}
