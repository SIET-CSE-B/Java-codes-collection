import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row");
        int r=sc.nextInt();
        System.out.println("Enter col");
        int c=sc.nextInt();
        if(r!=c){
            System.out.print("size should be same");
        }else if(r<0||c<0){
            System.out.print("Array size should not be negative");
        }else{
            int mat1[][]=new int[r][c];
            int mat2[][]=new int[r][c];
            int result[][]=new int[r][c];
            for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat1[i][j]=sc.nextInt();
            }   
            }
            for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat1[i][j]=sc.nextInt();
            }   
            }
            System.out.println("Result:");
            for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
            }   
            }
            System.out.println(""+result);
        }
    }
}