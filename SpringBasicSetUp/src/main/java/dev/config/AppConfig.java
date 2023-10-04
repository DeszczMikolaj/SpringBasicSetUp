package dev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("dev")
public class AppConfig implements WebMvcConfigurer {

//    @Bean("wizardService")
//    public WizardService getWizardService() {
//        return new WizardService(getWizardRepository());
//    }
//
//    @Bean("wizardRepository")
//    public WizardRepository getWizardRepository() {
//        return new WizardRepository();
//    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver vr = new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/");
        vr.setSuffix(".jsp");
        return vr;
    }

}
