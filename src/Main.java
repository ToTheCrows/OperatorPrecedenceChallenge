public class Main {
    public static void main(String[] args) {
        double myVariable = 20.00d;
        double myVariable2 = 80.00d;
        double result = ((myVariable+myVariable2)*100d)%40.00d;
        boolean resultBool = result == 0.00 ? true : false;
        System.out.println(resultBool);

        if(!resultBool) {
            System.out.println("Got some remainder");
        }

    }
}