package com.test.test2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


public class EditParty extends AppCompatActivity {
    private String Party_Name;
    private String Location;
    private String Alcohol;
    protected EditText Party_NameET;
    protected EditText LocationET;
    private static final String PARTY_NAME="PARTY_NAME";
    private static final String LOCATION="LOCATION";
    private static final String ALCOHOL="ALCOHOL";

private TextWatcher NameBeforeListener= new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
     try {
        Party_Name=s.toString();
     }
     catch (StringIndexOutOfBoundsException e){


     }

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_party);
       if(savedInstanceState==null) {
    party_edit_input();
       }
        else {
           party_default_input();
       }



    }
    protected void PartySpinner(){
    Spinner Alcohol_spinner= (Spinner) findViewById(R.id.alcohol_list);
    ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.Alcohol,
            android.R.layout.simple_spinner_item);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    Alcohol_spinner.setAdapter(adapter);
}



    protected void party_edit_input(){
        PartySpinner();
        Party_Name="Its a party!!";
        Location="659 sentinel road";
        Party_NameET=(EditText) findViewById(R.id.PartyNameET);
        LocationET=(EditText) findViewById(R.id.LocationEdit);
        Party_NameET.addTextChangedListener(NameBeforeListener);
    }





    protected void party_default_input(){

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edit_party, menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
