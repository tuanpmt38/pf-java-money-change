public class MoverMoney {
    public static void main(String[] args) {
        float vnd, usd;
        float rate = 23000;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter money USD: ");
        usd = sc.nextFloat();
        vnd = rate * usd;
        System.out.println("Display money VND:" + vnd);
    }
}
