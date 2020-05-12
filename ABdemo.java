class ABdemo{
	public static void main(String args[]){
		
		Iphone obj = new Iphone();
		SamsungS4 obj1 = new SamsungS4();
		show(obj);
	}
	
	public static void show(Phone obj){
		obj.showConfig();
	}
}

//fuck that shit
abstract class Phone{
	public abstract void showConfig();
}
//fuck that shit again
class Iphone extends Phone{
	public void showConfig(){
		System.out.println("Iphone");
	}
}

class SamsungS4 extends Phone{
	public void showConfig(){
		System.out.println("SamsungS4");
	}
}