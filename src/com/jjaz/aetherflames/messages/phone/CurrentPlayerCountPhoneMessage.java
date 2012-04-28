package com.jjaz.aetherflames.messages.phone;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.anddev.andengine.extension.multiplayer.protocol.adt.message.client.ClientMessage;

import com.jjaz.aetherflames.AetherFlamesConstants;

public class CurrentPlayerCountPhoneMessage extends ClientMessage implements AetherFlamesConstants {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	public short mPlayerCount;

	// ===========================================================
	// Constructors
	// ===========================================================

	@Deprecated
	public CurrentPlayerCountPhoneMessage() {

	}

	public CurrentPlayerCountPhoneMessage(final short pPlayerCount) {
		this.mPlayerCount = pPlayerCount;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public void setPlayerCount(short pPlayerCount) {
		this.mPlayerCount = pPlayerCount;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public short getFlag() {
		return FLAG_MESSAGE_PHONE_CURRENT_PLAYER_COUNT;
	}

	@Override
	protected void onReadTransmissionData(final DataInputStream pDataInputStream) throws IOException {
		this.mPlayerCount = pDataInputStream.readShort();
	}

	@Override
	protected void onWriteTransmissionData(final DataOutputStream pDataOutputStream) throws IOException {
		pDataOutputStream.writeShort(this.mPlayerCount);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
