//import for Scanner and other utility  classes
import java.util.*;

class TestClass {
    static int t, i, j;
    int TotalAssignment;
    int CountType0= 0;
    int CountType1= 0;
    int CountType2= 0;

   int TotalMarks0 = 0;
   int TotalMarks1 = 0;
   int TotalMarks2 = 0;


    public static void main(String args[] ) throws Exception {
      Scanner s = new Scanner(System.in);
      t= s.nextInt(); //Test Case
      for(i=0; i<t; i++){
        Student St = new Student();
        St.RollNumber = s.next();
        St.StudentName = s.next();
        TestClass Test = new TestClass();
        Test.TotalAssignment = s.nextInt();
        System.out.println(St.RollNumber + " "+ St.StudentName);
        //System.out.println("Total assignment " +Test.TotalAssignment);
        AssignmentType0[] ArrayType0 = new AssignmentType0[Test.TotalAssignment];
        AssignmentType1[] ArrayType1 = new AssignmentType1[Test.TotalAssignment];
        AssignmentType2[] ArrayType2 = new AssignmentType2[Test.TotalAssignment];

        while(Test.TotalAssignment>0){
          String TempID = s.next();
          int AssignmentType= s.nextInt();
          //System.out.println("assignment type"+ AssignmentType);
          
          switch(AssignmentType){
              
          case 0:
            String CheckerName = s.next();
            String NotesOfChecker = s.next();
            int Marks = s.nextInt();

            ArrayType0[Test.CountType0] = new AssignmentType0(TempID, AssignmentType, CheckerName, NotesOfChecker, Marks);

            Test.TotalMarks0 = Test.TotalMarks0 + ArrayType0[Test.CountType0].SetMarks();
            //System.out.println(" I am in 0");
            Test.CountType0++;
            break;

          case 1:
            int Correct = s.nextInt();
            int Incorrect = s.nextInt();
            ArrayType1[Test.CountType1] = new AssignmentType1(TempID, AssignmentType, Correct, Incorrect);
            
            Test.TotalMarks1 = Test.TotalMarks1 + ArrayType1[Test.CountType1].SetMarks();
            //System.out.println("I am in 1");
            Test.CountType1++;
            break;

          case 2:
            int TimeTaken= s.nextInt();
            int Pelanty = s.nextInt();
            String LanguageUsed = s.next();
            int CorrectMarks = s.nextInt();

            ArrayType2[Test.CountType2] = new AssignmentType2(TempID, AssignmentType, TimeTaken, Pelanty, LanguageUsed, CorrectMarks);
            
            Test.TotalMarks2 = Test.TotalMarks2 + ArrayType2[Test.CountType2].SetMarks();
            //System.out.println("I am in 2");
            Test.CountType2++;
            break;
          }

          Test.TotalAssignment--;
        }
        
        //Type 0 Output
         
           for(j=0; j<Test.CountType0; j++){
            
            System.out.println(ArrayType0[j].SetID() + " " + ArrayType0[j].SetMarks());
           }
           System.out.println(Test.TotalMarks0);


        //Type 1 Output
           for(j=0; j<Test.CountType1; j++){
            System.out.println(ArrayType1[j].SetID() + " " + ArrayType1[j].SetMarks());
           }
           System.out.println(Test.TotalMarks1);

        //Type 2 Output
           for(j=0; j<Test.CountType2; j++){
            System.out.println(ArrayType2[j].SetID() + " " + ArrayType2[j].SetMarks());
           }
           System.out.println(Test.TotalMarks2);
      }
      s.close();
    }
}

class Assignment{
  String ID;
  int Type;
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
        return ((Correct*4)-(Incorrect));
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
      return (CorrectMarks - Pelanty);
    }
    public String SetID(){
      return ID;
    }
    
}
class Student{
    String RollNumber;
    String StudentName;
}
