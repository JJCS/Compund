package mobileapps.com.compund;


import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

public class SmilingProgressBar extends LinearLayout {
    private final ImageView smileView;
    private final ProgressBar progressBar;
    private int progress = 0;
    public SmilingProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.smiling_progressbar, this);
        smileView = (ImageView) findViewById(R.id.smile);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        update();
    }
    public void setProgress(int progress) {
        this.progress = progress;
        update();
    }
    private void update() {
        progressBar.setProgress(progress);
        updateSmile();
    }
    private void updateSmile() {
        if (progress < 25) {
            smileView.setImageResource(R.drawable.smile_waiting_48);
        } else if (progress < 50) {
            smileView.setImageResource(R.drawable.smile_48);
        } else if (progress < 75) {
            smileView.setImageResource(R.drawable.smile_lol_48);
        } else {
            smileView.setImageResource(R.drawable.smile_in_love_48);
        }
    }
}


