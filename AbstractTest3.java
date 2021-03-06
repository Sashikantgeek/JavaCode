abstract class Sim
{
	private long no;
	Sim(long no)
	{
		this.no=no;
	}
	long getNo()
	{
		return no;
	}
	abstract String getName();
}
class AirtelSim extends Sim
{
	AirtelSim(long no)
	{
		super (no);
	}
	String getName()
	{
		return "Airtel";
	}
}
class TataSim extends Sim
{
	TataSim(long no)
	{
		super(no);
	}
	String getName()
	{
		return "Tata";
	}
}
class Mobile
{
	private Sim s;
	void insert(Sim s)
	{
		this.s=s;
	}
	void print()
	{
		System.out.println(s.getNo());
		System.out.println(s.getName());
	}
}
class AbstractTest3
{
	public static void main(String args[])
	{
		AirtelSim sim1=new AirtelSim(9999999l);
		TataSim sim2=new TataSim(88888888l);
		Mobile m1=new Mobile();
		m1.insert(sim1);
		m1.print();
		m1.insert(sim2);
		m1.print();
	}
}