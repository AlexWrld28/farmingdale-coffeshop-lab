

public class CupSetFactory {

    public Cup getInstance(String str){

        switch (str){
            case "Large": return new largeCup();
            case "Medium": return new mediumCup();
            case "Small":
            default: return new smallCup();
        }
    }
}
