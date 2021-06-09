import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Blob;



public class Oyuncu1GS extends Oyuncu 
{
	Karakter oyuncugozluKarakter=new Karakter();
	
	//Her defasında 2 birim
	//Azman'a dokunursa 5 puan kaybeder
	//Gargamel'e dokunursa 15 puan kaybeder
	

	public int stayx() {
		oyuncugozluKarakter.setX(683);
		return oyuncugozluKarakter.getX();
	}
	public int stayy() {
		oyuncugozluKarakter.setY(334);
		return oyuncugozluKarakter.getY();
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
