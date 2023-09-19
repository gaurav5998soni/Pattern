public class BarGraphPattern {

    public static void main(String [] arags) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter digits with spaces");
        String userInput = scanner.nextLine();

        var inputArray = new java.util.ArrayList<>(Arrays.stream(userInput.split(" ")).map(Integer::parseInt).toList());
        var length = inputArray.size();
        var min = Collections.min(inputArray);
        var max = Collections.max(inputArray);
        var counter = 0;
        if(min<0) {
            counter = max+1;
        }
        counter = Math.abs(min) + max + 1;

        while(counter>=min) {

            for(int i=0 ; i<length; i++) {

                if(inputArray.get(i) == i || inputArray.get(i) > i) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            counter--;
            System.out.println();
        }

    }
}
