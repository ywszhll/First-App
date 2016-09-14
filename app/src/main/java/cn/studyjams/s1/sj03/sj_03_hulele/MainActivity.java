package cn.studyjams.s1.sj03.sj_03_hulele;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_writer , button_work,button_quotation,button_evaluate,button_enlightenment ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_writer=(Button)findViewById(R.id.writer);
        button_writer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(MainActivity.this , WriterActivity.class);
                startActivity(inte);
            }
        });

        button_work=(Button)findViewById(R.id.work);
        button_work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(MainActivity.this , WorkActivity.class);
                startActivity(inte);
            }
        });

        button_quotation=(Button)findViewById(R.id.quotation);
        button_quotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(MainActivity.this , QuotationActivity.class);
                startActivity(inte);
            }
        });

        button_evaluate=(Button)findViewById(R.id.evaluate);
        button_evaluate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(MainActivity.this , EvaluateActivity.class);
                startActivity(inte);
            }
        });

        button_enlightenment=(Button)findViewById(R.id.enlightenment);
        button_enlightenment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte = new Intent(MainActivity.this , EnlightenmentActivity.class);
                startActivity(inte);
            }
        });

    }
}
