import java.util.LinkedList;
import java.util.Queue;

public class Multiprocessor {
    int totalTime =0;
    int averageWaitTime;
    int averageTurnaround;
    int averageResponse;
    int waitTime =0;
    int t;
    
    public Queue<Processes> queue1 = new LinkedList<Processes>();
    public Queue<Processes> queue2 = new LinkedList<Processes>();
    public Queue<Processes> queue3 = new LinkedList<Processes>();
    public Queue<Processes> queue4 = new LinkedList<Processes>();
    
    public Processes[] process = {new Processes(10,"p1"),new Processes(20,"p2"),
               new Processes(30,"p3"),new Processes(25,"p4"),
               new Processes(10,"p5"), new Processes(50,"p6"), new Processes(40, "p7"), new Processes(40,"p8")};
    
    void runMP(){
        for(int z = 0; z < 8; z++){
            process[z].isPositive(process[z]);
        }
        queue1.add(process[0]);
        queue1.add(process[1]);
        queue2.add(process[2]);
        queue2.add(process[3]);
        queue3.add(process[4]);
        queue3.add(process[5]);
        queue4.add(process[6]);
        queue4.add(process[7]);
        
        while(!queue1.isEmpty() || !queue2.isEmpty() || queue3.isEmpty() || queue4.isEmpty()){
       
          
                if(!queue1.isEmpty()){
                    if(queue1.element().getTime() <= 0){
                        queue1.element().setTurnaround(totalTime);
                        queue1.remove();
                    if(!queue1.isEmpty()){
                        queue1.element().setResponse(totalTime);
                        queue1.element().setWaitTime(totalTime);
                    }
            }
                }
                if(!queue2.isEmpty()){
                    if(queue2.element().getTime() <=0){
                            queue2.element().setTurnaround(totalTime);
                            queue2.remove();
                        if(!queue2.isEmpty()){
                            queue2.element().setResponse(totalTime);
                            queue2.element().setWaitTime(totalTime);
                        }
            }
                }
            if(!queue3.isEmpty()){
                if(queue3.element().getTime() <= 0){
                    queue3.element().setTurnaround(totalTime);
                    queue3.remove();
                if(queue3.isEmpty()){
                    queue3.element().setResponse(totalTime);
                    queue3.element().setWaitTime(totalTime);
                }
            }
            }
            if(!queue4.isEmpty()){
                if(queue4.element().getTime() <= 0){
                queue4.element().setTurnaround(totalTime);
                queue4.remove();
                if(!queue4.isEmpty()){
                queue4.element().setResponse(totalTime);
                queue4.element().setWaitTime(totalTime);
                }
            }
            }
            totalTime++;
            
          if(!queue1.isEmpty()){
            t = queue1.element().getTime() - 1;
            queue1.element().setTime(t);
          }
          if(!queue2.isEmpty()){
            t = queue2.element().getTime() - 1;
            queue2.element().setTime(t);
          }
          if(!queue3.isEmpty()){
            t= queue3.element().getTime() - 1;
            queue3.element().setTime(t);
          }
          if(!queue4.isEmpty()){
            t=queue4.element().getTime() - 1;
            queue4.element().setTime(t);
          }
            }
    
    
    }

    
    void addStats(){
          for (int i =0; i < 8; i++){
               // add up all of the wait times for the processes 
               averageWaitTime =averageWaitTime+ process[i].getwaitTime();
               // adds up all of the turnaround times for the processes
               averageTurnaround= averageTurnaround + process[i].getTurnaround();
               // add up all of the response time for the process
               averageResponse = averageResponse + process[i].getResponse();
           }
           // Calculates the averages for the wait time, turnaround, and responses times.
           averageWaitTime = averageWaitTime/8;
           averageTurnaround = averageTurnaround/8;
           averageResponse = averageResponse/8;
    }
     void showStatsMP(){
               System.out.println("Multiprocessor: ");
               System.out.printf("Average Wait Time: %d ms\n",averageWaitTime);
               System.out.printf("Average Turnaround Time: %d ms\n",averageTurnaround);
               System.out.printf("Average Response Time: %d ms\n", averageResponse);
           }
}
