package tp1.infrastructure;
public class ApplicationConfig {
    private String databaseUrl, applicationName;
    private ApplicationConfig() {}
    private static class Holder { static final ApplicationConfig INSTANCE = new ApplicationConfig(); }
    public static ApplicationConfig getInstance() { return Holder.INSTANCE; }
    public String getDatabaseUrl() { return databaseUrl; }
    public void setDatabaseUrl(String u) { databaseUrl = u; }
    public String getApplicationName() { return applicationName; }
    public void setApplicationName(String n) { applicationName = n; }
}
