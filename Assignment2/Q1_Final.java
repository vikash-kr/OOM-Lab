import java.util.*;
import java.util.*;
import java.lang.*;
//Constructor are auto generated

public class TestClass {
	static int t, i, j;
	public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
	    t= s.nextInt(); //Total no of Test Casees
	    for(i=0; i<t; i++){
	    	int TotalStudent = s.nextInt();
                int CountUG= 0;
                int CountPG= 0;
                int CountUGandPG= 0;
                int CountPhd = 0;
                int CountPGandPhd = 0;
                int TotalCount = 0;
                
                UG objUG;
                Student[] objStudent = new Student[TotalStudent];

                while(TotalStudent>0){
                    String ID = s.next();
                    
                    if(ID.equals("UG")){
                         String RollNumber = s.next();
                         String Name = s.next();
                         String Department = s.next();
                         int DurationOfReg = s.nextInt();
                         int CGPA = s.nextInt();
                         int CreditEarned = s.nextInt();
                         objUG = new UG(ID, RollNumber, Name, DurationOfReg, CreditEarned, Department,CGPA);
                        if(objUG.IsEligable()==true){
                            System.out.println( "In Main" + RollNumber + " "+ Name + " " + ID + " " + Department + " " + CGPA);
                            //UG objUG = new UG(ID, RollNumber, Name, DurationOfReg, CreditEarned, Department,CGPA);
                            objStudent[TotalCount]= new Student(ID, RollNumber, Name, DurationOfReg, CreditEarned);
                            objStudent[TotalCount] = objUG;
                            TotalCount++;
                             
                        }

                    }
                    else if(ID.equals("PG")){
                         String RollNumber = s.next();
                         String Name = s.next();
                         String Department = s.next();
                         int DurationOfReg = s.nextInt();
                         int CGPA = s.nextInt();
                         int CreditEarned = s.nextInt();
                         objUG = new UG(ID, RollNumber, Name, DurationOfReg, CreditEarned, Department,CGPA);
                        if(objUG.IsEligable()==true){
                            System.out.println( "In Main" + RollNumber + " "+ Name + " " + ID + " " + Department + " " + CGPA);
                            
                            objStudent[TotalCount]= new Student(ID, RollNumber, Name, DurationOfReg, CreditEarned);
                            objStudent[TotalCount] = objUG;
                            TotalCount++;
                    }
                    
                    
                    TotalStudent--;
                }

                //Display
                System.out.println(TotalCount);
                for (j=0; j<TotalCount; j++ ) {
                    System.out.println("Displaying "+ j);
                   objStudent[j].Display(); 
                }
            }
	    s.close();
	}
}

class Student{
    String ID;
    String RollNumber;
    String Name;
    int DurationOfReg;
    int CreditEarned;

    String Department;
    int CGPA;
    String Specilasation;
    String ThesisArea;
    String YearOfPG;
    String YearOfPhD;
	public Student(String iD, String rollNumber, String name, int durationOfReg, int creditEarned) {
		super();
		ID = iD;
		RollNumber = rollNumber;
		Name = name;
		DurationOfReg = durationOfReg;
		CreditEarned = creditEarned;
	}
    public void Display(){
        System.out.println("I am in class Student");
    }
    
}

class UG extends Student{
    private int Min = 4;
    private int Max = 7;
    private int MinCredit = 185;
    private String Department;
    private int CGPA;

	public UG(String iD, String rollNumber, String name, int durationOfReg, int creditEarned, String department,
			int cGPA) {
		super(iD, rollNumber, name, durationOfReg, creditEarned);
		Department = department;
		CGPA = cGPA;
	}


	public boolean IsEligable(){
        boolean Eligable = false;
        if(DurationOfReg>=Min && DurationOfReg<=Max && CreditEarned >= MinCredit)
            Eligable = true;
        return Eligable;
    }
    public void Display(){

        System.out.println(RollNumber + " "+ Name + " " + ID + " " + Department + " " + CGPA);
    }

}

class PG extends Student{
    private int Min = 2;
    private int Max = 4;
    private int MinCredit = 80;
    private String Department;
    private String Specilasation;
    private int CGPA;
    private String ThesisArea;
    
    
    
    
    public PG(String iD, String rollNumber, String name, int durationOfReg, int creditEarned, String department,
			String specilasation, int cGPA, String thesisArea) {
		super(iD, rollNumber, name, durationOfReg, creditEarned);
		Department = department;
		Specilasation = specilasation;
		CGPA = cGPA;
		ThesisArea = thesisArea;
	}




	public boolean IsEligable(){
        boolean Eligable = false;
        if(DurationOfReg>=Min && DurationOfReg<=Max && CreditEarned >= MinCredit)
            Eligable = true;
        return Eligable;
    }
}

class UGandPG extends Student{
    private int Min = 5;
    private int Max = 8;
    private int MinCredit = 265;
    private String Department;
    private String Specilasation;
    private int CGPA;
    private String ThesisArea;
    private int YearOfPG;
    
    
    
    public UGandPG(String iD, String rollNumber, String name, int durationOfReg, int creditEarned, String department,
			String specilasation, int cGPA, String thesisArea, int yearOfPG) {
		super(iD, rollNumber, name, durationOfReg, creditEarned);
		Department = department;
		Specilasation = specilasation;
		CGPA = cGPA;
		ThesisArea = thesisArea;
		YearOfPG = yearOfPG;
	}



	public boolean IsEligable(){
        boolean Eligable = false;
        if(DurationOfReg>=Min && DurationOfReg<=Max && CreditEarned >= MinCredit)
            Eligable = true;
        return Eligable;
    }
}

class PhD extends Student{
    private int Min = 2;
    private int Max = 6;
    private int MinCredit = 64;
    private String ThesisArea;
    
    
    
    public PhD(String iD, String rollNumber, String name, int durationOfReg, int creditEarned, String thesisArea) {
		super(iD, rollNumber, name, durationOfReg, creditEarned);
		ThesisArea = thesisArea;
	}



	public boolean IsEligable(){
        boolean Eligable = false;
        if(DurationOfReg>=Min && DurationOfReg<=Max && CreditEarned >= MinCredit)
            Eligable = true;
        return Eligable;
    }
}

class PGandPhD extends Student{
    private int Min = 4;
    private int Max = 7;
    private int MinCredit = 138;
    private int CGPA;
    private String ThesisArea;
    private int YearOfPhD;
    
    
    
    public PGandPhD(String iD, String rollNumber, String name, int durationOfReg, int creditEarned, int cGPA,
			String thesisArea, int yearOfPhD) {
		super(iD, rollNumber, name, durationOfReg, creditEarned);
		CGPA = cGPA;
		ThesisArea = thesisArea;
		YearOfPhD = yearOfPhD;
	}



	public boolean IsEligable(){
        boolean Eligable = false;
        if(DurationOfReg>=Min && DurationOfReg<=Max && CreditEarned >= MinCredit)
            Eligable = true;
        return Eligable;
    }
}

