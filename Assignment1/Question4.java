/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

//import for Scanner and other utility  classes
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        

        System.out.println("Hello World!");
    }
}
class AssignmentType0{
    String CheckerName;
    String NotesofChecker;
    int Marks;
}
class AssignmentType1{
    int Correct;
    int Incorrect;
    int Marks(int Correct, int Incorrect){
        return ((this.Correct*4)-(this.Incorrect));
    }
}
class AssignmentType2{
    int TimeTaken;
    int Pelanty;
    int LanguageUsed;
    int CorrectMarks;
    int Marks= CorrectMarks - Pelanty;
}
