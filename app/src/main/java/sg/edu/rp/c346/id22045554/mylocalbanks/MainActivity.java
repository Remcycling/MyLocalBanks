package sg.edu.rp.c346.id22045554.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvDbs;
    TextView tvOcbc;
    TextView tvDob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDbs = findViewById(R.id.dbsTextview);
        tvOcbc = findViewById(R.id.ocbcTextview);
    }
}