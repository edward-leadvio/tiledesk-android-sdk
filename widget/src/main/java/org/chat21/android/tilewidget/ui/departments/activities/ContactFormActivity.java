package org.chat21.android.tilewidget.ui.departments.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import org.chat21.android.tilewidget.R;
import org.chat21.android.tilewidget.ui.departments.fragments.ContactFormFragment;

/**
 * Created by stefanodp91 on 07/05/18.
 */

public class ContactFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_form);

        // toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);


        // container
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, new ContactFormFragment())
                .commit();
    }
}