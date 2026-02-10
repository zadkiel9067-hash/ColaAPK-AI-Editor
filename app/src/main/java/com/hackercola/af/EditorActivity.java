package com.hackercola.af;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EditorActivity extends Activity {
    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);

        TextView tv = new TextView(this);
        tv.setText("Cola APK AI Editor\nAI Connected ✔");
        tv.setTextSize(18);
        setContentView(tv);
    }
}
