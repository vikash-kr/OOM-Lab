//import for Scanner and other utility  classes
import java.util.*;

class TestClass {
    static int t, i;
    int TotalAssignment;
    int CountType0= 0;
    int CountType1= 0;
    int CountType2= 0;

    public static void main(String args[] ) throws Exception {
      Scanner s = new Scanner(System.in);
      t= s.nextInt(); //Test Case
      for(i=0; i<t; i++){
        Student St = new Student();
        St.RollNumber = s.next();
        St.StudentName = s.next();
        TestClass Test = new TestClass();
        Test.TotalAssignment = s.nextInt();

        AssignmentType0[] ArrayType0 = new AssignmentType0[Test.TotalAssignment];
        AssignmentType1[] ArrayType1 = new AssignmentType1[Test.TotalAssignment];
        AssignmentType2[] ArrayType2 = new AssignmentType2[Test.TotalAssignment];

        while(Test.TotalAssignment>0){
          String TempID = s.next();
          int AssignmentType= s.nextInt();

          if(AssignmentType==0){
            String CheckerName = s.next();
            String NotesOfChecker = s.next();
            int Marks = s.nextInt();

            ArrayType0[Test.CountType0] = new AssignmentType0(TempID, AssignmentType, CheckerName, NotesOfChecker, Marks);
            
            System.out.println(" I am in 0");
            Test.CountType0++;
          }
          else if(AssignmentType==1){
            int Correct = s.nextInt();
            int Incorrect = s.nextInt();
            ArrayType1[Test.CountType1] = new AssignmentType1(TempID, AssignmentType, Correct, Incorrect);


            System.out.println("I am in 1");
            Test.CountType1++;
          }
          else {
            int TimeTaken= s.nextInt();
            int Pelanty = s.nextInt();
            String LanguageUsed = s.next();
            int CorrectMarks = s.nextInt();

            ArrayType2[Test.CountType2] = new AssignmentType2(TempID, AssignmentType, TimeTaken, Pelanty, LanguageUsed, CorrectMarks);
            

            System.out.println("I am in 2");
            Test.CountType2++;
          }

          Test.TotalAssignment--;
        }
        s.close();
        System.out.println(St.RollNumber + " "+ St.StudentName);
        //Type 0 Output

        //Type 1 Output

        //Type 2 Output
      }
    }
}
class Assignment{
  private String ID;
  private int Type;
  public Assignment(String iD, int type) {
   super();
   ID = iD;
   Type = type;
  }

}
class AssignmentType0 extends Assignment{
    private String CheckerName;
    private String NotesOfChecker;
    private int Marks;

    public AssignmentType0(String iD, int type, String checkerName, String notesOfChecker, int marks) {
      super(iD, type);
      CheckerName = checkerName;
      NotesOfChecker = notesOfChecker;
      Marks = marks;
    }

    int SetMarks(int Marks){
      this.Marks = Marks;
      return Marks;
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

    int SetMarks(int Correct, int Incorrect){
        return ((this.Correct*4)-(this.Incorrect));
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

    int SetMarks(int CorrectMarks, int Pelanty){ 
      return (this.CorrectMarks - this.Pelanty);
    }
    
}
class Student{
    String RollNumber;
    String StudentName;
}
