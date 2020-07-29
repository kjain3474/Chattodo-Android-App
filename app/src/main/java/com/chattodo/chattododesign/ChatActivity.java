package com.chattodo.chattododesign;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_activity);
        TextView messageR = findViewById(R.id.chatMessageRecieved);
        TextView timeR =  findViewById(R.id.chatMessageTimeRecieved);
        TextView messageS =  findViewById(R.id.chatMessageSent);
        TextView timeS =  findViewById(R.id.chatMessageTimeSent);
        EditText typingText =  findViewById(R.id.typingText) ;
        TextView headingText = findViewById(R.id.chatHeaderTitle);


        Typeface font1 = Typeface.createFromAsset(this.getAssets(),"fonts/Roboto-Regular.ttf");
        messageR.setTypeface(font1);
        messageS.setTypeface(font1);

        Typeface font2 = Typeface.createFromAsset(this.getAssets(),"fonts/Roboto-Medium.ttf");
        timeR.setTypeface(font2);
        timeS.setTypeface(font2);
        typingText.setTypeface(font2);

        Typeface font3 = Typeface.createFromAsset(this.getAssets(),"fonts/Roboto-Bold.ttf");
        headingText.setTypeface(font3);

    }
}
