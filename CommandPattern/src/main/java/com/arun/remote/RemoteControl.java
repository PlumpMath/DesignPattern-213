package com.arun.remote;

import com.arun.command.Command;

public class RemoteControl {
	private Command slot;

	public RemoteControl(Command slot) {
		this.slot = slot;
	}
	
	public void buttonWasPressed(){
		slot.execute();
	}
}
