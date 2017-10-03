package vladislavpereskokov.technopark_android_rk1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalcActivity extends AppCompatActivity {
    public static final String ACTION_SQUARE = "*";
    public static final String ACTION_FACTORIAL = "!";

    private EditText operand1;
    private EditText operand2;
    private TextView result;

    private final View.OnClickListener squareClick = new View.OnClickListener() {
        @Override
        public void onClick(final View view) {
            double op1 = Double.parseDouble(operand1.getText().toString());
            double op2 = Double.parseDouble(operand2.getText().toString());

            result.setText(String.valueOf(square(op1, op2)));
        }
    };

    private final View.OnClickListener factClick = new View.OnClickListener() {
        @Override
        public void onClick(final View view) {
            int op1 = Integer.parseInt(operand1.getText().toString());

            result.setText(String.valueOf(fact(op1)));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String action = getIntent().getAction();
        switch (action) {
            case ACTION_SQUARE:
                setContentView(R.layout.square);

                findViewById(R.id.btn_add).setOnClickListener(squareClick);
                break;
            case ACTION_FACTORIAL:
                setContentView(R.layout.factorial);

                findViewById(R.id.btn_add).setOnClickListener(factClick);
                break;
            default:
                break;
        }

        operand1 = (EditText) findViewById(R.id.operand1);
        operand2 = (EditText) findViewById(R.id.operand2);

        result = (TextView) findViewById(R.id.result);
    }

    private double square(double op1, double op2) {
        return op1 * op2;
    }

    private double fact(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * fact(n - 1);
    }
}
