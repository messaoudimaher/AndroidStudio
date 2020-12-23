package com.example.tp2;

        import android.content.Intent;
        import android.os.Bundle;
        import androidx.appcompat.app.AppCompatActivity;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private TextView mMessageEditText;
    public static final String EXTRA_MESSAGE="com.example.tp2.extra.clé_TP2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        /*Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();*/
        Intent intent = new Intent(this, Main2Activity.class);
        mMessageEditText = (TextView) findViewById(R.id.show_count);
        String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}