package com.pedab.recyclerviewtest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    private LinearLayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        List<String> items = new ArrayList<String>();
        items.add("George");
        items.add("Gym");
        items.add("Give");
        items.add("Got");
        items.add("Gut");
        items.add("Git");
        items.add("Gone");
        items.add("Jack");
        items.add("Jim");
        items.add("Jack");
        items.add("Jacylin");
        items.add("Joseph");
        items.add("Jyriphet");
        items.add("Java");
        items.add("Josh");
        items.add("Johnny");

        recyclerView.setAdapter(new ListAdapterHolder(this, items));

        Button btnToggle = (Button) findViewById(R.id.btnToggle);
        btnToggle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.btnToggle:

                onToggle((TextView) v);
                break;
        }
    }

    private void onToggle(TextView txtToggle) {

        String currentText = txtToggle.getText().toString();
        if (currentText.equalsIgnoreCase("horizontal")) {
            txtToggle.setText("vertical");
            mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        } else if (currentText.equalsIgnoreCase("vertical")) {
            txtToggle.setText("horizontal");
            mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        }
    }
}
