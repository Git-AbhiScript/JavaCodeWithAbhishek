public class ReplaceSpaceWithUnderscores {
    public static void main(String[] args) {
        String name="   Abhishek    ";
        System.out.println("Before: "+name);
        System.out.println("After Replacing: ");
        System.out.println(name.replace(" ","_"));
    }
}
