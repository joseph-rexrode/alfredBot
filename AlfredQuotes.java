import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello, " + name + ", lovely to see you.";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") >= 0) {
            return "At once, sir. You can't trust that program for anything";
        }

        else if (conversation.indexOf("Alfred") >= 0) {
            return "Of course, I'm always at your service~";
        }

        else {
            return "You know typically a name is used when requesting something of someone";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method

    public String guestGreeting() {
        Date newDate = new Date();
        SimpleDateFormat simpleFormat = new SimpleDateFormat();
        String newPattern = "HH";
        simpleFormat.applyPattern(newPattern);
        String currentHour = simpleFormat.format(newDate);
        int hour = Integer.valueOf(currentHour);

        if (hour < 12) {
            return "Good morning, lovely to see you.";
        }

        else if (hour > 12 && hour < 18) {
            return "Good afternoon, lovely to see you.";
        }

        else {
            return "Good evening, lovely to see you.";
        } 
    }
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!

    public String goToBed() {
        Date date = new Date();
        SimpleDateFormat simpleFormat = new SimpleDateFormat();
        String pattern = "HH.mm";
        simpleFormat.applyPattern(pattern);
        String time = simpleFormat.format(date);
        float currentTime = Float.valueOf(time);

        if (currentTime > 20.00) {
            return "Sir, GO TO BED";
        }

        else {
            return "It is not yet time to go to bed.";
        }
    }
}

