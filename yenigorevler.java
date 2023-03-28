package gorevler;

import java.util.Random;
import java.util.Scanner;

public class yenigorevler {
	public static void main(String[] args) {
		int tahmin,can = 5, i = 0;
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int sayi = rand.nextInt(11);
		System.out.println(sayi);
		boolean oyunDurum = false;
		int[] tahminler = new int[5];
		
		System.out.println("Sayı Tahmini Oyununa hoş geldiniz.");
		System.out.println("----------------------------------------");
		System.out.println("Lütfen 0-10 arasında bir sayı seçiniz...");
		while(can > 0) {
			System.out.println("Tahmini sayınız: ");
			tahmin = scan.nextInt();
			tahminler[i++] = tahmin;
			if((tahmin < 0) || (tahmin > 10)){
				System.out.println("Lütfen 0 ile 10 arasında bir sayı giriniz!");
				continue;
			}
			if(tahmin == sayi ) {
				oyunDurum = true;
				break;
			}
			else {
				System.out.println("Yanlış tahmin. Tekrar deneyiniz. | Kalan can : " + --can);
			}
			
		}
		if(oyunDurum) {
			System.out.println("Tebrikler doğru tahmin.");
			System.out.println("Tutulan sayı : " + sayi);
			System.out.println("Kalan can sayısı : " + can);

		}
		else {
			System.out.println("Başaramadınız.");
		}
		for(int value:tahminler) {
			System.out.print(value + " , ");
		}
	}
}
	
	