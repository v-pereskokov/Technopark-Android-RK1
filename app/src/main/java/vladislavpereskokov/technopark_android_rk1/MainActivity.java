package vladislavpereskokov.technopark_android_rk1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.square).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                final Intent intent = new Intent(MainActivity.this, CalcActivity.class);
                intent.setAction(CalcActivity.ACTION_SQUARE);
                startActivity(intent);
            }
        });

        findViewById(R.id.factorial).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                final Intent intent = new Intent(MainActivity.this, CalcActivity.class);
                intent.setAction(CalcActivity.ACTION_FACTORIAL);
                startActivity(intent);
            }
        });

        findViewById(R.id.three_sum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                final Intent intent = new Intent(MainActivity.this, CalcActivity.class);
                intent.setAction(CalcActivity.ACTION_THREE_SUM);
                startActivity(intent);
            }
        });
    }
}
