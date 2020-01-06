package io.jmlim.springboot.pebbletemplate.config.pebble.extension;

import com.mitchellbosecke.pebble.extension.Function;
import com.mitchellbosecke.pebble.template.EvaluationContext;
import com.mitchellbosecke.pebble.template.PebbleTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FibonnaciStringFunction implements Function {

    @Override
    public List<String> getArgumentNames() {
        List<String> names = new ArrayList<>();
        names.add("length");
        return names;
    }

    @Override
    public Object execute(Map<String, Object> args, PebbleTemplate self, EvaluationContext context, int lineNumber) {
        Integer length = Integer.parseInt(Objects.toString(args.get("length")));
        Integer prev1 = 0;
        Integer prev2 = 1;

        StringBuilder result = new StringBuilder();

        result.append("0 1");
        result.append(" ");

        for (int i = 2; i < length; i++) {
            Integer next = prev1 + prev2;
            result.append(next);
            result.append(" ");
            prev1 = prev2;
            prev2 = next;
        }
        return result.toString();
    }
}