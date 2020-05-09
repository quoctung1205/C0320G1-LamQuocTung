package javalang.excersice;

public class ShowPrime100 {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("The prime number < 100 is: ");
        for(int i=3;i<n;i+=2){
            if(isPrimeNumber(i)){
                System.out.println("\n" + i);
            }
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
