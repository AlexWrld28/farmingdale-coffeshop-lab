/**
 * @Author Jomar Lubin
 * @Author Alex "Write Your last name here Alex"
 *
 * After reading and understanding the assignment, I deemed the
 * previous "HotSetFactory.java" and "DriverClass.java" unnecessary
 *
 * The instruction are clear on the names of the classes we need.
 *
 * Beverage being the first one which needs to either be an Interface or Abstract
 *
 * I chose to make it abstract because we will be implementing the "Abstract Factory Design"
 */
public abstract class Beverage {

    // here we should create the options fields like  hot, iced, sugar, milk etc
    /**
     * These are the fields we will use in the switch cases to assign custom options
     * to each drink. I don't think were missing any but feel free to add fields
     * if you come up with them, just ensure you modify the methods that require
     * the fields.
     */
    private String name;
    private String temperature;
    private String shots;
    private String milk;
    private String Sweetener;

    //we may also need an abstract method here, but I'm not to sure so ill skip it for now

}

/**
 * MANDATORY CLASSES ACCORDING TO THE INSTRUCTIONS
 * I'll create this in one file but if we want we
 * can transfer them to individual .java pictures
 */
class Coffee extends Beverage{

}

class Tea extends Beverage{

}

class Latte extends Beverage{

}


