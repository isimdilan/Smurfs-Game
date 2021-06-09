
public class Altin extends Obje
{
	private int altinquantity;
	public int getAltinquantity() {
		return altinquantity;
	}
	public void setAltinquantity(int altinquantity) {
		this.altinquantity = altinquantity;
	}
	//Her bir altın 5 puan
	//Ek olarak altın sayısını tutmak için altın değişkeni tutulacak
	//Random olarak (max 10sn) her hangi bir yerder aynı anda 5 altın 
	//Farklı bir sayıda olamaz
	//Altınlar 5sn kalacak
	//Oyuncu alırsa puan alacak 
	//Alamazsa altın kaybolacak
	public Altin() 
	{
		super();
	}
	public Altin(String ObjeName,int point, int stay, int maxtime) 
	{
		super(ObjeName,point,stay,maxtime);
	}
	
	
	
	
}
