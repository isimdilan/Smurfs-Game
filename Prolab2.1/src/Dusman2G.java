
public class Dusman2G extends Dusman
{
	Dusman dusmang=new Dusman();

	@Override
	public void setDusmanId(int dusmanId) {
		// TODO Auto-generated method stub
		super.setDusmanId(1);
	}

	@Override
	public void setDusmanAdi(String dusmanAdi) {
		// TODO Auto-generated method stub
		super.setDusmanAdi("Azman");
	}

	@Override
	public void setDusmanTur(String dusmanTur) {
		// TODO Auto-generated method stub
		super.setDusmanTur(dusmanTur);
	}
	//2 birim ilerler Gargamel Azmanın üstünden atlar
	public int stayx() {
		dusmang.setX(0);
		return dusmang.getX();
	}
	public int stayy() {
		dusmang.setY(0);
		return dusmang.getY();
	}
	int x=stayx();
	int y=stayy();
	public int Right() 
	{
		int right=x;
		right+=100;
		x=right;
		return right;
	}
	public int Left() 
	{
		int left=x;
		left-=100;
		x=left;
		return left;
	}
	public int Down() 
	{
		int down=y;
		down+=100;
		y=down;
		return down;
	}
	public int Up() 
	{
		int up=y;
		up-=100;
		y=up;
		return up;
	}
	
}
