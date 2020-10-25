https://www.codechef.com/problems/KGP14D
/*Check the link for the question and then check the sample run*/

MULTITHREADING

Professor Calculus wishes to hire graduate engineers for a few open positions in his funded
projects. He has called K candidates for interview (numbered from 1 to K), and based on the
profile of the candidates, has decided on an estimated time duration of interview for each
candidate. A single interview board is going to conduct all the interviews. Assume that the
interview board starts the interviews at time t = 0. Since candidates from outside the town may
want to go back on the same day, Professor Calculus has asked each candidate for the departure
time of the train that they wish to take to go back after the interview. Non local candidates have
indicated such times, while others have not.
In order to cause any inconvenience to as few of the candidates as possible, Professor Calculus
attempts to order the interviews such that the number of candidates who wish to go back the
same day after the interview are given highest priority. Among the local and non local
candidates, the one with least estimated interview time is given highest priority. Assume that to
catch a train, the interview of each candidate has to end at least 30 minutes before the departure
time of the train the candidate wishes to take. You can also assume that all departure times
specified are more than 30 minutes after the start of the first interview at t = 0.
Schedule the interviews for the candidate based on the priority computed. Apply multithreading
concept for the given scenario. Create k threads for different candidates, schedule their
interviews and find out the list of candidates who will miss the train

SAMPLE RUN

Enter no of candidates: 4

Enter the estimated interview time: 35 45 40 35

Enter the departure time : 70 90 110 -1

Candidate id who will miss the train: 2
