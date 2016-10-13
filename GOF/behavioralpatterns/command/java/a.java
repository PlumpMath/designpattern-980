import java.util.List;
import java.util.ArrayList;

/** The Command interface */
public interface Command {
  void execute();
}

/** The Invoker class */
public class Switch {
  private List<Command> history = new ArrayList<Command>();

  public void storeAndExecute(Command cmd) {
    this.history.add(cmd); // optional 
    cmd.execute();
  }
}

/** The Receiver class */
public class Light {

  public void turnOn() {
    System.out.println("The light is on");
  }

  public void turnOff() {
    System.out.println("The light is off");
  }
}

/** The Command for turning on the light - ConcreteCommand #1 */
public class FlipUpCommand implements Command {
  private Light theLight;

  public FlipUpCommand(Light light) {
    this.theLight = light;
  }

  @Override    // Command
  public void execute() {
    theLight.turnOn();
  }
}

/** The Command for turning off the light - ConcreteCommand #2 */
public class FlipDownCommand implements Command {
  private Light theLight;

  public FlipDownCommand(Light light) {
    this.theLight = light;
  }

  @Override    // Command
  public void execute() {
    theLight.turnOff();
  }
}

/* The test class or client */
public class PressSwitch {
  public static void main(String[] args){
    // Check number of arguments
    if (args.length != 1) {
      System.err.println("Argument \"ON\" or \"OFF\" is required.");
      System.exit(-1);
    }

    Light lamp = new Light();
    Command switchUp = new FlipUpCommand(lamp);
    Command switchDown = new FlipDownCommand(lamp);

    Switch mySwitch = new Switch();

    switch(args[0]) {
      case "ON":
        mySwitch.storeAndExecute(switchUp);
        break;
      case "OFF":
        mySwitch.storeAndExecute(switchDown);
        break;
      default:
        System.err.println("Argument \"ON\" or \"OFF\" is required.");
        System.exit(-1);
    }
  }
}
