package vladislavpereskokov.technopark_android_rk1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalcActivity extends AppCompatActivity {
    public static final String ACTION_SQUARE = "*";
    public static final String ACTION_FACTORIAL = "!";

    private EditText operand1;
    private EditText operand2;

//    private final View.OnClickListener squareClick = new View.OnClickListener() {
//        @Override
//        public void onClick(final View view) {
//            double op1 = Double.parseDouble(operand1.getText().toString());
//            double op2 = Double.parseDouble(operand2.getText().toString());
//            String action = CalcActivity.ACTION_SQUARE;
//
//            final Intent intent = new Intent(CalcInputActivity.this, CalcActivity.class);
//            intent.putExtra(CalcActivity.EXTRA_OPERAND1, op1);
//            intent.putExtra(CalcActivity.EXTRA_OPERAND2, op2);
//            intent.setAction(action);
//            startActivityForResult(intent, REQUEST_CODE);
//        }
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String action = getIntent().getAction();
        switch (action) {
            case ACTION_SQUARE:
                setContentView(R.layout.square);
                break;
            case ACTION_FACTORIAL:
                setContentView(R.layout.factorial);
                break;
            default:
                break;
        }

        operand1 = (EditText) findViewById(R.id.operand1);
        operand2 = (EditText) findViewById(R.id.operand2);
    }
}
