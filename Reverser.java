public class Reverser {

    public String reverse(String str) {
        return String.valueOf(reverseHelper(str.toCharArray(),0));
    }

    private char[] reverseHelper(char[] str, int index) {
        if (index >= str.length/2) {
            return str;
        } else {
            return reverseHelper(swap(str, index), index+1);
        }
    }

    public char[] swap(char[] arr, int i) {
        char temp = arr[i];
        arr[i] = arr[arr.length -1 - i];
        arr[arr.length -1 - i] = temp;
        return arr;
    }



}
