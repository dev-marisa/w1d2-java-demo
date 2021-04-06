import java.util.HashMap;
import java.util.Arrays;


public class Goats {

    public static void tellUsAboutThisGoat(HashMap<String, Object> goat) {
        System.out.println(goat.get("name"));
        System.out.println(goat.get("sport"));
        System.out.println(goat.get("numberOfRings"));
        System.out.println(
            Arrays.toString(
                (String[]) goat.get("teams")
            )
        );
    }

    public static void main(String[] args) {
        HashMap<String, Object> goat1 = new HashMap<String, Object>();
        goat1.put("name", "Tom Brady");
        goat1.put("sport", "Football");
        goat1.put("numberOfRings", 7);
        goat1.put("teams", new String[]{"Expos", "Patriots", "Buccaneers"});

        HashMap<String, Object> goat2 = new HashMap<String, Object>();
        goat2.put("name", "Michael Jordan");
        goat2.put("sport", "Basketball");
        goat2.put("numberOfRings", 6);
        goat2.put("teams", new String[]{"Bulls", "Wizards"});

        // tellUsAboutThisGoat(goat2);
        // System.out.println(); // like a <br> for java!
        // tellUsAboutThisGoat(goat1);

        String allDaErrors = "";

        for(String key : goat1.keySet()) {
            // System.out.print(key + " : ");
            // System.out.print(goat1.get(key) + "\n"); 
            try {
                System.out.println(
                    key + " : " +
                    Arrays.toString(
                        (String[]) goat1.get(key)
                    )
                );
            } catch(Exception e) {
                // System.out.println(e);
                allDaErrors += e + "\n";
                System.out.println(key + " : " + goat1.get(key)); 
            }
        }

        System.err.println(allDaErrors);


    }
}
