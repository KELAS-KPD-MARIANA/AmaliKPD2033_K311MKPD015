package amali;
import java.util.Scanner;
public class Amali {

   
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
          System.out.println("Masukkan nama : ");
          String nama;
          int hari;
          int gaji;
          nama = input.next();
       do{   
          System.out.println("masukkan bilangan hari bekerja:");
        hari = input.nextInt();
          
         if (hari >= 31){
            System.out.println("bilangan hari tidak boleh melebihi 31 hari" ); 
            
         }
        } while(hari >= 31);
       gaji = hari * 160;
       System.out.println("Rumusan gaji bulanan bagi " + nama);
       System.out.println("Jumlah hari bekerja " + hari);
       System.out.println("GAJI SEBULAN ADALAH " + gaji); 
    }
}