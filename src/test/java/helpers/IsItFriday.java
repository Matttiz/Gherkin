package helpers;

public class IsItFriday {
    static String isItFriday(String today) {
        if (today.equals("Friday")){
            return "Yeah";
        } else {
            return "Nope";
        }
    }
}