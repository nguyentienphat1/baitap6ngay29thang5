import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu");
        n= scanner.nextInt();
        int phantu[]= new int[n];
        for (int i=0;i<n;i++){
            System.out.println("nhap phan tu "+i);
            phantu[i]= scanner.nextInt();
        }
        int max=phantu[0];
        int vitrilonnhat=0;
        for (int i=0;i<n;i++){
            if (phantu[i]>max){
                max=phantu[i];
                vitrilonnhat=i;
            }
        }
        System.out.println("vi tri phan tu lon nhat" +vitrilonnhat);
        System.out.println( max+ "la phan tu lon nhat");
        int min=phantu[0];
        int vitrimin=0;
        for (int i=0;i<n;i++){
            if (phantu[i]<min){
                min=phantu[i];
                vitrimin=i;
            }
        }
        System.out.println("vi tri nho nhat la: "+vitrimin);
        System.out.println(min+ "la phan tu nho nhat");
    }
}