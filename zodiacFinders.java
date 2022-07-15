import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		int month, day;
        String zodiac= "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Doğduğunuz Ayı Giriniz :");
        month = input.nextInt();
        System.out.print("Lütfen Doğduğunuz Günü Giriniz :");
        day = input.nextInt();
		
		 if (month == 1) {
              if (day >= 1 && day <= 21) {
                zodiac= "Oğlak";
            } else if (day >= 22 && day <= 31) {
                zodiac= "Kova";
            } else
                isError = true;
            } 
        else if (month == 2) {
              if (day >= 1 && day <= 19) {
                zodiac= "Kova";
            } else if (day >= 20 && day <= 29) {
                zodiac= "Balık";
            }  else
               isError = true;
            } 
        else if (month == 3) {
              if (day >=1 && day <= 20) {
                zodiac= "Balık";
            } else if (day >= 21 && day <= 31) {
                zodiac= "Koç";
            } else
                isError = true;
            } 
        else if (month == 4) {
              if (day >=1 && day <= 20) {
                zodiac= "Koç";
            } else if (day >= 21 && day <= 30) {
                zodiac= "Boğa";
            } else
                isError = true;
            } 
        else if (month == 5) {
              if (day >=1 && day <= 21) {
               zodiac= "Boğa";
            } else if (day >= 22 && day <= 31) {
                zodiac= "İkizler";
            } else
                isError = true;
            } 
        else if (month == 6) {
              if (day >=1 && day <= 22) {
                zodiac= "İkizler";
            } else if (day >=23 && day <= 30) {
                zodiac= "Yengeç";
            } else
                isError = true;
            } 
        else if (month == 7) {
              if (day >=1 && day <= 22) {
                zodiac= "Yengeç";
            } else if (day >=23 && day <= 31) {
                zodiac= "Aslan";
            } else
                isError = true;
            } 
        else if (month == 8) {
              if (day >=1 && day <= 22) {
                zodiac= "Aslan";
            } else if (day >=23 && day <= 31) {
                zodiac= "Başak";
            } else
                isError = true;
            } 
        else if (month == 9) {
            if (day >=1 && day <= 22) {
                zodiac= "Başak";
            } else if (day >=23 && day <= 30) {
                zodiac= "Terazi";
            } else
                isError = true;
            } 
        else if (month == 10) {
              if (day >=1 && day <= 22) {
                zodiac= "Terazi";
            } else if (day >=23 && day <= 31) {
                zodiac= "Akrep";
            } else
                isError = true;
            } 
        else if (month == 11) {
              if (day >=1 && day <= 21) {
                zodiac= "Akrep";
            } else if (day >=22 && day <= 30) {
                zodiac= "Yay";
            } else
                isError = true;
            } 
        else if (month == 12) {
              if (day >=1 && day <= 21) {
                zodiac= "Yay";
            } else if (day >=22  && day <= 31) {
                zodiac= "Oğlak";
            } else
                isError = true;
            }
            
        if ((month > 12) || (month < 1)) {
            System.out.println("Geçersiz Bir Giriş Yaptınız. Lütfen Tekrar Deneyiniz.");
        } 
        else if (isError) {
            System.out.println("Geçersiz Bir Giriş Yaptınız. Lütfen Tekrar Deneyiniz.");
        } 
        else {
            System.out.println("Burcunuz : " + zodiac);
        }
	}
}
