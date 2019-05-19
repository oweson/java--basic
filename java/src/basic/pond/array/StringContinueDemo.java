/**
 *
 */
package basic.pond.array;


class StringContinueDemo {


    public static void main(String[] args) {
        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            /** 1 查找*/
            // interested only in p's
            if (searchMe.charAt(i) != 'p') {
                continue;
            }


            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }

}
