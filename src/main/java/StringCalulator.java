public class StringCalulator {
    public static int add(final String numbers) {
        int returnValue = 0;
        int negNum = 0;
        String[] numbersArray = numbers.split(",|\n");

        for (String number : numbersArray) {

            if (!number.trim().isEmpty()) {
                int num = 0;
                num += Integer.parseInt(number.trim());
                if ( num < 0) {
                    throw new IllegalArgumentException("Negative numbers not allowed");


                } else if (num <= 1000) {
                    returnValue += num;
                }
            }
        }

        return returnValue;
    }
}
