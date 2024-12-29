package ashok.in.confige;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AllSecurityConfigure {

    @Bean
    public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests((reg) -> reg.requestMatchers("/welcome").
                permitAll().
                anyRequest().
                authenticated()).
                formLogin();
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager configureUser(){
        UserDetails adminUser = User.withDefaultPasswordEncoder()
                .username("jitendra")
                .password("Jitendra8083@")
                .authorities("ADMIN")
                .build();
        UserDetails normalUser = User.withDefaultPasswordEncoder()
                .username("usertest")
                .password("Jitendra8083@")
                .authorities("User")
                .build();
        return new InMemoryUserDetailsManager(adminUser , normalUser);
    }
}
