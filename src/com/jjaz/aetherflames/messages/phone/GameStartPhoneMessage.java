package com.jjaz.aetherflames.messages.phone;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.anddev.andengine.extension.multiplayer.protocol.adt.message.client.ClientMessage;

import com.jjaz.aetherflames.AetherFlamesConstants;

public class GameStartPhoneMessage extends ClientMessage implements AetherFlamesConstants {

	//public boolean mStart;
	
	
	/**
	 * C'tor
	 */
	public GameStartPhoneMessage() {
		// intentionally empty
	}
	
	/**
	 * C'tor
	 * 
	 * @param start True to start game.
	 */
	public GameStartPhoneMessage(final boolean start) {
		//this.mStart = start;
	}
	
	/**
	 * Setter.
	 * 
	 * @param start True to start game.
	 */	
	public void setNewBullet(final boolean start) {
		//this.mStart = start;	
	}
	
	@Override
	public short getFlag() {
		return FLAG_MESSAGE_PHONE_GAME_START;
	}

	@Override
	protected void onReadTransmissionData(DataInputStream pDataInputStream) throws IOException {
		//this.mStart = pDataInputStream.readBoolean();
	}

	@Override
	protected void onWriteTransmissionData(final DataOutputStream pDataOutputStream) throws IOException {
		//pDataOutputStream.writeBoolean(this.mStart);
	}
	
}
