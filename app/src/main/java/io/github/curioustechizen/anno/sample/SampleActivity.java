package io.github.curioustechizen.anno.sample;

import io.github.curioustechizen.anno.api.AwesomeActivity;

//@AwesomeActivity(base=Class.class)
/*
 * Un-comment the following and comment the line above to see the issue
 */
@AwesomeActivity(baseActivity=android.app.ListActivity.class)
public class SampleActivity {
}
