package com.shahi.contactintentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addContact(View view) {
        Intent intent = new Intent(ContactsContract.Intents.Insert.ACTION);
        intent.setType(ContactsContract.RawContacts.CONTENT_TYPE);

        intent.putExtra(ContactsContract.Intents.Insert.NAME, "Shahi");
        intent.putExtra(ContactsContract.Intents.Insert.PHONE, "01746799842");
        intent.putExtra(ContactsContract.Intents.Insert.EMAIL, "s.m.kamalhussain@gmail.com");

        startActivity(intent);
    }
}