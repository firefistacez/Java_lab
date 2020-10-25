package Multithreading;
import java.util.*;

public class ProjectsInterview {
    public static void main(String[] args) {
        int[] priority;
        Candidates candidates;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of candidates: ");
        int count = scanner.nextInt();
        priority = new int[count];

        System.out.print("Enter the estimated interview time: ");
        String interview = "";
        interview = scanner.nextLine();
        interview += scanner.nextLine();
        String[] interviewParts = interview.split(" ");
        int[] interviewTime = new int[count];

        System.out.print("Enter the departure time: ");
        String departure = scanner.nextLine();
        String[] departureParts = departure.split(" ");
        int[] departureTime = new int[count];

        for(int i=0;i<count;i++){
            interviewTime[i] = Integer.parseInt(interviewParts[i]);
            departureTime[i] = Integer.parseInt(departureParts[i]);
            priority[i] = i+1;
        }

        candidates = new Candidates(interviewTime, departureTime, priority);
        candidates.start();
        try{
            candidates.join();
        }catch (Exception e){System.out.print(e);}
    }
}
