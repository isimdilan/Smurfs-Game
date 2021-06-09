
public class Oyuncu2TS extends Oyuncu
{
	//Her defasında 1 birim
	//Azman'a dokunursa 5 puan kaybeder
	//Gargamel'e dokunursa 15 puan kaybeder
	Karakter oyuncuTembelKarakter=new Karakter();
	private int maze[][]= 
		{
				{0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	1,	0,	0},
				{0,	1,	1,	1,	1,	0,	1,	1,	1,	1,	1,	1,	0},
				{0,	1,	0,	1,	1,	1,	1,	1,	1,	0,	0,	1,	0},
				{0,	1,	1,	1,	1,	0,	1,	0,	1,	1,	0,	1,	0},
				{0,	1,	0,	1,	0,	0,	1,	0,	1,	0,	0,	1,	0},
				{1,	1,	0,	1,	1,	1,	2,	0,	1,	0,	1,	1,	0},
				{0,	1,	0,	0,	1,	1,	1,	0,	1,	1,	1,	1,	0},
				{0,	1,	0,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1},
				{0,	1,	0,	1,	0,	0,	0,	0,	0,	1,	1,	1,	0},
				{0,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	1,	0},
				{0,	0,	0,	1,	0,	0,	0,	0,	0,	0,	0,	0,	0}
		};
	public int stayx() {
		oyuncuTembelKarakter.setX(683);
		return oyuncuTembelKarakter.getX();
	}
	public int stayy() {
		oyuncuTembelKarakter.setY(334);
		return oyuncuTembelKarakter.getY();
	}
	int x=stayx();
	int y=stayy();
	
	public int Right() 
	{
		int right=x;
		right+=50;
		x=right;
		return right;
	}
	public int Left() 
	{
		int left=x;
		left-=50;
		x=left;
		return left;
	}
	public int Down() 
	{
		int down=y;
		down+=50;
		y=down;
		return down;
	}
	public int Up() 
	{
		int up=y;
		up-=50;
		y=up;
		return up;
	}
	
	@Override
	public void setSkor(int skor) {
			
	}
	@Override
	public int getSkor() {
		// TODO Auto-generated method stub
		return super.getSkor();
	}
	
	
			
		
	

	
	
		
}
