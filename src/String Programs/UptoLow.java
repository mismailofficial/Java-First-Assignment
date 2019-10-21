public class UptoLow {
    public static void main(String[] args) {

        String name = "My name is Muhammad ISmail";
        char[] nameArray = name.toCharArray();

        for (int i = 0; i < nameArray.length; i++) {
            if (nameArray[i] >= 'a' && nameArray[i] <= 'z')
                nameArray[i] = Character.toUpperCase(nameArray[i]);
            else if (nameArray[i] >= 'A' && nameArray[i] <= 'Z')
                nameArray[i] = Character.toLowerCase(nameArray[i]);
        }
        System.out.println(nameArray);
    }
}
