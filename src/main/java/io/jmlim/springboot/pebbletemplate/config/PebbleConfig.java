package io.jmlim.springboot.pebbletemplate.config;

import com.mitchellbosecke.pebble.extension.Extension;
import io.jmlim.springboot.pebbletemplate.config.pebble.extension.PebbleCustomExtension;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PebbleConfig {
    @Bean
    public Extension pebbleCustomExtension() {
        return new PebbleCustomExtension();
    }
}
