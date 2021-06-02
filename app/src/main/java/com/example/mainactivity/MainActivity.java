package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    User x;
    @Override
    protected void onCreate(Bundle saveInstancesState) {
        super.onCreate(saveInstancesState);
        setContentView(R.layout.activity_main);
        Log.d("Debug","create");

        x = new User();
        x.name = "MAD";
        x.description = "test";
        x.id = 1;
        x.followed = false;

        TextView name = findViewById(R.id.txtName);
        name.setText(x.name);
        TextView description = findViewById(R.id.txtDescription);
        description.setText(x.description);
        setFollowBtn();
    }

    private void setFollowBtn() {
        Button b = findViewById(R.id.btnFollow);
        if (x.followed) {
            b.setText("Unfollowed");
        }
        else {
            b.setText("Followed");
        }
    }

    public void onFollowClick(View v) {
        x.followed =! x.followed;
        setFollowBtn();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Debug","Start");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Debug", "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Debug", "Destroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Debug","Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Debug","Resume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Debug","Restart");
    }
}
