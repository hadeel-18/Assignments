/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Pupil {
private String Name;
private String Level;
private static int NoOfPupil;

public Pupil(){
    NoOfPupil++;
}

public Pupil(String Name , String Level){
    this.Name = Name;
    this.Level = Level;
    NoOfPupil++;
}

public void setName(String Name){
    this.Name = Name;
}

public void setLevel(String Level){
     this.Level = Level;
}

public String GetName(){
    return Name;
}

public String GetLevel(){
    return Level;
}

public static int getNoOfPupil (){
    return NoOfPupil;
}

public double Discount (){
    switch(Level){
        case "Secondary":
          return 0.15;
          case "Intermediate":
          return 0.1;
          case"Primary":
            return 0.05;
            case"Preschool":
            return 0;         
    }
    return -1 ;     
}

public String toString (){
    return "Pupil{" + "Name=" + Name + ", Level=" + Level + '}';
}

}
