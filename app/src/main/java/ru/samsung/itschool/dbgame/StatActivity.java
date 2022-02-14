package ru.samsung.itschool.dbgame;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class StatActivity extends Activity {
    private DBManager dbManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stat);
        TextView restv = (TextView)this.findViewById(R.id.gameCounted);
        dbManager = DBManager.getInstance(this);
        restv.setText(dbManager.gamesCount()+"");
    }
}
