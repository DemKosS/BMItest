public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double result = service.calculate(85, 1.90);
        System.out.println(result);

    }
}