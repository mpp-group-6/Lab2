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
public class Student {
    private GradeReport gradeRep;
    private String name;
    
    public Student(String name){
        this.name=name;
        gradeRep=new GradeReport(this);
    }
    
    public String getName(){
        return name;
    }
    
    public GradeReport getGradeReport(){
        return gradeRep;
    }
    
    @Override
    public String toString(){
        return name+" : "+getGradeReport().getGrade();
    }
    
}
