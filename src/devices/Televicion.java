package devices;

public class Televicion implements ElectronicDevice {
    private int volumen = 0;
    private String name;

    public Televicion(String name) {
        this.name = name;
    }
    @Override
    public void on() {
        System.out.println(name + "TV is on");
    }
    @Override
    public void off() {
        System.out.println(name + "TV is off");
    }
    @Override
    public void volumUp() {
        volumen++;
       System.out.println(name + "TV Volumen at:" + volumen);
    }
    @Override
    public void volumDown() {
        volumen--;
       System.out.println(name + "TV  Volumen at:" + volumen);
    }
    
}
