package technicaltest.japan.configuration;


import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


/**
 * Created by shain.shahid on 9/22/2018.
 */

@Configuration
@ComponentScan(basePackages = {"technicaltest.japan"})
public class ApplicationConfiguration {

    @Bean
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .username("root")
                .url("jdbc:mysql://localhost:3306/devinfo?useSSL=false")
                .driverClassName("com.mysql.jdbc.Driver")
                .build();
    }

}
