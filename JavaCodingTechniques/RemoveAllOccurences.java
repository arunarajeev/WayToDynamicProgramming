public class RemoveAllOccurences {
    public static void main(String[] args) {
        String str = "our local library needs your help! Given the expected and actual" +
                "return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:";
        String[] remove = str.split("[uo]");
        String result = "";
        result = result.join("", remove);
        System.out.println(result);
        String s = result.substring(0, 1).toUpperCase();
        for (int i = 1; i < result.length(); i++) {
            if (result.charAt(i - 1) == ' ') {
                s = s + result.substring(i, i + 1).toUpperCase();
            } else {
                s = s + result.charAt(i);
            }
        }
        System.out.println(s);
        // optimizing the camel case logic

        String[] finalArray = result.split(" ");
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = finalArray[i].substring(0, 1).toUpperCase() + finalArray[i].substring(1);
        }
        String finalString="";
        finalString = finalString.join(" ", finalArray);
        System.out.println(finalString);
    }
}
