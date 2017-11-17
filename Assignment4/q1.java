//import for Scanner and other utility classes
import java.util.*;
import java.lang.*;

public class TestClass {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int TotalStudents = s.nextInt();
        StudentClass[] st = new StudentClass[TotalStudents];
        int Count = 0, temp;
        try{
	        while(Count<TotalStudents){
	        	st[Count] = new StudentClass(s.next());
                        temp = Count;
	        	Count++;
                        st[temp].setTotalCourse( nextInt());
                        
                        
                        
	        }
	    }catch(Exception e){
	    	System.out.println(e);
	}
    }
}

class StudentClass extends CourseClass{
	private String RollNumber;
        
	StudentClass(String r){
		VerifyRoll(r);
		RollNumber = r;
	}
	void VerifyRoll(String r) throws Exception{
            String s1 = r.substring(0,2);
            char n = r.charAt(6);
            int year = Character.getNumericValue(n);
            char A = r.charAt(7);
            int a = Character.getNumericValue(A);
            char B = r.charAt(8);
            int b = Character.getNumericValue(A);
            char C = r.charAt(9);
            int c = Character.getNumericValue(C);
            int last3= a*100 + b*10 + c ;
            if( s1.equals("IIT") || s1.equals("LIT") || s1.equals("ITM") || s1.equals("BIM") || s1.equals("ICM")|| s1.equals("ISM")|| s1.equals("IIM")|| s1.equals("IHM")|| s1.equals("IRM")|| s1.equals("IWM")){
                if(year<3 || year>6 || last3<=0 || last3>199){
                    throw  new Exception("Incorrect Roll Number, Last 4");
                }
                
            }
            else{
            throw new Exception("Incorrect Roll Number, First 3");
            }
	}
        
        
        
}

class CourseClass{
    private int TotalCourse;
    void setTotalCourse(int t){
        
            TotalCourse = t;
        }
    String[] Subject = new String[TotalCourse];  
    int TotalCredit = 0;
    int i;
    float CGPA
    for(i=0; i<TotalCourse; i++){
        
    }
}
