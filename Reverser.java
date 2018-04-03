public class Reverser {

    public String reverse(String str) {
        if (str.length()==0) {
            return null;
        } else {
            System.out.print(str.charAt(str.length()-1));
            return reverse(str.substring(0, str.length()-1));
        }
    }

}
