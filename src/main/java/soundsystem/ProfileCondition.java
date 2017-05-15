package soundsystem;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.Profile;
import org.springframework.util.MultiValueMap;

import java.util.Iterator;
import java.util.List;

/**
 * @author 李智
 * @date 2017/5/15
 */
public class ProfileCondition implements Condition {
    ProfileCondition() {
    }

    public boolean matches(org.springframework.context.annotation.ConditionContext context, org.springframework.core.type.AnnotatedTypeMetadata metadata) {
        return false;
    }

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        if (context.getEnvironment() != null) {
            MultiValueMap attrs = metadata.getAllAnnotationAttributes(Profile.class.getName());
            if (attrs != null) {
                Iterator var4 = ((List) attrs.get("value")).iterator();

                Object value;
                do {
                    if (!var4.hasNext()) {
                        return false;
                    }
                    value = var4.next();
                } while (!context.getEnvironment().acceptsProfiles((String[]) ((String[]) value)));

                return true;//传给@Profile注解的参数对应的环境profiles已激活
            }
        }

        return true; //默认为true
    }
}
