package com.arun.main;

import com.arun.Items.Garage;
import com.arun.Items.Light;
import com.arun.command.Command;
import com.arun.command.GarageCommand;
import com.arun.command.LightCommand;

public class RemoteTest {
	public static void main(String[] args) {
		
		Command light = new LightCommand(new Light());
		light.execute();
		
		Command garage = new GarageCommand(new Garage(new Light()));
		garage.execute();
	}

}
