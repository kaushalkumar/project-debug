package pkg1;

import java.io.File;
import java.util.Map;

public class SharedResourceHelper {

    public static File getFileResource(final String resourceName, final IStrategy strategy) {
        return getFileResource(resourceName, strategy.getEnvMap());
    }

    public static File getFileResource(final String resourceName, final Map<String, Object> envConfig) {
        return null;
    }

}
