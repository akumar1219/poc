/**
 *
 */
package com.tutorial.poc.config;

/*import static org.springframework.security.config.Customizer.withDefaults;

import com.tutorial.poc.security.PocBasicAuthenticationProvider;
import com.tutorial.poc.service.PocUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;*/

import java.util.Arrays;
import java.util.List;


/**
 * @author jitsha
 *
 */
/*@EnableWebSecurity
@EnableMethodSecurity
@Configuration*/
public class SecurityConfiguration {

 /*   public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
                .userDetailsService(new PocUserDetailsService())
                .httpBasic(withDefaults());
        return http.build();
    }

    @Bean
    AuthenticationProvider authenticationProviderDao() {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setUserDetailsService(new PocUserDetailsService());
        return daoAuthenticationProvider;
    }

    @Bean
    AuthenticationProvider authenticationProvider() {
        return new PocBasicAuthenticationProvider();
    }

    @Bean
    UserDetailsService userDetailsService(){
        GrantedAuthority admin = new SimpleGrantedAuthority("ROLE_ADMIN");
        GrantedAuthority user = new SimpleGrantedAuthority("ROLE_USER");

        List<UserDetails> users = Arrays.asList(
               new User("User A", "Password", Arrays.asList(admin, user)),
               new User("User B", "Password", Arrays.asList(admin, user)),
               new User("User C", "Password", Arrays.asList(admin, user)),
               new User("User D", "Password", Arrays.asList(admin, user)));
        return new InMemoryUserDetailsManager(users);
    }

    PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }
*/


}
