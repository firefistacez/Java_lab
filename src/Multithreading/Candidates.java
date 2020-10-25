package Multithreading;

public class Candidates extends Thread {
    Thread candidate;
    CandidatesTiming candidatesTiming;
    Candidates(int[] interviewTime, int[] departureTime, int[] priority){
        candidatesTiming = new CandidatesTiming(interviewTime, departureTime, priority);
        candidate = new Thread(this, "Candidate Thread");
        System.out.println("Candidate Thread created" + candidate);
    }

    @Override
    public void run() {
        try{
            candidatesTiming.trainTimeSorting();
            candidatesTiming.prioritySorting();
        }
        catch (Exception e) {
            System.out.println("Candidate Thread interrupted");
        }
    }
}
