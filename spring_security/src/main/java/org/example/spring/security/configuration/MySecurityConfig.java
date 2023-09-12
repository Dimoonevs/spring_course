package org.example.spring.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.servlet.configuration.WebMvcSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.sql.DataSource;

import static org.springframework.security.config.Customizer.withDefaults;



@Configuration
@EnableWebSecurity
public class MySecurityConfig{
    @Autowired
    private DataSource dataSource;

    @Bean
    public SecurityFilterChain securityFilterChainHtpConfigurer(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .requestMatchers(new AntPathRequestMatcher("/")).hasAnyRole("EMPLOYEE","HR","MANAGER")
                .requestMatchers(new AntPathRequestMatcher("/hr_info")).hasRole("HR")
                .requestMatchers(new AntPathRequestMatcher("/manager_info")).hasRole("MANAGER")
                .requestMatchers(new AntPathRequestMatcher("/login")).permitAll()
                .and()
                .formLogin(withDefaults());

        return http.build();
    }
//    @Bean
//    public InMemoryUserDetailsManager userDetailsServiceFor() {
//        UserDetails employee = User.withDefaultPasswordEncoder()
//                .username("employee")
//                .password("employee")
//                .roles("EMPLOYEE")
//                .build();
//        UserDetails elena = User.withDefaultPasswordEncoder()
//                .username("elena")
//                .password("elena")
//                .roles("HR")
//                .build();
//        UserDetails admin = User.withDefaultPasswordEncoder()
//                .username("ivan")
//                .password("ivan")
//                .roles("MANAGER","HR")
//                .build();

//        return new InMemoryUserDetailsManager();
//    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource);
    }

}
