package TugasPraktikum01;

import java.util.Scanner;
public class MainBooks {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Books type = new Books();
            System.out.println("========== Welcome To Brawijaya's Library ==========");
            System.out.println("Enter the options according to the existing categories");
            int x = scan.nextInt();
            if(x == 1){
                type.booklist(type.teknologi);
            }
            else if (x==2){
                type.booklist(type.filsafat);
            }
            else if (x==3){
                type.booklist(type.sejarah);
            }
            else if (x==4){
                type.booklist(type.agama);
            }
            else if (x==5){
                type.booklist(type.fiksi);
            }
        }
}
