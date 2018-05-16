package headfirst.designpattern.c6;

public class LightOffCommand implements Command {

    private Light light;
    
    public LightOffCommand(Light light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
