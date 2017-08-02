import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

/**
 * Created by paul on 2017/7/31.
 */
public class TestApolloClient {
    public static void main(String[] args) {
        Config config = ConfigService.getAppConfig(); //config instance is singleton for each namespace and is never null
        String someKey = "name2";
        String someDefaultValue = "123";
        String value = config.getProperty(someKey, someDefaultValue);
        System.out.println(value);
    }
}
