import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expresion {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {


            Pattern pat = Pattern.compile("(?)Hola mundo"  );
            Matcher mat = pat.matcher(args[i]);
            Pattern pat2 = Pattern.compile("(?i)Hola mundo");
            Matcher mat2 = pat2.matcher(args[i]);
            Pattern pat3 = Pattern.compile("\\b(?i:Java|Python|Go|Pascal|Perl)\\b");
            Matcher mat3 = pat3.matcher(args[i]);
            Pattern pat4 = Pattern.compile("(?i)a\\d{9}(?i:@unison.mx|@uson.mx)");
            Matcher mat4 = pat4.matcher(args[i]);
            Pattern pat5 = Pattern.compile("(?)ISI\\d{4}-(1|2)\\.(csv|txt)");
            Matcher mat5 = pat5.matcher(args[i]);
                    if (mat.matches() || mat2.matches() || mat3.matches() || mat4.matches() ||
                            mat5.matches()) {
                        System.out.println("Sí es una expresión válida");
                    } else {
                        System.out.println("No es una expresión válida");
                    }

            }






        }//main
}




