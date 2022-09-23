package methods;

import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi =false;
		
		for (int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi =true;
				break;
			}
		}	
			String mesaj="";
			if(varMi) {
				mesaj = "sayi mevcuttur: "+aranacak;
				mesajVer(mesaj);
			}else {
				mesajVer("sayi mevcut değildir: "+aranacak);
			}
		}
	
	public static void mesajVer (string mesaj) {
		System.out.println(mesaj);
	}
}
	
	
