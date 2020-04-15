package com.example.mymail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ContactModel> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contacts = new ArrayList<>();
        contacts.add(new ContactModel("Lana Del Ray",R.drawable.thum));
        contacts.add(new ContactModel("Wang Yibo",R.drawable.thum1));
        contacts.add(new ContactModel("Oh Sehun",R.drawable.thum2));
        contacts.add(new ContactModel("Kim Junmyeon",R.drawable.thum3));
        contacts.add(new ContactModel("Taylor Swift",R.drawable.thum4));
        contacts.add(new ContactModel("Byun Baekhyun",R.drawable.thum5));
        contacts.add(new ContactModel("Park Chanyeol",R.drawable.thum5));
        contacts.add(new ContactModel("Luong Xuan Truong",R.drawable.thum5));
        contacts.add(new ContactModel("Kim Jinu",R.drawable.thum5));
        contacts.add(new ContactModel("Ariana Grande",R.drawable.thum5));
        contacts.add(new ContactModel("Kim Jongun",R.drawable.thum5));
        contacts.add(new ContactModel("Tap Can Binh",R.drawable.thum5));

        ContactAdapter adapter = new ContactAdapter(contacts);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
