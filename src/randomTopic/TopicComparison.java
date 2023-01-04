package randomTopic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TopicComparison {

	public static void main(String[] args) {
		 // Initialize a list of topics
        List<String> topics = new ArrayList<>();
        topics.add("Sports");
        topics.add("Technology");
        topics.add("Fashion");
        topics.add("Food");
        topics.add("Entertainment");

        // Initialize a list of votes for each topic
        List<Integer> votes = new ArrayList<>();
        votes.add(10);
        votes.add(25);
        votes.add(15);
        votes.add(30);
        votes.add(20);

        
        // Determine the most wanted topic
        int maxVotes = Collections.max(votes);
        int mostWantedIndex = votes.indexOf(maxVotes);
        String mostWantedTopic = topics.get(mostWantedIndex);

        // Create a link for the most wanted topic
        String link = "https://www.example.com/topics/" + mostWantedTopic;
        
        
        // Initialize a list of email addresses
        List<String> emails = new ArrayList<>();
        emails.add("ammalnassri@gmail.com");
        
        
        for (String email : emails) {
            sendEmail(email, link);
        }
      
	}
	  public static void sendEmail(String to, String link) {
          // Code to send an email with the link to the specified address
      }

}
