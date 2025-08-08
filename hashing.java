import java.util.Scanner;


public class hashing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String st= sc.nextLine();
        int n= st.length();
        int s =0;
        for(int i=0;i<n;i++){
            s=s+ascii(st.charAt(i));
        }
        hashfunc(s,st);
    }

    public static char ascii(char a){
        int Aval=a;
        return a;
    }

    public static void hashfunc(int s,String str){
        Scanner sq = new Scanner(System.in);
        System.out.print("Enter the value of hash table : ");
        int n = sq.nextInt();
        
        int j=s%n;
        String[] hash = new String[n];
        hash[j]=str;
        for(int i=0;i<n;i++){
            System.out.println(i + "->"+ hash[i]);
        }

    }

}