
public class Oyuncu extends Karakter 
{
	private int OyuncuId;
	private String oyuncuAdi;
	private String OyuncuTur;
	private int Skor;
	public Oyuncu() 
	{
		super();
	}
	public Oyuncu(int oyuncuId, String oyuncuAdi, String oyuncuTur, int skor) 
	{
		super();
		OyuncuId = oyuncuId;
		this.oyuncuAdi = oyuncuAdi;
		OyuncuTur = oyuncuTur;
		Skor = skor;
	}
	public int getOyuncuId() 
	{
		return OyuncuId;
	}
	public void setOyuncuId(int oyuncuId)
	{
		OyuncuId = oyuncuId;
	}
	public String getOyuncuAdi() 
	{
		return oyuncuAdi;
	}
	public void setOyuncuAdi(String oyuncuAdi) 
	{
		this.oyuncuAdi = oyuncuAdi;
	}
	public String isOyuncuTur() 
	{
		return OyuncuTur;
	}
	public void setOyuncuTur(String oyuncuTur)
	{
		OyuncuTur = oyuncuTur;
	}
	public int getSkor()
	{
		return Skor;
	}
	public void setSkor(int skor)
	{
		Skor = skor;
	}
	//Oyuncunun her düşman karaktere dokunuşunda puanı düşecek
	//Puanı Göster fonksiyonu ile oyuncuların skorları gösterilecek
	
	
	
}
