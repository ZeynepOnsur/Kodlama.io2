package methods;

public class Main {

	public static void main(String[] args) {
	
		sayiBulmaca();
	}

	public static void sayiBulmaca() {
		
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 2;
		boolean varMı = false;
		
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMı = true;
				break;
			}
			
		}
	
		String mesaj="";
		if(varMı) {
			mesaj="sayı mevcuttur: " + aranacak;
			mesajVer(mesaj);
		}else {
			mesajVer("Sayı mevcut değildir." + aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
}
