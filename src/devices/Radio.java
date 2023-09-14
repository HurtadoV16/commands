package devices;

public class Radio implements ElectronicDevice {
    private int volumen = 0;
    private String name;

    public Radio(String name) {
        this.name = name;
    }
    @Override
    public void on() {
        System.out.println(name + "RADIO is on");
    }
    @Override
    public void off() {
        System.out.println(name + "RADIO is off");
    }
    @Override
    public void volumUp() {
        volumen++;
       System.out.println(name + "RADIO  Volumen at:" + volumen);
    }
    @Override
    public void volumDown() {
        volumen--;
       System.out.println(name + "RADIO  Volumen at:" + volumen);
    }
    
}
