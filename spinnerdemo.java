import androix.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.ArrayAdapter; 
import android.widget.AdapterView; 
import android.content.Intent; 
import android.view.View; 



public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener { 
  Spinner mySpinner; 
  String myArray[] = {"Android","IOs","React-Native}; 
  
  { 
    mySpinner = findViewById(R.id.spinner_1); 
    mySpinner.setOnItemSelectedListener(this);
    ArrayAdapter myItems = new ArrayAdapter(this,android.R.layout.simple_spinner_item,myArray); 
    myItems.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); 
    mySpinner.setAdapter(myItems);
  }
                     }
    
   
