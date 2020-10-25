package Multithreading;

public class CandidatesTiming {
    int[] interviewTime;
    int[] trainTime;
    int[] priority;
    CandidatesTiming(int[] interviewTime, int[] trainTime, int[] priority){
        this.interviewTime = interviewTime;
        this.trainTime = trainTime;
        this.priority = priority;
    }

    public void trainTimeSorting(){
        for(int i=0;i<interviewTime.length;i++){
            int minIndex=i;
            for(int j=i+1;j<interviewTime.length;j++){
                if(interviewTime[j]<interviewTime[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = trainTime[minIndex];
            trainTime[minIndex] = trainTime[i];
            trainTime[i] = temp;
            temp = interviewTime[minIndex];
            interviewTime[minIndex] = interviewTime[i];
            interviewTime[i] = temp;
            temp = priority[minIndex];
            priority[minIndex] = priority[i];
            priority[i] = temp;
        }
    }

    public void prioritySorting(){
        int t=0;
        for(int i=0;i<interviewTime.length;i++){
            if(trainTime[i] !=-1) {
                if (t + interviewTime[i] + 30 <= trainTime[i]) {
                    t += interviewTime[i];
                } else {
                    System.out.println("Candidate Id who missed the train is: " + priority[i]);
                }
            }
        }
    }
}
