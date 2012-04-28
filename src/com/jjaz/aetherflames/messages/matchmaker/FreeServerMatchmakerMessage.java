package com.jjaz.aetherflames.messages.matchmaker;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.anddev.andengine.extension.multiplayer.protocol.adt.message.server.ServerMessage;

import com.jjaz.aetherflames.AetherFlamesConstants;

public class FreeServerMatchmakerMessage extends ServerMessage implements AetherFlamesConstants {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private String mIP;

	// ===========================================================
	// Constructors
	// ===========================================================

	@Deprecated
	public FreeServerMatchmakerMessage() {

	}

	public FreeServerMatchmakerMessage(final String pIP) {
		this.mIP = pIP;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public String getProtocolVersion() {
		return this.mIP;
	}
	
	public void setIP(String ip)
	{
		mIP = ip;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public short getFlag() {
		return FLAG_MESSAGE_MATCHMAKER_FREE_SERVER;
	}

	@Override
	protected void onReadTransmissionData(final DataInputStream pDataInputStream) throws IOException {
		this.mIP = pDataInputStream.readLine();
	}

	@Override
	protected void onWriteTransmissionData(final DataOutputStream pDataOutputStream) throws IOException {
		pDataOutputStream.writeChars(this.mIP);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
