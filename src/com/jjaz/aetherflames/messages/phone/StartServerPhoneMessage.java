package com.jjaz.aetherflames.messages.phone;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.anddev.andengine.extension.multiplayer.protocol.adt.message.client.ClientMessage;

import com.jjaz.aetherflames.AetherFlamesConstants;

public class StartServerPhoneMessage extends ClientMessage implements AetherFlamesConstants {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	public int mMaxNumPlayers;  
	public String mIP; /*CURRENTLY NO WAY TO TRANSMIT*/
	public String mName; /*CURRENTLY NO WAY TO TRANSMIT*/
	
	// ===========================================================
	// Constructors
	// ===========================================================

	public StartServerPhoneMessage() {
		// intentionally empty
	}
	
	public StartServerPhoneMessage(int maxNumPlayers, String ip, String name)
	{
		mMaxNumPlayers = maxNumPlayers;
		mIP = ip;
		mName = name;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public short getFlag() {
		return FLAG_MESSAGE_PHONE_START_SERVER;
	}

	@Override
	protected void onReadTransmissionData(final DataInputStream pDataInputStream) throws IOException {
		this.mMaxNumPlayers = pDataInputStream.readInt();
	}

	@Override
	protected void onWriteTransmissionData(final DataOutputStream pDataOutputStream) throws IOException {
		// nothing to write
		
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
