package mobileapps.com.compund;


import android.app.Activity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends Activity {
    private SeekBar volumeControl = null;
    private SmilingProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        volumeControl = (SeekBar) findViewById(R.id.seekBar1);
        progressbar = (SmilingProgressBar) findViewById(R.id.myCompoundView);

        volumeControl.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            int progressChanged = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser){
                progressChanged = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this,"seek bar progress:"+progressChanged, Toast.LENGTH_SHORT).show();
                progressbar.setProgress(progressChanged);
            }
        });
    }
}
