package soundsystem;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;

/**
 * @author 李智
 * @date 2017/5/15
 */
public interface ConditionContext {
    BeanDefinitionRegistry getRegistry();

    ConfigurableListableBeanFactory getBeanFactory();

    Environment getEnvironment();

    ResourceLoader getResourceLoader();

    ClassLoader getClassLoader();
}
