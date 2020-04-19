public class UnitTest {
    public static void main(String args[]) {
        MiniCalculator m = new MiniCalculator();
        m.multiply(5);
        if (m.calculate() != 5) {
            System.out.println("\n\tFAILED TO MULTIPLY");
        } else {
            System.out.println("\n\tSUCCESS TO MULTIPLY");
            m.divide(2);
        }
        if (m.calculate() != 2) {
            System.out.println("\n\tFAILED TO DIVIDE");
        } else {
            System.out.println("\n\tSUCCESS TO DIVIDE");
        }
    }
}
