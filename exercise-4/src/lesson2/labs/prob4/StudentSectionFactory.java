package lesson2.labs.prob4;

import java.util.ArrayList;

public class StudentSectionFactory
{
    public static Section createSection(int secNum, String courseName) {
        Section section = new Section();
        section.courseName = courseName;
        section.sectionNumber = secNum;
        section.gradeSheet = new ArrayList<TranscriptEntry>();
        return section;
    }
    
    public static Student createStudent(String id, String name) {
        Student student = new Student();
        student.name = name;
        student.id = id;
        student.grades = new ArrayList<TranscriptEntry>();
        return student;
    }
    
    public static void newTransactionEntry(Student student, Section section, String grade) {
        TranscriptEntry entry = new TranscriptEntry();
        entry.student  = student;
        entry.section = section;
        entry.grade = grade;
        student.grades.add(entry);
        section.gradeSheet.add(entry);
    }
}
