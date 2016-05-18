import java.util.Scanner;
import java.util.Random;
 
public class Odev3Soru2 {
 
	static int gercekSayi,tahminSayi,sayac=0,hak,hamle=0;
	static boolean sonHali=false;
	
	//Rastgele bulunan sayıyı baska bir metod içine alarak. kolaylık saglandı
	public static void tahminiBaslat(){	
		tahmin();
	}
 
	//Rastgele 0-100 arasında bir sayı tutuldu
	public static int tahminRandom(){
		
		Random tahminiSayi=new Random();
		return tahminiSayi.nextInt(100);
	}
	
	//Dogru deger girilmediği zaman sayının büyük küçüklügüne göre tekrar sayı girilerek bulma islemi.
	public static int sayiBul(){
		Scanner iha=new Scanner(System.in);
		return iha.nextInt();
	}
	
	//Girilen sayının secilen sayı ile karsılastırıldı
	public static boolean sayiKarsılastır(){
		if(gercekSayi>tahminSayi){
			System.out.println("Daha düşük bir sayı giriniz: ");
			return false;
		}
		else if(gercekSayi<tahminSayi){
			System.out.println("Daha yüksek bir sayı giriniz: ");
			return false;
		}
		else{
			return true;
		}
	}
	
	
	//Döngü içerisine metodlar cagırıldı ve sayac ve hamleler arttırıldı.
	public static void tahmin(){
		
		tahminSayi=tahminRandom();
		while(!sonHali){
			gercekSayi=sayiBul();
			sayac++;
			hamle++;
			sonHali=sayiKarsılastır();
			
			//Girilen hak degeri bittiğinde program durdurulma işlemi
			if(hamle==hak){
				System.out.print("Oyunu kaybettiniz, bulmanız gereken sayı "+tahminSayi+" idi.");
				break;
			}
		}
		
		//Tahminin kac adımda bulundugunu gösteren deger.
		if(sonHali){
			System.out.print("Sayıyı "+sayac+" tahminde buldunuz!!");
		}
		
	}
	
	//Tahminimizi baslatmak için metodumuzu cagırdık ve baslattık.
	public static void main(String[] args){
		Scanner iha=new Scanner(System.in);
		
		System.out.println("Sayıyı kaç tahminde bulacaksınız: ");
		hak=iha.nextInt();
		System.out.println("Bir sayı giriniz: ");
		Odev3Soru2.tahminiBaslat();
	}
}
