import java.util.*;
class Candidate {
    int candidate_id;
    String candidate_name;
    int candidate_age;
    double candidate_weight;
    double candidate_height;
    
    public void getCandidateDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Candidate Id : ");
        candidate_id = sc.nextInt();
        
        System.out.print("Enter Candidate Name : ");
        candidate_name = sc.next();
        
        System.out.print("Enter Candidate Age : ");
        candidate_age = sc.nextInt();
        
        System.out.print("Enter Candidate Weight(kgs) : ");
        candidate_weight = sc.nextDouble();
        
        System.out.print("Enter Candidate Height(feet) : ");
        candidate_height = sc.nextDouble();
    }
    
    public void displayDetails(){
        System.out.println(candidate_id + " " + candidate_name + " " + candidate_age + " " + candidate_weight + " " + candidate_height);
    }
}

public class L7P2{
    public static void main(String[] args){
        Candidate c1 = new Candidate();
        c1.getCandidateDetails();
        c1.displayDetails();
    }
} 
