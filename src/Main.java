public class Main {

    public static void main(String[] args) {

        String test = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        System.out.println(highAndLow(test));

    }

     public static String highAndLow(String numbers) {
        String[] singleNumbers = numbers.split(" ");
        int highest = 0;
        int lowest = 0;

        for(int i = 0; i < singleNumbers.length; i++) {
            int value = Integer.parseInt(singleNumbers[i]);
            System.out.println(value);
            if(highest == 0 || highest < value) {
                highest = value;

            }
            if(lowest == 0 || lowest > value) {
                lowest = value;
            }
        }

        String out = String.valueOf(highest + " " + lowest);

        return out;
    }
}
