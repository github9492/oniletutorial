package oop;


class practice2 
{ 
	public static void main(String arg []) {
		main1 ob = new main1();
		ob.add(10,20);
		ob.add(10,20 , 30);
	}
}
class main1 {
	void add(int x, int y){
		int z = x+y;
		System.out.println(z);
	}
void add(int x, int y , int z){
	int zz = x+y+z;
	System.out.println(zz);
	}
}
