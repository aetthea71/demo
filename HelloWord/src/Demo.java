
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xx, yy;
		xx=10; yy=20;
        System.out.println("Jumlah xx + yy : "+ sum(xx,yy));
	}
	
	public static int sum(int x, int y){		
		return (x+y);
	}
	
	public static int mak(int x, int y){
		if (x > y) {
			return x;
		}
		else
			return y;
	}

}
