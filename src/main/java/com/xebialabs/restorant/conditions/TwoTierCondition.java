package com.xebialabs.restorant.conditions;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by atiwary on 23/01/17.
 */
public class TwoTierCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String dbEnv = context.getEnvironment().getProperty("spring.datasource.jndi-name");
        return dbEnv==null;
    }
}
