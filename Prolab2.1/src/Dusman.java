import java.util.ArrayList;
import java.util.Hashtable;

public class Dusman extends Karakter 
{
	private int DusmanId;
	private String dusmanAdi;
	private String dusmanTur;
	public Dusman() 
	{
		super();
	}
	public Dusman(int dusmanId, String dusmanAdi, String dusmanTur) 
	{
		super();
		DusmanId = dusmanId;
		this.dusmanAdi = dusmanAdi;
		this.dusmanTur = dusmanTur;
	}
	public int getDusmanId() 
	{
		return DusmanId;
	}
	public void setDusmanId(int dusmanId) 
	{
		DusmanId = dusmanId;
	}
	public String getDusmanAdi() 
	{
		return dusmanAdi;
	}
	public void setDusmanAdi(String dusmanAdi) 
	{
		this.dusmanAdi = dusmanAdi;
	}
	public String getDusmanTur()
	{
		return dusmanTur;
	}
	public void setDusmanTur(String dusmanTur) 
	{
		this.dusmanTur = dusmanTur;
	}
	
	
	
	
	
	
	
	

}
