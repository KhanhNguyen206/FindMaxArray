import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhập giá trị cho mảng int[3][3] matrix");
        int [][] matrix=new int[3][3];

        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.println("Phần tử ["+i+"]"+"["+j+"]");
                int value=scanner.nextInt();
                matrix[i][j]=value;
            }
        }

        String display="";
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                display += "" + matrix[i][j]+" ";
            }
        }
        System.out.println(display);

        int max=matrix[0][0];


        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất trong mảng là: " + max);
}
}
