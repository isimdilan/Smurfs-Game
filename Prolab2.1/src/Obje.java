
public class Obje {
	private String ObjeName;
	private int point;
	private int stay;
	private int maxtime;
	
	public Obje() 
	{
	}

	public Obje(String ObjeName, int point, int stay, int maxtime) {
		this.ObjeName = ObjeName;
		this.point = point;
		this.stay = stay;
		this.maxtime = maxtime;
		
	}
	public String getObjeName() {
		return ObjeName;
	}
	public void setObjeName(String objeName) {
		ObjeName = objeName;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getStay() {
		return stay;
	}
	public void setStay(int stay) {
		this.stay = stay;
	}
	public int getMaxtime() {
		return maxtime;
	}
	public void setMaxtime(int maxtime) {
		this.maxtime = maxtime;
	}
	
	
	
}
