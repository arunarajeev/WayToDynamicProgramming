public class RemoveAllOccurences {
    public static void main(String[] args) {
        String str = "our local library needs your help! Given the expected and actual"+ 
        "return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:";
        String[] remove = str.split("[uo]");
        System.out.println(str.join("",remove));
    }
}
