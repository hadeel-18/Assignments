
import java.io.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class eTutoServiceSystem {

    /**
     * @param args the command line arguments
     */
    public static eTutor read_eTutor_info(Scanner read) {
        String name = read.next();
        String subject = read.next();
        int number = read.nextInt();
        eTutor s = new eTutor(name, subject, number);
        return s;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File inputFor = new File("eTutors-input.txt");
        Scanner input = new Scanner(inputFor);
        File out = new File("print.txt");
        PrintWriter outp = new PrintWriter(out);
        Scanner t = new Scanner(System.in);

        if (!inputFor.exists()) {
            System.out.println("the file doesn't exist");
            System.exit(0);
        }

        int a = input.nextInt();
        eTutor[] eTutors = new eTutor[a];

        for (int i = 0; i < eTutors.length; i++) {
            eTutors[i] = read_eTutor_info(input);
        }
        
        for (int i = 0; i < eTutors.length; i++) {
            System.out.println("\n" + eTutors[i].toString());
        }
  
        System.out.println("Please Enter Pupil Information:");
        System.out.println("Pupil Name: ");
        String n1 = t.next();
        System.out.println("Pupil Level (Secondary,Intermediate,Primary,Preschool");
        String n2 = t.next();
        System.out.println("Please Enter eTutor Name: ");
        String n3 = t.next();
        System.out.println("Enter Number of Required hours: ");
        double n4 = t.nextDouble();
        Pupil p = new Pupil(n1, n2);
        for (int i = 0; i < eTutors.length; i++){
            if(!eTutors[i].getName().equals(n3)) { 
                 }
            else{
            //    System.out.println("check the recipt");
               // eTutors[i].setPupil(p);
                outp.println("sevise system");
               outp.println(p.toString());
               outp.println(eTutors[i].toString());
               outp.println("Number of hours "+n4);
               outp.println("dis"+p.Discount());
               
            //   eTutor n = new eTutor (n3,n2,n4);
               
             double j = (eTutors[i].getpricePerHour()*n4)/(p.Discount()+1);
             outp.println("total price "+j);
              outp.println("thank you");
                              System.out.println("check the recipt");
        outp.close();
        input.close();
            System.exit(0);
            }
           }
        System.out.println("not found");
       
       


}
    
}
