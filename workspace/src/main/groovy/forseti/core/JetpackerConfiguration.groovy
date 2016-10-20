package forseti.core

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.config.YamlPropertiesFactoryBean
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.springframework.core.io.ClassPathResource

/**
 * Created by donny.wijaya on 19/10/2016.
 */
@Configuration
@EnableConfigurationProperties(Jetpacker.class)
class JetpackerConfiguration {
    private final Jetpacker jetpacker

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer()

        YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean()

        yaml.resources = [
                new ClassPathResource("jetpacker/boxes.yml"),
                new ClassPathResource("jetpacker/databases.yml"),
                new ClassPathResource("jetpacker/messageQueues.yml"),
                new ClassPathResource("jetpacker/searchEngines.yml"),
                new ClassPathResource("jetpacker/boxes.yml")
        ]

        configurer.properties = yaml.object

        return configurer;
    }

    @Autowired
    JetpackerConfiguration(Jetpacker jetpacker) {
        this.jetpacker = jetpacker

        println "Jetpacker : ${jetpacker}"
    }
}
