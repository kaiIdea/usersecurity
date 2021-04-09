//package com.example.user.config;
//
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @Auther: GEEX1428
// * @Date: 2021/3/27 15:07
// * @Description:
// */
//@EnableOAuth2Sso
//@Profile({"product", "beta"})
//@Configuration
//public class SSOConfig extends WebSecurityConfigurerAdapter {
//
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring().antMatchers("/ajax/**");
//        web.ignoring().antMatchers("/css/**");
//        web.ignoring().antMatchers("/file/**");
//        web.ignoring().antMatchers("/fonts/**");
//        web.ignoring().antMatchers("/i18n/**");
//        web.ignoring().antMatchers("/img/**");
//        web.ignoring().antMatchers("/js/**");
//        web.ignoring().antMatchers("/ruoyi/**");
//        web.ignoring().antMatchers("/repayPlanRecord/**");
//        web.ignoring().antMatchers("/record/**");
//        web.ignoring().antMatchers("/contract/**");
//        web.ignoring().antMatchers("/check/**");
//        web.ignoring().antMatchers("/recon/**");
//        web.ignoring().antMatchers("/judge/**");
//        web.ignoring().antMatchers("/loanRule/**");
//        web.ignoring().antMatchers("/system/**");
//        web.ignoring().antMatchers("/productRule/**");
//        web.ignoring().antMatchers("/decisionRecord/**");
//        web.ignoring().antMatchers("/decisionApply/**");
//        web.ignoring().antMatchers("/cache/**");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf()
//                //.ignoringAntMatchers("/loanRule/**")
//                .and().authorizeRequests()
//                .antMatchers("/k3/*").permitAll().
//                anyRequest().authenticated()
//                .and().formLogin()
//                .and().httpBasic();
//    }
//
//}
