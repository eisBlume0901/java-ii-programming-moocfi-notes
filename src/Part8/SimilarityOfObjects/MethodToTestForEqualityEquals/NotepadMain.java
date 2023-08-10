package Part8.SimilarityOfObjects.MethodToTestForEqualityEquals;

public class NotepadMain {
    public static void main(String[] args)
    {
        Notepad basics = new Notepad("Equals basics", 2000);
        Notepad advanced = new Notepad("Equals advanced", 2001);

        System.out.println(basics.equals(basics)); //true
        System.out.println(basics.equals(advanced)); //false
        System.out.println(basics.equals(new Notepad("Equals basics", 2000))); //false
        System.out.println(basics.equals(new Notepad("Equals basics", 2001))); //false
    }
}
