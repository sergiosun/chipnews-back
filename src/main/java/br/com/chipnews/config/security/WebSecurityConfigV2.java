package br.com.chipnews.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfigV2 {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .httpBasic()
                .and()
                .authorizeHttpRequests()
                .antMatchers(HttpMethod.GET, "/clients/**").permitAll()
                .antMatchers(HttpMethod.GET, "/clients/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/clients").hasRole("USER")
                .antMatchers(HttpMethod.PUT, "/clients/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/clients/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/clients/**").hasAnyRole("USER", "ADMIN")

                .antMatchers(HttpMethod.GET, "/address/**").permitAll()
                .antMatchers(HttpMethod.GET, "/address/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/address").hasRole("USER")
                .antMatchers(HttpMethod.PUT, "/address/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/address/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/address/**").hasAnyRole("USER", "ADMIN")

                .antMatchers(HttpMethod.GET, "/branch").permitAll()
                .antMatchers(HttpMethod.GET, "/branch/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/branch").hasRole("USER")
                .antMatchers(HttpMethod.PUT, "/branch/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/branch/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/branch/**").hasAnyRole("USER", "ADMIN")

                .antMatchers(HttpMethod.GET, "/city").permitAll()
                .antMatchers(HttpMethod.GET, "/city/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/city").hasRole("USER")
                .antMatchers(HttpMethod.PUT, "/city/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/city/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/city/**").hasAnyRole("USER", "ADMIN")

                .antMatchers(HttpMethod.GET, "/service").permitAll()
                .antMatchers(HttpMethod.GET, "/service/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/service").hasRole("USER")
                .antMatchers(HttpMethod.PUT, "/service/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/service/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/service/**").hasAnyRole("USER", "ADMIN")

                .antMatchers(HttpMethod.GET, "/signature").permitAll()
                .antMatchers(HttpMethod.GET, "/signature/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/signature").hasRole("USER")
                .antMatchers(HttpMethod.PUT, "/signature/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/signature/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/signature/**").hasAnyRole("USER", "ADMIN")

                .antMatchers(HttpMethod.GET, "/state").permitAll()
                .antMatchers(HttpMethod.GET, "/state/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/state").hasRole("USER")
                .antMatchers(HttpMethod.PUT, "/state/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/state/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/state/**").hasAnyRole("USER", "ADMIN")

                .antMatchers(HttpMethod.GET, "/users").permitAll()
                .antMatchers(HttpMethod.GET, "/users/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.POST, "/users").hasRole("USER")
                .antMatchers(HttpMethod.PUT, "/users/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/users/**").hasRole("ADMIN")
                .antMatchers(HttpMethod.DELETE, "/users/**").hasAnyRole("USER", "ADMIN")
                .anyRequest().authenticated()
                .and()
                .csrf().disable();
        return http.build();

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
