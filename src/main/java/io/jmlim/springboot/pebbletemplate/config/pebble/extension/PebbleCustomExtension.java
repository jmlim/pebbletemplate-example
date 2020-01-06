package io.jmlim.springboot.pebbletemplate.config.pebble.extension;

import com.mitchellbosecke.pebble.extension.AbstractExtension;
import com.mitchellbosecke.pebble.extension.Function;

import java.util.HashMap;
import java.util.Map;

public class PebbleCustomExtension extends AbstractExtension {
    @Override
    public Map<String, Function> getFunctions() {
        Map<String, Function> functions = new HashMap<>();
        functions.put("fibonacci", new FibonnaciStringFunction());
        return functions;
    }
}