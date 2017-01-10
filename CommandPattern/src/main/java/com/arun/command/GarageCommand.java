package com.arun.command;

import com.arun.Items.Garage;

public class GarageCommand implements Command {
	private Garage garage;

	public GarageCommand(Garage garage) {
		this.garage = garage;
	}

	public void execute() {
		garage.allCommands();
	}
}
