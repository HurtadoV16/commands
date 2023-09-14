package commands;

import devices.ElectronicDevice;

public class TurnOffTelevicion implements Command {
    private ElectronicDevice device;
    public TurnOffTelevicion(ElectronicDevice device){
        this.device=device;
    }
     @Override
     public void execute() {
     device.off();
     }  
     
     @Override
     public void undo() {
       device.on();
     } 
}
