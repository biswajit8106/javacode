public class SwitchExample {
    public static void main(String[] args) {
        int number=5;
        switch (number){
            case 1:
              System.err.println("The number is 1.");
              break;
            case 2:
              System.err.println("The number is 2.");
              break;
            case 3:
              System.err.println("The number is 3.");
              break;
            case 4:
              System.err.println("The number is 4.");
              break;
            default:
             System.out.println("The number is not 1,2,3, or 4.");
        }
    }
}