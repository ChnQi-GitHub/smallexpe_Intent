package cn.edu.bistu.cs.se.shijian_intent_implicitstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("cn.edu.bistu.cs.se.shijian_intent_implicitstart.ACTION_START");
                startActivity(intent);
            }
        });
        Button button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("cn.edu.bistu.cs.se.shijian_intent_implicitstart.ACTION_START");
                intent.addCategory("cn.edu.bistu.cs.se.shijian_intent_implicitstart.MY_CATEGORY");
                startActivity(intent);
            }
        });
    }
}
