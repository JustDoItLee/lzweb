package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * @author 李智
 * @date 2017/5/15
 */
public class SoundSystemConfig {
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        return new MagicBean();
    }
}
