public class MoreRecursionHelper {
    //int sum = 0;

    /** Self Explanation - Remember to detail your base and recursive cases.
     *  Takes in a string, and reverses the string.
     *
     *
     */

    public String reverseString(String str) {
        //String strMinusFirstChar = str.substring(1);
        //char firstChar = str.charAt(0);

        if (str.isEmpty()) {
            return str;
        }
        else {
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }
    /** Self Explanation - Remember to detail your base and recursive cases.
     *  Takes in 2 integers. Num is split into chars. Take power of everything and add.
     *
     *
     */
    public int armstrongNumber(int num, int total) {
        int lastDigit;
        if (num == 0) {
            return total;
        }
        else {
            lastDigit = num % 10;
            num = num / 10;
            total = (int) (total + Math.pow(lastDigit, 3));
            return armstrongNumber(num, total);
        }
    }
    /** Self Explanation - Remember to detail your base and recursive cases.
     *  Checks if string is a palindrome.
     *
     *
     */
    public boolean palindromeChecker(String str) {
        if (str.length() == 0) {
            return true;
        }
        else if (str.length() == 1) {
            return true;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
        if (firstChar == lastChar) {
            return palindromeChecker(str.substring(1, str.length() - 1));
        }
        return false;
    }

    public int toBinary(int toConvert) {
        double decimalMod2 = toConvert % 2;

        if (toConvert == 0) {
            return 0;
        }
        else {

            return (int) (decimalMod2 + 10 * (toBinary(toConvert / 2)));
        }
    }

    public int pyramidTotal(int rows) {
        int sum;
        if (rows == 1) {
            return 1;
        }
        return rows + pyramidTotal(rows - 1);
    }

    public void combinations(String str, int index, String currStr) {
        int strLength = str.length();

        if (index == strLength) {
            //System.out.println(currStr);
            return;
        }
        System.out.println(currStr);

        for (int i = index + 1; i < strLength; i++) {
            currStr += str.charAt(i);
            combinations(str, i, currStr);
            currStr = currStr.substring(0, currStr.length() - 1);
        }
    }
}