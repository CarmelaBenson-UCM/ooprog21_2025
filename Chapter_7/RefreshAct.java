public class RefreshAct {  
    public static void main(String[] args) {

        int count = 0;
        int[] responseTimes = {100, 200, 150, 300};
        int sum = responseTimes[0];

        for(int i = 1; i < responseTimes.length; i++) {

            double average = sum/i;

            if(responseTimes[i] > average) {
                count++;
                sum += responseTimes[i];                        
            }
        }
    System.out.println(count);
    }
}
