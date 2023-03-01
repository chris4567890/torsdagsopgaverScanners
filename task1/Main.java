//import java.util.Scanner;
class Main{
	//import java.util.scanner;
	public static void main(String[] args){
		
		//System.out.println("Hello there!");
		
		Team t1 = new Team("De Uovervindelige");
		t1.setRank(3);
		
		Team t2 = new Team("Kongens Lyngby");
		t2.setRank(1);
		
		Team t3 = new Team("Team Roskilde");
		t3.setRank(2);
		
		Team t4 = new Team("Team hold");
		t4.setRank(7);
		
		Team t5 = new Team("A38");
		t5.setRank(9);
		Team t6 = new Team("Ibserne");
		t6.setRank(11);
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		System.out.println(t3.toString());
		System.out.println(t4.toString());
		System.out.println(t5.toString());
		System.out.println(t6.toString());
		
	}

	
}