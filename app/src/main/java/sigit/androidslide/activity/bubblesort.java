package sigit.androidslide.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Spannable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import sigit.androidslide.R;

/**
 * Created by sigit on 10/07/17.
 */

public class bubblesort extends AppCompatActivity {

    TextView Result;
    EditText Input;
    Button Btn;

    int i, j, temp, num[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bubblesort);

        Btn = (Button) findViewById(R.id.button);
        Input = (EditText) findViewById(R.id.editText);
        Result = (TextView) findViewById(R.id.textView);

        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BubbleSort();
            }
        });
    }

    public void BubbleSort() {
        Spannable spn = Input.getText();

        num = new int[spn.length()];
        int count = 0;
        for (int i = 0; i < spn.length(); i++){
            if((spn.charAt(i)+"").matches(".*\\d.*")){

                num[i] = Integer.parseInt(""+spn.charAt(i));
                count++;
            }
        }

        for (i = 0; i < count; i++) {
            for (j = i + 1; j < count; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        String result = "";
        for (int i = 0; i < num.length; i++){
            result += num[i] + " ";
        }
        Result.setText(result);

    }
}
