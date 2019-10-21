public class WhiteSpace {
    public static void main(String[] args) {

        String str = "My   Country is    PAKISTAN";
        String noSpaceStr = str.replaceAll("\\s","  ");
        System.out.println(noSpaceStr);
    }
}
