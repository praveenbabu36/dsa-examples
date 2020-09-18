import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class StringExercises {
    public static void main(String args[]) {
        String S = "ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
        int k = 30;

        /* using Arrays.sort
        String[] str = new String[ (S.length() - (k-1)) ];
        for(int i=0; i<=S.length()-3;i++){
            str[i] = S.substring(i,i+k);
        }

        Arrays.sort(str);

        System.out.println(str[0]);
        System.out.println(str[str.length-1]);/*
         */

        /*  Lexical Order
        String minStr = "", maxStr = "", tempStr = "";
        for(int i=0; i<=S.length()-k;i++){
            tempStr = S.substring(i,i+k);
            if(i==0) {
                minStr = tempStr;
                maxStr = tempStr;
            }

            if(tempStr.compareTo(minStr) < 0) {
                minStr = tempStr;
            }

            if(tempStr.compareTo(maxStr) > 0) {
                maxStr = tempStr;
            }
        }
        System.out.println(minStr);
        System.out.println(maxStr);
        */

        /**
         * Palindrome
         */
        /*
        String A = "madam";
        String isPalindrome = "Yes";
        for(int i=0,j=A.length()-1; i<A.length(); i++, j--) {
            if (A.charAt(i) != A.charAt(j)) {
                isPalindrome = "No";
            }
        }
        System.out.println(isPalindrome);
        */

        /**
         * Anagram Check - using Pattern
         */
        /*
        String a = "anagram";
        String b = "MARGANA";

        boolean isAnagram = true;

        Pattern pattern = null;
        Matcher matcher = null;
        String t = null;

        if(a.length() != b.length()) {
            isAnagram = false;
        }else{
            for(int i=0; i<a.length(); i++) {

                int a_count = 0, b_count=0;

                t = "/" + a.charAt(i) + "/i";
                pattern = Pattern.compile(t);
                matcher = pattern.matcher(a);

                while (matcher.find()) {
                    a_count++;
                }

                matcher = pattern.matcher(b);

                while (matcher.find()) {
                    b_count++;
                }

                if(a_count != b_count ) {
                    isAnagram = false;
                }
            }
        }
        System.out.println(isAnagram);
        */


        /**
         * Anagram Check - using Recursive
         */
        /*
        String a = "anagram";
        String b = "MARGANA";

        boolean isAnagram = true;

        if( a.length() != b.length() ) {
            isAnagram = false;
        }else{
            for(int i = 0; i < a.length(); i++) {
                int a_count = 0, b_count=0;
                a_count = countOccurences(a.toLowerCase(), a.charAt(i), 0);
                b_count = countOccurences(b.toLowerCase(), a.charAt(i), 0);
                if(a_count != b_count) {
                    isAnagram = false;
                }
            }
        }

        System.out.println(isAnagram);*/

        /**
         * Regex
         */
        /*
        //String s = "                 YES      leading spaces        are valid,    problemsetters are         evillllll!";
        //String s = " a  b";
        //String s = "Good luck with this case!!! h jrkjc c l m e i vct h ss pqk_v i olf tuoej_          p r jrpjpuo a.          udc mu tk g dc,          j o mui brljn!jv p rsklqu p?a lv l n dl quo!cml pld qf l s!          t nb ud j etc q           a j f ugc eer c,          ci de lm p iwk_nwa e su s u ga.l w xlkod f e v_          oo ukaa v t xe.          j cl vmh hi tl!          xa aw ugeibo?c r oo v qte ri,          elbf ibg qk i_m nm s ainis s           u m rhd fgi h v!          mji tu oj t c d.x hxtp a bf xj.          l j ela wuj is           pj gu fs e o v i,s s i b k kab tw@          im c vlud k ki!          e ft gpcf t g k'          m c r snv w b rw,hwoh dfl hn u@cb ep ucsse j_          a d h q p w q rjp_          tln j vofvwg_sj rx pur l dx_          vo b lk sljnm?          k xox i cv va l,          du toe sdwx g@c s uded gw od!          tqsv v t v fnl'          o amka ll x s q_          a frs s ltubs?wdjfdrf x jk.jgkb d s d k n m@sedwkpe ev h_icr ggqxvap@          j g hva o kja q?          j j q ra iak c u!          vqnf thfw wx!          ccn mox sp do'u r ei ifah nl'u g m qipu r c e           ws op hng fbp.          fr vle qh d fv_okcei p e oal_a nsxi g to w x!          qfvv sr cjmo_          kchrkonuc f'ush wd xptas!rfrt o llgwf?          jclpl wmt h r           rv o lhnxnbf           h fqfnla pft?n b uu tbba sl_u ij f i jox xu.ext p gs un dc           fx p o kh rl l j'nkgevg xdrq?          q s wv umu olw?jaidu ilpr e?fc qcr p htpn           g xt d d uqk cp,          cts jkg e i op_j utt rf gvm t!          qgjr r r s cpc,          m n a wde pcg v?e ioek nlc fh@ahk ei ejmp d_fq enmeoesu?          skntwnolsx!j bt bgb dhtt!          r jcl mdh i kr,          m jcl fgix gq_enpuk n g rl i?ei xedl o h e a!x wjp uge h w g'wb dg wlkxli qi x ff eq gbe_bakb m c p aos_vv c m labuj r!          s t oign xwn a@c ffwpic wck_          gmkahnse si!q viev a ndfg,f p utcumoxb'          kgd m n g gnk b!          i rr x x uxx g p_          af s piu hgs o?          kpmrltmrqe@s m mbjfnxq p'          g f i v l wc u ij@";

        String s = "                        ";
        s = s.trim();

        if(s.length() == 0){
            System.out.println(0);
        } else {
            String[] strArr = s.split("[\\s',?!_.@]+");
            System.out.println(strArr.length);
            for(int i=0; i < strArr.length; i++) {
                System.out.println(strArr[i]);
            }
        }*/

        /**
         * Regex check pattern
         */
        /*
        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());
        String regexValid;
        while(testCases>0){
            regexValid = "Valid";
            //Write your code
            try {
                Pattern.compile(in.nextLine());
            }catch(PatternSyntaxException e) {
                regexValid = "InValid";
            }
            System.out.println(regexValid);
        }
        */

        /**
         * Valid IP Regex
         */
        //String IP = "000.12.12.034";
        //String IP = ".....";
/*
        String[] IP = {
                "12.12.12.12",
                "13.13.13.112",
                "VUUT.12.12",
                "111.111.11.111",
                "1.1.1.1.1.1.1",
                ".....",
                "1...1..1..1",
                "0.0.0.0",
                "255.0.255.0",
                "266.266.266.266",
                "00000.000000.0000000.00001",
                "0023.0012.0012.0034"
        };
        for(int i=0;i<IP.length;i++) {
            System.out.println(IP[i].matches(new MyRegex().pattern));
        }*/


/*        String IP = "213";
        //String IP = "I.Am.not.an.ip";
        //String IP = "266.266.266.266";"
        //String IP = "255.255.255.254";
        System.out.println(IP.matches(new MyRegex().pattern));*/

        // Number of words
        String str = "saveChangesInTheEditor";
        int numOfWords = 0;
        if(str.length() > 1){
            numOfWords = 1;
        }
        for(int i=0; i<str.length(); i++ ) {
            String letter_ = String.valueOf(str.charAt(i));
            if( letter_ != letter_.toLowerCase()) {
                numOfWords++;
            }
        }

        System.out.println(numOfWords);
    }

    /*private static int countOccurences(String str, char ch, int index) {
        if(index >= str.length()) {
            return 0;
        }
        int count = str.charAt(index) == ch ? 1 : 0;
        return count + countOccurences(str, ch, index + 1);
    }*/



}

class MyRegex {

    //private Pattern pattern_ = Pattern.compile("\\d{0,3}\\.\\d{0,3}.\\d{0,3}.\\d{0,3}", Pattern.LITERAL);
    //public String pattern = "\\d{0,3}\\.\\d{0,3}\\.\\d{0,3}\\.\\d{0,3}";
    public String pattern = "(1-255)";
}

