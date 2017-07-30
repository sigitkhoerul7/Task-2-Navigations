package sigit.androidslide.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import sigit.androidslide.R;

/**
 * Created by sigit on 11/07/17.
 */

public class bubblecharsort extends AppCompatActivity {

    EditText Result, Result2, Result3, Result4;


    String l[]={"H","C","A","K",};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bublecharsort);

        Result = (EditText) findViewById(R.id.textView);
        Result2 = (EditText) findViewById(R.id.textView2);
        Result3 = (EditText) findViewById(R.id.textView3);
        Result4 = (EditText) findViewById(R.id.textView4);

        BubbleSort(l);


        for(int i=0; i<l.length;i++){

            if (l[i]==l[0]){
                Result.setText(l[0]);
            } else if(l[i]==l[1]){
                Result2.setText(l[1]);
            } else if (l[i]==l[2]){
                Result3.setText(l[2]);
            } else if (l[i]==l[3]){
                Result4.setText(l[3]);
            }
        }
    }

    private static void BubbleSort(String[] array){
        String t;
        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array.length-1-i; j++) {
                if(array[j].compareTo(array[j+1])>0) {
                    t= array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
    }
}