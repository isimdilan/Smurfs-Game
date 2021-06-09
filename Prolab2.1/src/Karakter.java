import java.util.ArrayList;
import java.util.Hashtable;

import javax.management.loading.PrivateClassLoader;
import javax.sql.rowset.JoinRowSet;

public class Karakter 
{
	
	private String karakterAdi;
	private int karakterID;
	private String karakterTur;
	private int x,y;
	private Lokasyon lokasyon;
	public Karakter() 
	{
		super();
	}
	public Karakter(String karakterAdi, int karakterID, String karakterTur, int x, int y,Lokasyon lokasyon)
	{
		super();
		this.karakterAdi = karakterAdi;
		this.karakterID = karakterID;
		this.karakterTur = karakterTur;
		this.x = x;
		this.y = y;
		this.lokasyon=lokasyon;
	}
	public String getKarakterAdi() 
	{
		return karakterAdi;
	}
	public void setKarakterAdi(String karakterAdi)
	{
		this.karakterAdi = karakterAdi;
	}
	public int getKarakterID() 
	{
		return karakterID;
	}
	public void setKarakterID(int karakterID)
	{
		this.karakterID = karakterID;
	}
	public String isKarakterTur() 
	{
		return karakterTur;
	}
	public void setKarakterTur(String karakterTur)
	{
		this.karakterTur = karakterTur;
	}
	public int getX() 
	{
		return x;
	}
	public void setX(int x) 
	{
		this.x = x;
	}
	public int getY() 
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}
	public Lokasyon getLokasyon() {
		return lokasyon;
	}
	public void setLokasyon(Lokasyon lokasyon) {
		this.lokasyon = lokasyon;
	}
	
	//En kısa yol metodları burada yer almalı!!
	
}
