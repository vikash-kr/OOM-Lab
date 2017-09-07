package testclass;
import java.util.*;
import java.io.*;

class TestClass {
    static int t, i,j,k;
    int TotalStudent;
    
    public static void main(String args[] ) throws Exception {
      Scanner s = new Scanner(System.in);
      t= s.nextInt(); //Test Case
      for(i=0; i<t; i++)
      { 
        TestClass Test = new TestClass();
        Test.TotalStudent= s.nextInt();
        //Batch b = new Batch(Test.TotalStudent);
        Student[] St = new Student[Test.TotalStudent];
        for(j=0; j<Test.TotalStudent; j++){
          String s1 = s.next();
          String s2 = s.next();
          St[j] = new Student(s1, s2);
          //System.out.println(St[j].RollNumber + " "+St[j].StudentName);
        }
        
        for(k=0; k<Test.TotalStudent; k++){
          
          int TotalAssignment = s.nextInt();
          System.out.println(St[k].RollNumber + " " +St[k].StudentName);
          //System.out.println("Total assignment " +Test.TotalAssignment);
          Assignment[] ArrayAssn = new Assignment[TotalAssignment];
          AssignmentType0[] ArrayType0 = new AssignmentType0[TotalAssignment];
          AssignmentType1[] ArrayType1 = new AssignmentType1[TotalAssignment];
          AssignmentType2[] ArrayType2 = new AssignmentType2[TotalAssignment];
          
                int CountType0= 0;
                int CountType1= 0;
                int CountType2= 0;
                int GlobalCount = 0;
                
                int TotalMarks0 = 0;
                int TotalMarks1 = 0;
                int TotalMarks2 = 0;
                int Total = 0;

          while(TotalAssignment>0){
            String TempID = s.next();
            int AssignmentType= s.nextInt();

            switch(AssignmentType){
                
            case 0:
              String CheckerName = s.next();
              String NotesOfChecker = s.next();
              int Marks = s.nextInt();

              ArrayType0[CountType0] = new AssignmentType0(TempID, AssignmentType, CheckerName, NotesOfChecker, Marks);
              ArrayAssn[GlobalCount] = new Assignment();
              ArrayAssn[GlobalCount]= ArrayType0[CountType0];
              TotalMarks0 = TotalMarks0 + ArrayType0[CountType0].SetMarks();
              CountType0++;
              GlobalCount ++;
              break;

            case 1:
                int Correct = s.nextInt();
                int Incorrect = s.nextInt();
                ArrayType1[CountType1] = new AssignmentType1(TempID, AssignmentType, Correct, Incorrect);
                ArrayAssn[GlobalCount] = new Assignment();
              ArrayAssn[GlobalCount]= ArrayType1[CountType1];
                TotalMarks1 = TotalMarks1 + ArrayType1[CountType1].SetMarks();
                CountType1++;
                GlobalCount ++;
                break;

            case 2:
              int TimeTaken= s.nextInt();
              int Pelanty = s.nextInt();
              String LanguageUsed = s.next();
              int CorrectMarks = s.nextInt();

              ArrayType2[CountType2] = new AssignmentType2(TempID, AssignmentType, TimeTaken, Pelanty, LanguageUsed, CorrectMarks);
              ArrayAssn[GlobalCount] = new Assignment();
              ArrayAssn[GlobalCount]= ArrayType2[CountType2];
              TotalMarks2 = TotalMarks2 + ArrayType2[CountType2].SetMarks();
              CountType2++;
              GlobalCount ++;
              break;
            }

            TotalAssignment--;
         }
            //Output
               Total = TotalMarks0 + TotalMarks1+ TotalMarks2;
               System.out.println(Total);
               for(j=0; j<GlobalCount; j++){
                System.out.println(ArrayAssn[j].ID + " " + ArrayAssn[j].Marks);
               }
        }
        
      }
        s.close();
    }
}
class Student{
        String RollNumber;
        String StudentName;
        public Student(String rollNumber, String studentName){
            RollNumber = rollNumber;
            StudentName = studentName;
        }  

}

class Batch {
    int TotalStudent;
    // private int i;
    Batch (int totalStudent){
        TotalStudent = totalStudent;
    }

}


class Assignment{
  String ID;
  int Type;
  int Marks;
  public Assignment(String iD, int type) {
   super();
   ID = iD;
   Type = type;
  }

}
class AssignmentType0 extends Assignment{
    private String CheckerName;
    private String NotesOfChecker;

    public AssignmentType0(String iD, int type, String checkerName, String notesOfChecker, int marks) {
      super(iD, type);
      CheckerName = checkerName;
      NotesOfChecker = notesOfChecker;
      Marks = marks;
    }

    public int SetMarks(){
      return Marks;
    }
    public String SetID(){
      return ID;
    }
}
class AssignmentType1 extends Assignment{
    private int Correct;
    private int Incorrect;
    public AssignmentType1(String iD, int type, int correct, int incorrect) {
      super(iD, type);
      Correct = correct;
      Incorrect = incorrect;
    }

    public int SetMarks(){
        Marks = ((Correct*4)-(Incorrect));
        return Marks;
    }
    public String SetID(){
      return ID;
    }

}
class AssignmentType2 extends Assignment{
    private int TimeTaken;
    private int Pelanty;
    private String LanguageUsed;
    private int CorrectMarks;
    public AssignmentType2(String iD, int type, int timeTaken, int pelanty, String languageUsed, int correctMarks) {
      super(iD, type);
      TimeTaken = timeTaken;
      Pelanty = pelanty;
      LanguageUsed = languageUsed;
      CorrectMarks = correctMarks;
    }

    public int SetMarks(){ 
      Marks =  (CorrectMarks - Pelanty);
      return Marks;
    }
    public String SetID(){
      return ID;
    }
    
}
