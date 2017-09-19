//import for Scanner and other utility classes
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        //Scanner
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int i = 0; i < T; i++) //Test cases
        {
        	int Rows = s.nextInt();
            int SeatParRow = s.nextInt();
            int SeatCount = 0;
            int a = s.nextInt();  //TotalAudiance
            //System.out.println("Matrix "+Rows+SeatParRow +"and Audiance "+ a);
            Audiance[] objAudiance = new Audiance[Rows*SeatParRow];
            //Breaker objBreaker;

            
            while(a>0){
            	String Type = s.next();
				String SeatingPrincipal = s.next();
				String Name = s.next();
				//System.out.println("SeatCount "+ SeatCount+ "With Name "+Type);
				
				if(Type.equals("breaker")){
				        
						int Experties = s.nextInt();
						int Holoscope = s.nextInt();
						Breaker objBreaker = new Breaker(Type, SeatingPrincipal, Name, Experties,  Holoscope);
						objAudiance[SeatCount] = objBreaker;
						SeatCount++;
                        //System.out.println("I am in "+ Type);
				}
				else if(Type.equals("VIP")){
					int NoOfEvent= s.nextInt();
					
					int[] Date=new int[4];
					int[] Month= new int[4];
					int[] Year= new int[4];
					String[] EventName= new String[4];
					String[] EventVanue= new String[4];
					for(int k= 0; k<NoOfEvent; k++){
						Date[k] = s.nextInt();
						Month[k] = s.nextInt();
						Year[k] = s.nextInt();
						EventName[k]= s.next();
						EventVanue[k]= s.next();
					}
					
					VIP objVIP = new VIP(Type,  SeatingPrincipal,  Name, NoOfEvent, Date, Month, Year, EventName, EventVanue);
					objAudiance[SeatCount] = objVIP;
					SeatCount++;
                    //System.out.println("I am in "+ Type);
				}
				else if(Type.equals("commoner")){
					Commoners objCommoners = new Commoners(Type, SeatingPrincipal, Name);
					objAudiance[SeatCount] = objCommoners;
					SeatCount++;
					//System.out.println("I am in "+ Type);
				}
				else if(Type.equals("event")){
					 int Date= s.nextInt();
					 int Month= s.nextInt();
					 int Year= s.nextInt();
					 String EventName = s.next();
					 String EventVanue = s.next();
					EventPro objEvent = new EventPro(Type, SeatingPrincipal, Name, Date, Month, Year, EventName, EventVanue);
					objAudiance[SeatCount] = objEvent;
					SeatCount++;
                    //System.out.println("I am in "+ Type);
				}
				else if(Type.equals("brand")){
					String BrandName= s.next();
					String SalesOfficer = s.next();
					BrandPro objBrand = new BrandPro(Type, SeatingPrincipal, Name, BrandName, SalesOfficer);
					objAudiance[SeatCount] = objBrand;
					SeatCount++;
					//System.out.println("I am in "+ Type);
				}
            	a--;
            }

            int r = s.nextInt(); //TotalRecepent
            while(r>0){

            	
            	String Type= s.next();
				String NameOfRecepent = s.next();
				First recepent = new First(Type, NameOfRecepent);
            	r--;
            }
            int IsLog = s.nextInt(); 
            
            //Display
            SeatCount--;
            while(SeatCount>=0){
                //System.out.println("In Display"+ SeatCount);
            	objAudiance[SeatCount].Display();
            	SeatCount--;
            }
        }
    }
    //s.close();
   
}


class Audiance{
	String Type;
	String SeatingPrincipal;
	String Name;
	int Experties;
	int Holoscope;
	int NoOfEvent;
	int[] Date=new int[4];
	int[] Month= new int[4];
	int[] Year= new int[4];
	String[] EventName= new String[4];
	String[] EventVanue = new String[4];
	int D;
	int M;
	int Y;
	String EventName2;
	String EventVanue2;
	String BrandName;
	String SalesOfficer;
	
	public Audiance(String type, String seatingPrincipal, String name) {
		super();
		Type = type;
		SeatingPrincipal = seatingPrincipal;
		Name = name;
	}
	public void Display(){
		System.out.println("In Audiance");
	}
}

class Breaker extends Audiance{
	private int Experties;
	private int Holoscope;
	public Breaker(String type, String seatingPrincipal, String name, int experties, int holoscope) {
		super(type, seatingPrincipal, name);
		Experties = experties;
		Holoscope = holoscope;
	}
	public void Display(){
		System.out.println(Name +" "+ Experties +" "+ Holoscope);
	}
	
}

class VIP extends Audiance{

	private int NoOfEvent;

//	public VIP(String type, String seatingPrincipal, String name, int noOfEvent) {
//		super(type, seatingPrincipal, name);
//		NoOfEvent = noOfEvent;
//	}
	private int[] Date=new int[4];
	private int[] Month= new int[4];
	private int[] Year= new int[4];
	private String[] EventName= new String[4];
	private String[] EventVanue = new String[4];
	
	
	public VIP(String type, String seatingPrincipal, String name, int noOfEvent, int[] date, int[] month, int[] year,
			String[] eventName, String[] eventVanue) {
		super(type, seatingPrincipal, name);
		NoOfEvent = noOfEvent;
		Date = date;
		Month = month;
		Year = year;
		EventName = eventName;
		EventVanue = eventVanue;
	}
	int i;
	public void Display(){
		System.out.println(Name);
		for (i=0; i<NoOfEvent; i++){
			System.out.println(Date[i]+"-"+Month[i]+"-"+Year[i]+ " " +EventName[i]+" "+ EventVanue[i]);
		}
	}
}

class Commoners extends Audiance{
	public Commoners(String type, String seatingPrincipal, String name) {
		super(type, seatingPrincipal, name);
	}

	public void Display(){
		System.out.println(Name);
	}
}

class EventPro extends Audiance{
	private int D;
	private int M;
	private int Y;
	private String EventName2;
	private String EventVanue2;
	public EventPro(String type, String seatingPrincipal, String name, int date, int month, int year, String eventName,
			String eventVanue) {
		super(type, seatingPrincipal, name);
		D = date;
		M = month;
		Y = year;
		EventName2 = eventName;
		EventVanue2 = eventVanue;
	}
	public void Display(){
		System.out.println(D+"-"+M+"-"+Y+" "+ EventName2+ " "+ EventVanue2);
	}
	

}
class BrandPro extends Audiance{
	private String BrandName;
	private String SalesOfficer;
	public BrandPro(String type, String seatingPrincipal, String name, String brandName, String salesOfficer) {
		super(type, seatingPrincipal, name);
		BrandName = brandName;
		SalesOfficer = salesOfficer;
	}
	public void Display(){
		System.out.println(Name+" "+BrandName + " "+ SalesOfficer);
	}
	
	
}

class Recepent{
	String Type;
	String NameOfRecepent;
	public Recepent(String type, String nameOfRecepent) {
		super();
		Type = type;
		NameOfRecepent = nameOfRecepent;
	}
	
}
class First extends Recepent{

	public First(String type, String nameOfRecepent) {
		super(type, nameOfRecepent);
	}
	
}
