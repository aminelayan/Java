import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name,String dayPeriod) {
        String Greeting= String.format("Good %s, %s. Lovely to see you.", dayPeriod,name);
        return Greeting;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        String Date= String.format("It is currently %s",date);
        return Date;

    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis")!=-1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if(conversation.indexOf("Alfred")!=-1){
            return "At your service. As you wish, naturally.";
        }
        else {
            return  "Right. And with that I shall retire.";
        }
    }
    }
    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!


