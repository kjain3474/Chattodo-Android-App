package com.chattodo.chattododesign;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MessagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connections_screen);
        TextView title =  findViewById(R.id.connectionTitle);
        TextView handle =  findViewById(R.id.userHandle);
        TextView message =  findViewById(R.id.connectionMessage);
        TextView time =  findViewById(R.id.timeText);
        TextView header = findViewById(R.id.connectionsScreenHeader);
        EditText typingText =  findViewById(R.id.typingText) ;

        Typeface font1 = Typeface.createFromAsset(this.getAssets(),"fonts/Roboto-Medium.ttf");
        title .setTypeface(font1);
        header.setTypeface(font1);
        typingText.setTypeface(font1);

        Typeface font2 = Typeface.createFromAsset(this.getAssets(),"fonts/Roboto-Light.ttf");
        handle .setTypeface(font2);
        time.setTypeface(font2);

        Typeface font3 = Typeface.createFromAsset(this.getAssets(),"fonts/Roboto-Regular.ttf");
        message .setTypeface(font3);

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chatActivityIntent = new Intent(MessagesActivity.this, ChatActivity.class);
                startActivity(chatActivityIntent);
            }
        });



    }
}
