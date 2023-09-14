import commands.TurnOffRadio;
import commands.TurnOffTelevicion;
import commands.TurnOnRadio;
import commands.TurnOnTelevision;
import commands.VolumeUpRadio;
import commands.VolumeUpTelevision;
import devices.ElectronicDevice;
import devices.Radio;
import devices.Televicion;

public class App {
    public static void main(String[] args) throws Exception {
        ElectronicDevice televisionOne = new Televicion("SAMSUNG  ");
        TurnOnTelevision onCommand = new TurnOnTelevision(televisionOne);
        DeviceButton onPressed;
        onPressed = new DeviceButton(onCommand);
        onPressed.press();
        TurnOffTelevicion offCommand = new TurnOffTelevicion(televisionOne);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();
        VolumeUpTelevision volUpCommand = new VolumeUpTelevision(televisionOne);
        onPressed = new DeviceButton(volUpCommand);
        onPressed.press();
        onPressed.press();
        onPressed.press();
        ElectronicDevice radioUno = new Radio("radio 1  ");
        TurnOnRadio oncommand = new TurnOnRadio(radioUno);
        DeviceButton onpressed;
        onpressed = new DeviceButton(oncommand);
        onpressed.press();
        TurnOffRadio offcommand = new TurnOffRadio(radioUno);
        onpressed = new DeviceButton(offcommand);
        onpressed.press();
        VolumeUpRadio volUpcommand = new VolumeUpRadio(radioUno);
        onpressed = new DeviceButton(volUpcommand);
        onpressed.press();
        onpressed.press();
        onpressed.press();
    }
}
