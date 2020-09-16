public class NumberExercises {

    public static void main(String args[]) {

        /**
         * Sort
         */
        String s[] = {"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000"};

        Double d1 = null;
        Double d2 = null;
        String temp = null;

        for(int i=0;i<s.length;i++) {

            for(int j=0; j<s.length-1; j++) {

                System.out.println(s[j]);

                if(! (s[i].trim()).equals("")) {
                    if (new Double(s[j]).doubleValue() < new Double(s[j + 1]).doubleValue()){
                        temp = s[j];
                        s[j] = s[j + 1];
                        s[j + 1] = temp;
                    }
                }
            }
        }

        for(int i=0;i<s.length;i++) {
            System.out.println(s[i]);
        }

    }


}
