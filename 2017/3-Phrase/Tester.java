
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] arrrrrggggggs)
    {
        Phrase phrase1 = new Phrase("A cat ate late.");
        Phrase phrase2 = new Phrase("A cat ate late.");
        Phrase phrase3 = new Phrase("A cat ate late.");
        Phrase phrase4 = new Phrase("aaaa");
        Phrase phrase5 = new Phrase("aaaa");
        
        System.out.println(phrase1.findNthOccurrence("cat", 1));
        System.out.println(phrase1.findNthOccurrence("bat", 1));
        System.out.println(phrase1.findNthOccurrence("at", 1));
        System.out.println(phrase1.findNthOccurrence("at", 3));
        System.out.println(phrase1.findNthOccurrence("at", 4));
        
        phrase1.replaceNthOccurrence("at", 1, "rane");
        phrase2.replaceNthOccurrence("at", 6, "xx");
        phrase3.replaceNthOccurrence("bat", 2, "xx");
        phrase4.replaceNthOccurrence("aa", 1, "xx");
        phrase5.replaceNthOccurrence("aa", 2, "bbb");
        
        System.out.println(phrase1);
        System.out.println(phrase2);
        System.out.println(phrase3);
        System.out.println(phrase4);
        System.out.println(phrase5);
        
        Phrase tphrase1 = new Phrase("A cat ate late.");
        
        System.out.println(tphrase1.findLastOccurrence("at"));
        System.out.println(tphrase1.findLastOccurrence("cat"));
        System.out.println(tphrase1.findLastOccurrence("bat"));
                
    }
}
