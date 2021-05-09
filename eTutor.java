/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class eTutor {
 private Pupil pupil;
 private String Name;
 private String Subject ;
 private double pricePerHour;
 
 eTutor(String Name,String Subject ,double pricePerHour){
    this.Name = Name;
    this.Subject = Subject;
    this.pricePerHour = pricePerHour;
 }
 
 
 
 
 public String getName(){
     return Name;
 }
 
 public String getSubject(){
     return Subject;
 }
 
 public double getpricePerHour(){
     return pricePerHour;
 }
 
 public void setName(String Name){
     this.Name = Name;
 }
 
 public void setSubject(String Subject){
   this.Subject = Subject;
 }
 
 public void setpricePerHour(int pricePerHour){
      this.pricePerHour = pricePerHour;
 }
 
 public String toString(){
    return "eTutor Information:\nName:" + Name + "\nSubject:" + Subject +
"\npricePerHour:" + pricePerHour;
 }
 
 public Pupil getPupil() {
return pupil;
}

public void setPupil(Pupil pupil) {
this.pupil = pupil;
}
}
