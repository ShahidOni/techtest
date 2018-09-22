package technicaltest.japan.configuration;


import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;


/**
 * Created by shain.shahid on 9/22/2018.
 */

@Configuration
@ComponentScan(basePackages = {"technicaltest.japan"})
@PropertySource("classpath:datasource.properties")
public class ApplicationConfiguration {

    @Bean
    @Primary
    public DataSource dataSource(Environment env) {

        return DataSourceBuilder
                .create()
                .username(env.getProperty("datasource.username"))
                .url(env.getProperty("datasource.url"))
                .driverClassName(env.getProperty("datasource.driver.class"))
                .build();
    }

}
