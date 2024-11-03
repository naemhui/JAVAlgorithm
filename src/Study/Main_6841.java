package Study;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main_6841 {
    public static String iSpeakTxtMsg(String msg) {
        Map<String, String> msgMap = new HashMap<>();
        msgMap.put("CU", "see you");
        msgMap.put(":-)", "I’m happy");
        msgMap.put(":-()", "I’m unhappy");
        msgMap.put(";-)", "wink");
        msgMap.put(":-P", "stick out my tongue");
        msgMap.put("(~.~)", "sleepy");
        msgMap.put("TA", "totally awesome");
        msgMap.put("CCC", "Canadian Computing Competition");
        msgMap.put("CUZ", "because");
        msgMap.put("TY", "thank-you");
        msgMap.put("YW", "you’re welcome");
        msgMap.put("TTYL", "talk to you later");

        return msgMap.getOrDefault(msg, msg);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String msg = scanner.nextLine();
            String translatedMsg = iSpeakTxtMsg(msg);
            System.out.println(translatedMsg);

            if (msg.equals("TTYL")) {
                break;
            }
        }

        scanner.close();
    }
}
