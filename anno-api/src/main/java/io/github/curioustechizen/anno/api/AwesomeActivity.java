package io.github.curioustechizen.anno.api;

import android.app.Activity;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface AwesomeActivity {
    //Class<?> base();
    /*
     * Un-comment the following line to see the problem
     */
    Class<? extends Activity> baseActivity();
}
