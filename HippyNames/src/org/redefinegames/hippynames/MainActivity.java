package org.redefinegames.hippynames;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.sql.*;
import java.util.*;

public class MainActivity extends Activity
{
	
	public String firstName;
	public int birthMonth;
	public boolean male;
	public String resultName;
	public char firstLetter;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	public void launchHippyNames(View view)
	{
		setContentView(R.layout.hippy_names);
	}
	
	public void submitInfo(View view)
	{
		EditText firstNameField = (EditText)findViewById(R.id.hippynamesEditText1);
		DatePicker birthDatePicker = (DatePicker)findViewById(R.id.hippynamesDatePicker1);
		RadioButton maleRadioButton = (RadioButton)findViewById(R.id.hippynamesRadioButton1);
		
		firstName = firstNameField.getText().toString();
		birthMonth = birthDatePicker.getMonth() + 1;
		male = maleRadioButton.isChecked();
		firstLetter = firstName.toUpperCase().charAt(0);
		
		setContentView(R.layout.result_display);
		generateName();
		
	}
	
	public void backToMain(View view)
	{
		setContentView(R.layout.main);
	}
	
	public void generateName()
	{
		String[] partOne = {"default1", "default2", "default3"};
		String[] partTwo = {"default1", "default2", "default3"};
		
		TextView result = (TextView)findViewById(R.id.resultdisplayTextView1);
		
		if(male)
		{
			switch(birthMonth)
			{
				case 1:
					partOne[0] = "Leo";
					partOne[1] = "Nash";
					partOne[2] = "Orion";
					break;
				case 2:
					partOne[0] = "Pheonix";
					partOne[1] = "Sirius";
					partOne[2] = "Gamma";
					break;
				case 3:
					partOne[0] = "Lota";
					partOne[1] = "Zeta";
					partOne[2] = "Omicron";
					break;
				case 4:
					partOne[0] = "Lota";
					partOne[1] = "Zeta";
					partOne[2] = "Omicron";
					break;
				case 5:
					partOne[0] = "Omega";
					partOne[1] = "Sigma";
					partOne[2] = "Lota";
					break;
				case 6:
					partOne[0] = "Omega";
					partOne[1] = "Sigma";
					partOne[2] = "Lota";
					break;
				case 7:
					partOne[0] = "Sigma";
					partOne[1] = "Epsilon";
					partOne[2] = "Gamma";
					break;
				case 8:
					partOne[0] = "Sigma";
					partOne[1] = "Epsilon";
					partOne[2] = "Gamma";
					break;
				case 9:
					partOne[0] = "Zeta";
					partOne[1] = "Omicron";
					partOne[2] = "Epsilon";
					break;
				case 10:
					partOne[0] = "Zeta";
					partOne[1] = "Omicron";
					partOne[2] = "Epsilon";
					break;
				case 11:
					partOne[0] = "Lambda";
					partOne[1] = "Omega";
					partOne[2] = "Lota";
					break;
				case 12:
					partOne[0] = "Lambda";
					partOne[1] = "Omega";
					partOne[2] = "Lota";
					break;
			}
			switch(firstLetter)
			{
				case 65:
					partTwo[0] = "Fire";
					partTwo[1] = "Wind";
					partTwo[2] = "Water";
				    break;
				case 66:
					partTwo[0] = "Fire";
					partTwo[1] = "Wind";
					partTwo[2] = "Water";
					break;
				case 67:
					partTwo[0] = "Moon";
					partTwo[1] = "Sun";
					partTwo[2] = "Star";
					break;
				case 68:
					partTwo[0] = "Moon";
					partTwo[1] = "Sun";
					partTwo[2] = "Star";
					break;
				case 69:
					partTwo[0] = "Lake";
					partTwo[1] = "Eclipse";
					partTwo[2] = "Earth";
					break;
				case 70:
					partTwo[0] = "Free";
					partTwo[1] = "Flow";
					partTwo[2] = "Flight";
					break;
				case 71:
					partTwo[0] = "Eagle";
					partTwo[1] = "Rock";
					partTwo[2] = "Bear";
					break;
				case 72:
					partTwo[0] = "Moonbeam";
					partTwo[1] = "Cedar";
					partTwo[2] = "River";
					break;
				case 73:
					partTwo[0] = "Flame";
					partTwo[1] = "Harbor";
					partTwo[2] = "Thunder";
					break;
				case 74:
					partTwo[0] = "Oak";
					partTwo[1] = "Shade";
					partTwo[2] = "Mountain";
					break;
				case 75:
					partTwo[0] = "Free";
					partTwo[1] = "Flow";
					partTwo[2] = "Flight";
					break;
				case 76:
					partTwo[0] = "Eagle";
					partTwo[1] = "Rock";
					partTwo[2] = "Bear";
					break;
				case 77:
					partTwo[0] = "Lake";
					partTwo[1] = "Eclipse";
					partTwo[2] = "Earth";
					break;
				case 78:
					partTwo[0] = "Justice";
					partTwo[1] = "Shine";
					partTwo[2] = "Thankful";
					break;
				case 79:
					partTwo[0] = "Warrior";
					partTwo[1] = "Honor";
					partTwo[2] = "Brave";
					break;
				case 80:
					partTwo[0] = "Peace";
					partTwo[1] = "Promise";
					partTwo[2] = "Prosperity";
					break;
				case 81:
					partTwo[0] = "Moonbeam";
					partTwo[1] = "Cedar";
					partTwo[2] = "River";
					break;
				case 82:
					partTwo[0] = "Rain";
					partTwo[1] = "River";
					partTwo[2] = "Revolation";
					break;
				case 83:
					partTwo[0] = "Saphire";
					partTwo[1] = "Serenity";
					partTwo[2] = "Soul";
					break;
				case 84:
					partTwo[0] = "Flame";
					partTwo[1] = "Harbor";
					partTwo[2] = "Thunder";
					break;
				case 85:
					partTwo[0] = "Flame";
					partTwo[1] = "Harbor";
					partTwo[2] = "Thunder";
					break;
				case 86:
					partTwo[0] = "Oak";
					partTwo[1] = "Shade";
					partTwo[2] = "Mountain";
					break;
				case 87:
					partTwo[0] = "Willow";
					partTwo[1] = "Wind";
					partTwo[2] = "Water";
					break;
				case 88:
					partTwo[0] = "Starlight";
					partTwo[1] = "Stone";
					partTwo[2] = "Storm";
					break;
				case 89:
					partTwo[0] = "Spirit";
					partTwo[1] = "Sunshine";
					partTwo[2] = "Starshine";
					break;
				case 90:
					partTwo[0] = "Oak";
					partTwo[1] = "Shade";
					partTwo[2] = "Mountain";
					break;
			}
		}else
		{
			switch(birthMonth)
			{
				case 1:
					partOne[0] = "Daffodil";
					partOne[1] = "Daisy";
					partOne[2] = "Delphine";
					break;
				case 2:
					partOne[0] = "Clover";
					partOne[1] = "Calla";
					partOne[2] = "Camellia";
					break;
				case 3:
					partOne[0] = "Flora";
					partOne[1] = "Ivy";
					partOne[2] = "Jasmine";
					break;
				case 4:
					partOne[0] = "Flora";
					partOne[1] = "Ivy";
					partOne[2] = "Jasmine";
					break;
				case 5:
					partOne[0] = "Lily";
					partOne[1] = "Lotus";
					partOne[2] = "Iris";
					break;
				case 6:
					partOne[0] = "Lily";
					partOne[1] = "Lotus";
					partOne[2] = "Iris";
					break;
				case 7:
					partOne[0] = "Petunia";
					partOne[1] = "Tulip";
					partOne[2] = "Rose";
					break;
				case 8:
					partOne[0] = "Petunia";
					partOne[1] = "Tulip";
					partOne[2] = "Rose";
					break;
				case 9:
					partOne[0] = "Ameryllis";
					partOne[1] = "Lilac";
					partOne[2] = "Magnolia";
					break;
				case 10:
					partOne[0] = "Ameryllis";
					partOne[1] = "Lilac";
					partOne[2] = "Magnolia";
					break;
				case 11:
					partOne[0] = "Marigold";
					partOne[1] = "Petal";
					partOne[2] = "Poppy";
					break;
				case 12:
					partOne[0] = "Marigold";
					partOne[1] = "Petal";
					partOne[2] = "Poppy";
					break;
			}
			switch(firstLetter)
			{
				case 65:
					partTwo[0] = "Ariel";
					partTwo[1] = "Arora";
					partTwo[2] = "Andromeda";
				    break;
				case 66:
					partTwo[0] = "Breeze";
					partTwo[1] = "Blossom";
					partTwo[2] = "Basil";
					break;
				case 67:
					partTwo[0] = "Carmel";
					partTwo[1] = "Charity";
					partTwo[2] = "Crystal";
					break;
				case 68:
					partTwo[0] = "Daisy";
					partTwo[1] = "Dawn";
					partTwo[2] = "Dancer";
					break;
				case 69:
					partTwo[0] = "Ember";
					partTwo[1] = "Eclipse";
					partTwo[2] = "Earth";
					break;
				case 70:
					partTwo[0] = "Free";
					partTwo[1] = "Flow";
					partTwo[2] = "Flight";
					break;
				case 71:
					partTwo[0] = "Garcia";
					partTwo[1] = "Gorgia";
					partTwo[2] = "Grace";
					break;
				case 72:
					partTwo[0] = "Harmony";
					partTwo[1] = "Heart";
					partTwo[2] = "Hope";
					break;
				case 73:
					partTwo[0] = "Indica";
					partTwo[1] = "Iris";
					partTwo[2] = "Iris";
					break;
				case 74:
					partTwo[0] = "jewel";
					partTwo[1] = "journey";
					partTwo[2] = "joy";
					break;
				case 75:
					partTwo[0] = "Kami";
					partTwo[1] = "Karma";
					partTwo[2] = "Kassia";
					break;
				case 76:
					partTwo[0] = "Light";
					partTwo[1] = "Lolita";
					partTwo[2] = "Love";
					break;
				case 77:
					partTwo[0] = "May";
					partTwo[1] = "Mist";
					partTwo[2] = "Melody";
					break;
				case 78:
					partTwo[0] = "nebula";
					partTwo[1] = "natura";
					partTwo[2] = "nebula";
					break;
				case 79:
					partTwo[0] = "Ocean";
					partTwo[1] = "Opal";
					partTwo[2] = "Orian";
					break;
				case 80:
					partTwo[0] = "Peace";
					partTwo[1] = "Promise";
					partTwo[2] = "Prosperity";
					break;
				case 81:
					partTwo[0] = "Quinn";
					partTwo[1] = "Quinn";
					partTwo[2] = "Quinn";
					break;
				case 82:
					partTwo[0] = "Rain";
					partTwo[1] = "River";
					partTwo[2] = "Revolation";
					break;
				case 83:
					partTwo[0] = "Saphire";
					partTwo[1] = "Serenity";
					partTwo[2] = "Soul";
					break;
				case 84:
					partTwo[0] = "Terra";
					partTwo[1] = "Trinity";
					partTwo[2] = "Tranquilla";
					break;
				case 85:
					partTwo[0] = "Understanding";
					partTwo[1] = "Understanding";
					partTwo[2] = "Understanding";
					break;
				case 86:
					partTwo[0] = "Violet";
					partTwo[1] = "Vishnu";
					partTwo[2] = "Violet";
					break;
				case 87:
					partTwo[0] = "Willow";
					partTwo[1] = "Wind";
					partTwo[2] = "Water";
					break;
				case 88:
					partTwo[0] = "Starlight";
					partTwo[1] = "Stone";
					partTwo[2] = "Storm";
					break;
				case 89:
					partTwo[0] = "Spirit";
					partTwo[1] = "Sunshine";
					partTwo[2] = "Starshine";
					break;
				case 90:
					partTwo[0] = "Zennia";
					partTwo[1] = "Zeyla";
					partTwo[2] = "Zoey";
					break;
			}
		}
		
		Random r1 = new Random();
		Random r2 = new Random();
		
		resultName = partOne[r2.nextInt(partOne.length)] + " " + partTwo[r1.nextInt(partTwo.length)];
		result.setText(resultName);
	}
	
}
