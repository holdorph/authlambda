package example;

public class AuthorizerRequest {

    private String type;
    private String authorizationToken;
    private String methodArn;

    public AuthorizerRequest() {
    }

    public AuthorizerRequest(String type, String token, String method) {
        this.type = type;
        this.authorizationToken = token;
        this.methodArn = method;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthorizationToken() {
        return authorizationToken;
    }

    public void setAuthorizationToken(String token) {
        this.authorizationToken = token;
    }

    public String getMethodArn() {
        return methodArn;
    }

    public void setMethodArn(String method) {
        this.methodArn = method;
    }
}
