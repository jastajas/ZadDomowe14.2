import javax.servlet.http.HttpServletRequest;

public class TextAnalyser {

    public static int numberOfChars(HttpServletRequest request){
        String testText = null;
        testText = request.getParameter("toAnalyze");
        return testText.length();
    }

    public static int blackChars(HttpServletRequest request){
        String testText = null;
        testText = request.getParameter("toAnalyze");

        String[] words = testText.split(" ");
        int blackNo = 0;

        for (int i = 0; i < words.length; i++) {
          blackNo += words[i].length();
        }

        return blackNo;
    }

    public static boolean palindromTest(HttpServletRequest request){
        String testText = null;
        testText = request.getParameter("toAnalyze");

        if(testText == ""){
            return false;
        }

        String[] words = testText.split(" ");
        int z = words.length - 1;
        boolean palindrom = true;

        for (int i = 0; i < words.length; i++) {
           if (!words[i].equals(words[z])){
              palindrom = false;
              break;
           }
           z--;
        }

        return palindrom;

    }

    public static int numberOfWords(HttpServletRequest request){
        String testText = null;
        testText = request.getParameter("toAnalyze");
        int noWords = 0;

        if(testText != ""){
        String[] words = testText.split(" ");
            noWords = words.length;
        }

        return noWords;
    }


}
