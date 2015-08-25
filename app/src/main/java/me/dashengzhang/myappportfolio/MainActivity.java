package me.dashengzhang.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // This method checks which button has been pressed (invoking the onclick event) and then acts accordingly;
    public void open(View view) {
        switch(view.getId())
        {
            case R.id.streamer:
                // If the Spotify Streamer button is pressed, display a toast message;
                Toast.makeText(this, "This button will launch my Spotify Streamer App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores:
                Toast.makeText(this, "This button will launch my Scores App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(this, "This button will launch my Library App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bigger:
                Toast.makeText(this, "This button will launch my Build It Bigger App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyz:
                Toast.makeText(this, "This button will launch my XYZ Reader App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(this, "This button will launch my Capstone App", Toast.LENGTH_SHORT).show();
                break;
            default:
                // In case of running into runtime errors;
                throw new RuntimeException("Unknown button ID");
        }
    }
}
