/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpp_cours.Prob2A;

/**
 *
 * @author Emmanuel Cadet
 */
  public class GradeReport {
    private String grade;
    private Student stud;
    
    GradeReport(Student stud){        
        this.stud = stud;
        this.grade = grade;
    }
    
    public void setGrade(String gr){
        grade=gr;
    }
    
    public Student getStudent(){
        return stud;
    }
        
    public String getGrade(){
        return grade;
    }
    
}
