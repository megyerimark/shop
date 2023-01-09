import models.DataService;
import models.MariaDbDatabase;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Adatbázis elérés");
        DataService dataService = new DataService(new MariaDbDatabase(
        "shop",
         "titok",
        "shop"));
    }
}
