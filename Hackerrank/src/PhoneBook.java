import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String args[]) {
        String name = "sam";
        int phone = 99912222;

        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        phoneBook.put(name, phone);

        name = "tom";
        phone = 11122222;
        phoneBook.put(name, phone);

        name = "praveen";
        phone = 123123;
        phoneBook.put(name, phone);

        System.out.println(phoneBook);

        String toFind = "tom";
        if(phoneBook.get(toFind) != null) {
            System.out.println( toFind + "=" + phoneBook.get(toFind));
        }else{
            System.out.println(toFind + "=Not found");
        }

    }
}
