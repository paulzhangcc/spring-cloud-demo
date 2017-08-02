package com.paulzhangcc.print;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by paul on 2017/8/1.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import(PrintConfiguration.class)
public @interface EnablePrint {
}
