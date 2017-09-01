package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Authorizer implements RequestHandler<AuthorizerRequest, AuthorizerResponse> {

    @Override
    public AuthorizerResponse handleRequest(AuthorizerRequest input, Context context) {
        String token = input.getAuthorizationToken();

        AuthorizerResponse response = new AuthorizerResponse();
        AuthorizationPolicy policy = new AuthorizationPolicy("2012-10-17");
        AuthorizationStatement stmt = new AuthorizationStatement();
        response.setPrincipalId("user1234");
        stmt.Action = "execute-api:Invoke";
        stmt.Resource = input.getMethodArn();

        if ((token != null) && (token.length() > 2) && (token.length() < 7)) {
            stmt.Effect = AuthorizationEffect.Allow;
            AuthorizationContext authContext = new AuthorizationContext();
            authContext.setStringKey("sampleString");
            authContext.setNumberKey("1"); //sample number
            authContext.setBooleanKey("true"); // sample boolean
            response.setContext(authContext);
        } else {
            stmt.Effect = AuthorizationEffect.Deny;
        }

        policy.addStatement(stmt);
        response.setPolicyDocument(policy);
        return response;
    }
}
