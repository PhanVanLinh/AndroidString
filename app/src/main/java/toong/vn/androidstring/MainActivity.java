package toong.vn.androidstring;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = getClass().getSimpleName();
    private String sampleString = "This is a String";
    private String sampleWithSpaceAtFirst = "     This is a String";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        removeFirstString();
    }

    /**
     * Return
     * _______This is a String ( _ <=> white space)
     * This is a String
     */
    private void removeFirstString() {
        Log.i(TAG, sampleWithSpaceAtFirst);
        sampleWithSpaceAtFirst = sampleWithSpaceAtFirst.replaceFirst("^ *", "");
        Log.i(TAG, sampleWithSpaceAtFirst);
    }
}
