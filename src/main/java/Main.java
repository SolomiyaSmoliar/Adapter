import authorization.Authorization;
import builder.ReportBuilder;
import db.Database;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization auth = new Authorization();
        if (auth.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
