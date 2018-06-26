package utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({DomainConfiguration.class, ServiceConfiguration.class, DaoConfiguration.class})
public class AllConfiguration {
}
