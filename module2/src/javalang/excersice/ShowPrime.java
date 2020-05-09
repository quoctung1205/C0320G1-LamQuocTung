package javalang.excersice;

public class ShowPrime {
    public static void main(String[] args) {
        int n = 20;
        int dem = 0;
        int i = 2;
        while(dem < n){
            if(isPrimeNumber(i)){
                System.out.println(i + "\n");
                dem++;
            }i++;
        }
    }
    public static boolean isPrimeNumber(int n){
        for(int j =2; j<= Math.sqrt(n);j++){
            if (n % j == 0){
                return false;
            }
        }
        return true;
    }
}
