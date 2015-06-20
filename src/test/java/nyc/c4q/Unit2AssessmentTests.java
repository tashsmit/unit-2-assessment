package nyc.c4q;

import android.app.Activity;
import android.widget.TextView;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.equalTo;

import static org.assertj.android.api.Assertions.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml", emulateSdk = 18)
public class Unit2AssessmentTests {

    @Test
    public void testSomething() throws Exception {
        Activity a = Robolectric.buildActivity(Unit2AssessmentActivity.class).create().get();
        TextView tv = (TextView) a.findViewById(R.id.text);
        assertTrue(a != null);
        assertThat(tv).isNotVisible();
//        assertThat(5, equalTo(3));
//        assertThat(view).isGone();
    }
}
