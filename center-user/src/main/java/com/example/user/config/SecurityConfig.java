package com.example.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @Auther: GEEX1428
 * @Date: 2021/3/27 15:05
 * @Description:
 */
@Profile({"dev", "alpha"})
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean(name = "userDetailsService")
    public UserDetailsService userDetailsService() {
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users.username("user").password("123").roles("USER").build());
        return manager;
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/ajax/**");
        web.ignoring().antMatchers("/css/**");
        web.ignoring().antMatchers("/file/**");
        web.ignoring().antMatchers("/fonts/**");
        web.ignoring().antMatchers("/i18n/**");
        web.ignoring().antMatchers("/img/**");
        web.ignoring().antMatchers("/js/**");
        web.ignoring().antMatchers("/ruoyi/**");
        web.ignoring().antMatchers("/repayPlanRecord/**");
        web.ignoring().antMatchers("/record/**");
        web.ignoring().antMatchers("/contract/**");
        web.ignoring().antMatchers("/check/**");
        web.ignoring().antMatchers("/recon/**");
        web.ignoring().antMatchers("/judge/**");
        web.ignoring().antMatchers("/loanRule/**");
        web.ignoring().antMatchers("/system/**");
        web.ignoring().antMatchers("/productRule/**");
        web.ignoring().antMatchers("/decisionRecord/**");
        web.ignoring().antMatchers("/decisionApply/**");
        web.ignoring().antMatchers("/cache/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/contract/*")
                .ignoringAntMatchers("/decisionApply/*")
                .ignoringAntMatchers("/decisionRecord/*")
                .ignoringAntMatchers("/lending/*")
                .ignoringAntMatchers("/productRule/*")
                .ignoringAntMatchers("/recon/*")
                .ignoringAntMatchers("/repayPlanRecord/*")
                .and().authorizeRequests()
                .antMatchers("/contract/*").permitAll()
                .antMatchers("/decisionApply/*").permitAll()
                .antMatchers("/decisionRecord/*").permitAll()
                .antMatchers("/lending/*").permitAll()
                .antMatchers("/productRule/*").permitAll()
                .antMatchers("/recon/*").permitAll()
                .antMatchers("/repayPlanRecord/*").permitAll().
                anyRequest().authenticated()
                .and().formLogin()
                .and().httpBasic();
    }
}