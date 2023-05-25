package sg.edu.rp.c346.id22045554.mylocalbanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvDbs;
    TextView tvOcbc;
    TextView tvUob;
    String wordClicked = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvDbs = findViewById(R.id.dbsTextview);
        tvOcbc = findViewById(R.id.ocbcTextview);
        tvUob = findViewById(R.id.uobTextview);
        registerForContextMenu(tvDbs);
        registerForContextMenu(tvOcbc);
        registerForContextMenu(tvUob);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        menu.add(2,0,0,"Website");
        menu.add(2,1,1,"Contact");

        if(v == tvDbs){
            wordClicked = "DBS";
        } else if(v == tvOcbc) {
            wordClicked = "OCBC";
        } else if(v == tvUob) {
            wordClicked = "UOB";
        }

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getGroupId()== 2) {
            if(wordClicked == "DBS"){
                if(item.getItemId()== 0){
                    Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("https://www.dbs.com.sg"));
                    startActivity(intent);

                } else if(item.getItemId()== 1){
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:18001111111"));
                    startActivity(intent);
                }
            }else if(wordClicked == "OCBC"){
                if(item.getItemId()== 0){
                    Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("https://www.ocbc.com"));
                    startActivity(intent);
                } else if(item.getItemId()== 1){
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:18003633333"));
                    startActivity(intent);
                }

            }else if(wordClicked == "UOB"){
                if(item.getItemId()== 0){
                    Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("https://www.uob.com.sg"));
                    startActivity(intent);
                } else if(item.getItemId()== 1){
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:18002222121"));
                    startActivity(intent);
                }

            }

        }

        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.


        if (item.getGroupId()== 1) {
            if (item.getItemId() == R.id.EnglishSelection) {
                tvDbs.setText("DBS");
                tvOcbc.setText("OCBC");
                tvUob.setText("UOB");
                return true;
            } else if (item.getItemId() == R.id.ChineseSelection) {
                tvDbs.setText("星展银行");
                tvOcbc.setText("华侨银行");
                tvUob.setText("大华银行");
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}