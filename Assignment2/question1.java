
import java.util.*;

//Constructor are auto generated

public class TestClass {
	static int t, i;
	public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
	    t= s.nextInt(); //Total no of Test Casees
	    for(i=0; i<t; i++){
	    	System.out.println("Hello World");
	    }
	    s.close();
	}
}

abstract class Student{
    String ID;
    String RollNumber;
    String Name;
    int DurationOfReg;
    int CreditEarned;
	public Student(String iD, String rollNumber, String name, int durationOfReg, int creditEarned) {
		super();
		ID = iD;
		RollNumber = rollNumber;
		Name = name;
		DurationOfReg = durationOfReg;
		CreditEarned = creditEarned;
	}
    
    
}

class UG extends Student{
    private int Min = 4;
    private int Max = 7;
    private int MinCredit = 185;
    private String Department;
    private double CGPA;

	public UG(String iD, String rollNumber, String name, int durationOfReg, int creditEarned, String department,
			double cGPA) {
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
    
}

class PG extends Student{
    private int Min = 2;
    private int Max = 4;
    private int MinCredit = 80;
    private String Department;
    private String Specilasation;
    private double CGPA;
    private String ThesisArea;
    
    
    
    
    public PG(String iD, String rollNumber, String name, int durationOfReg, int creditEarned, String department,
			String specilasation, double cGPA, String thesisArea) {
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
    private double CGPA;
    private String ThesisArea;
    private int YearOfPG;
    
    
    
    public UGandPG(String iD, String rollNumber, String name, int durationOfReg, int creditEarned, String department,
			String specilasation, double cGPA, String thesisArea, int yearOfPG) {
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
    private double CGPA;
    private String ThesisArea;
    private int YearOfPhD;
    
    
    
    public PGandPhD(String iD, String rollNumber, String name, int durationOfReg, int creditEarned, double cGPA,
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

