import java.util.Scanner;

public class Switchcases {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruits = input.next();
        switch (fruits) {
            case "Mango": // the value for this switch case needs to be unique in this mango cant be used as another case.
                System.out.println("mango is a sweet yellow fruit also known as king of fruits");
                break;     // if we dont use break all the following cases will also execute.
            case "Apple":
                System.out.println("Apple is a sweet red fruit which is round in shape");
                break;
            case "Grape":
                System.out.println("Grape is a small fruit which is mid and trash");
                break;       
            default:
                System.out.println("spelling dhang se likhle aur pehla character uppercase likh");
                break; //not necessary if default is at end
        }
        // we can also write the switch cases like this its way more cleaner
        // switch (fruits){
        //     case "Mango" -> System.out.println("mango is a sweet yellow fruit also known as king of fruits");
        //     case "Apple" -> System.out.println("Apple is a sweet red fruit which is round in shape");
        //     case "Grape" -> System.out.println("Grape is a small fruit which is mid and trash");
        //     default -> System.out.println("spelling dhang se likhle aur pehla character uppercase likh");
        // }
    }
}

