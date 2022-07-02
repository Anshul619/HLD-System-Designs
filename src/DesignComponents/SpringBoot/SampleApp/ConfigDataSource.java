package SpringBoot.SampleApp;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Bean annotation specifies that a method produces a return value registered as a bean ( data ) with BeanFactory – managed by Spring Container.
 *
 * References - https://www.geeksforgeeks.org/spring-boot-auto-configuration/
 */
// Annotation
@Configuration

// Class
public class ConfigDataSource {

    // Annotation
    @Bean
    public static DataSource source()
    {

        DataSourceBuilder<?> dSB
            = DataSourceBuilder.create();
        dSB.driverClassName("com.mysql.jdbc.Driver");

        // MySQL specific url with database name
        dSB.url("jdbc:mysql://localhost:3306/userdetails");

        // MySQL username credential
        dSB.username("user");

        // MySQL password credential
        dSB.password("password");

        // builds and returns a new
        // configured datasource object
        return dSB.build();
    }
}