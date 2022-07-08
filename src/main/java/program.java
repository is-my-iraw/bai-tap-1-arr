import java.util.Scanner;

public class program {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhap so phan tu cua mang:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("nhap ca phan tu cua mang: \n");
        for (int i = 0; i < n; i++){
            System.out.printf("a[%d] =", i);
            arr[i] = scanner.nextInt();
        }
        sortDESC(arr);
        System.out.println("day so duoc sap xep giam dan");
        show(arr);

    }
    public static void sortDESC(int [] arr){
        int temp = arr[0];
        for (int i = 0; i< arr.length -1;i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void show(int []arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
