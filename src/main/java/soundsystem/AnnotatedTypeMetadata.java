package soundsystem;

import org.springframework.util.MultiValueMap;

import java.util.Map;

/**
 * @author 李智
 * @date 2017/5/15
 */
public interface AnnotatedTypeMetadata {
    boolean isAnnotated(String var1);

    Map<String, Object> getAnnotationAttributes(String var1);

    Map<String, Object> getAnnotationAttributes(String var1, boolean var2);

    MultiValueMap<String, Object> getAllAnnotationAttributes(String var1);

    MultiValueMap<String, Object> getAllAnnotationAttributes(String var1, boolean var2);
}
