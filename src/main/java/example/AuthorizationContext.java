package example;

public class AuthorizationContext {

    private String stringKey;
    private String numberKey;
    private String booleanKey;

    public AuthorizationContext(String one, String two, String three) {
        this.stringKey = one;
        this.numberKey = two;
        this.booleanKey = three;
    }

    public AuthorizationContext() {
    }

    public String getStringKey() {
        return stringKey;
    }

    public void setStringKey(String value) {
        this.stringKey = value;
    }

    public String getNumberKey() {
        return numberKey;
    }

    public void setNumberKey(String value) {
        this.numberKey = value;
    }

    public String getBooleanKey() {
        return booleanKey;
    }

    public void setBooleanKey(String value) {
        this.booleanKey = value;
    }
}
