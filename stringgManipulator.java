/**
 * @meyremtlly@gmail.com 
 *This program finds the initials of names and surnames in method 1, converts them to uppercase letters and returns them as strings.
 *Method 2 replaces the extension in the file name with the given file extension using the given file extension.
 */
import static java.lang.String.valueOf;
public class StringManipulator 
{
    
    /**
     * returns intiail of the given name
     * e.g.: if name is "ALI VELI", it returns "AV". 
     * Verilen ismin bas harflerini bulur, ornegin "Ayse Fatma" icin
     * "AF" return eder
     * ismin sadece 2 kelimeden olustugunu varsayabilirsiniz.
     * @param name
     * @return the initials
     */
    String findInitials(String name)
    {
     
    //capitalizes the letters of the text
        name=name.toUpperCase();
        
        int a=name.indexOf(" ");
        char b=name.charAt(0);
        char c=name.charAt(a+1);
       
    //String converting function
        String x=valueOf(b);
        
        String y=valueOf(c);
        
        String z=x.concat(y);
        
        return z;

    }
    
    
    /**
     * changes the extension of the filename
     * e.g. if filename is "data.txt" and ext is "java"
     * it returns "data.java"
     * tr: verilen dosyanin uzantisini degistirir. Ornegin 
     * e.g.  filename icin "data.txt" ve ext icin "java" verilirse
     * "data.java" yi  return eder
     * @param filename
     * @param ext
     * @return
     */
    String changeExtension(String filename, String ext)
    {
        int a=filename.indexOf(".");
        
        String z=filename.substring(0,a+1);
        String e=z.concat(ext);
        return e;
    }

    public static void main(String[] args)
    {
        /*This part is not tested and graded. 
        You can try to manually test your program from here 
        */

    }

}