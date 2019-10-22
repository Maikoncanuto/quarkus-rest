package com.github.maikoncanuto.core.interceptors;

import com.github.maikoncanuto.core.interceptors.annotations.Log;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.String.format;
import static java.util.logging.Logger.getLogger;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Stream.of;

@Log
@Interceptor
@Priority(1)
public class LogInterceptor {

    @AroundInvoke
    public Object log(final InvocationContext context) throws Exception {
        final Method method = context.getMethod();
        final String parametersString = of(method.getParameters()).map(Parameter::getName).collect(joining());
        final String message = format("\nClass: %s\nMethod: %s\nParameters: %s\n",
                method.getDeclaringClass().getName(),
                method.getName(),
                parametersString);
        getLogger("LOG[*]").info(message);
        return context.proceed();
    }
}
