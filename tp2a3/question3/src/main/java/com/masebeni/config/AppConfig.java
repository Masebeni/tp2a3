package com.masebeni.config;

import com.masebeni.services.Animalss;
import org.springframework.context.annotation.Bean;

/**
 * Created by Isiphile on 2016/03/13.
 */
public class AppConfig {
    @Bean(name="Dogs")
    public Animalss getGenetic(){
        return new Animalss() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }
        };
    }

}
