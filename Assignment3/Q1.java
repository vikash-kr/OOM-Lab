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

            Audiance[] objAudiance = new Audiance[Rows*SeatParRow];
            //Breaker objBreaker;

            int a = s.nextInt();  //TotalAudiance
            while(a>0){
            	String Type = s.next();
				String SeatingPrincipal = s.next();
				String Name = s.next();

				if(Type.equals("breaker")){
						int Experties = s.nextInt();
						int Holoscope = s.nextInt();
						Breaker objBreaker = new Breaker(Type, SeatingPrincipal, Name, Experties,  Holoscope);
						objAudiance[SeatCount] = objBreaker;
						SeatCount++;

				}
				else if(Type.equals("VIP")){
					int NoOfEvent= s.nextInt();
					VIP objVIP = new VIP(Type,  SeatingPrincipal,  Name, NoOfEvent);
					int[] Date=new int[4];
					int[] Month= new int[4];
					int[] Year= new int[4];
					String[] EventName= new String[4];
					String[] EventVanue= new String[4];
					if(NoOfEvent ==1){
						Date[1] = s.nextInt();
						Month[1] = s.nextInt();
						Year[1] = s.nextInt();
						EventName[1]= s.next();
						EventVanue[1]= s.next();
						objVIP.SetData1(Date[1], Month[1], Year[1], EventName[1], EventVanue[1]);
					}
					else if(NoOfEvent==2){
						Date[2] = s.nextInt();
						Month[2] = s.nextInt();
						Year[2] = s.nextInt();
						EventName[2]= s.next();
						EventVanue[2]= s.next();
						objVIP.SetData2(Date[2], Month[2], Year[2], EventName[2], EventVanue[2]);
					}
					else if(NoOfEvent==3){
						Date[3] = s.nextInt();
						Month[3] = s.nextInt();
						Year[3] = s.nextInt();
						EventName[3]= s.next();
						EventVanue[3]= s.next();
						objVIP.SetData3(Date[3], Month[3], Year[3], EventName[3], EventVanue[3]);
					}
					objAudiance[SeatCount] = objVIP;
					SeatCount++;

				}
				else if(Type.equals("commoner")){
					Commoners objCommoners = new Commoners(Type, SeatingPrincipal, Name);
					objAudiance[SeatCount] = objCommoners;
					SeatCount++;
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

				}
				else if(Type.equals("brand")){
					String BrandName= s.next();
					String SalesOfficer = s.next();
					BrandPro objBrand = new BrandPro(Type, SeatingPrincipal, Name, BrandName, SalesOfficer);
					objAudiance[SeatCount] = objBrand;
					SeatCount++;
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
            for(int j = (SeatCount-1); j<=0; j--){
                System.out.println("In Display"+ i);
            	objAudiance[j].Display();
            }
        }
    }
   
}


class Audiance{
	String Type;
	String SeatingPrincipal;
	String Name;
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

	public VIP(String type, String seatingPrincipal, String name, int noOfEvent) {
		super(type, seatingPrincipal, name);
		NoOfEvent = noOfEvent;
	}
	private int[] Date=new int[4];
	private int[] Month= new int[4];
	private int[] Year= new int[4];
	private String[] EventName= new String[4];
	private String[] EventVanue = new String[4];
	void SetData1(int date, int month, int year, String eventName, String eventVanue){
				Date[1] = date;
				Month[1] = month;
				Year[1] = year;
				EventName[1] = eventName;
				EventVanue[1] = eventVanue;
	}
	void SetData2(int date, int month, int year, String eventName, String eventVanue){
				Date[2] = date;
				Month[2] = month;
				Year[2] = year;
				EventName[2] = eventName;
				EventVanue[2] = eventVanue;
	}
	void SetData3(int date, int month, int year, String eventName, String eventVanue){
				Date[3] = date;
				Month[3] = month;
				Year[3] = year;
				EventName[3] = eventName;
				EventVanue[3] = eventVanue;
	}
	
	int i;
	void Display(){
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
	private int Date;
	private int Month;
	private int Year;
	private String EventName;
	private String EventVanue;
	public EventPro(String type, String seatingPrincipal, String name, int date, int month, int year, String eventName,
			String eventVanue) {
		super(type, seatingPrincipal, name);
		Date = date;
		Month = month;
		Year = year;
		EventName = eventName;
		EventVanue = eventVanue;
	}
	void Display(){
		System.out.println(Date+"-"+Month+"-"+Year+" "+ EventName+ " "+ EventVanue);
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
	void Display(){
		System.out.println(BrandName + " "+ SalesOfficer);
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
