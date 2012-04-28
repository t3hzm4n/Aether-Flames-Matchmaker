package com.jjaz.aetherflames.messages.matchmaker;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.anddev.andengine.extension.multiplayer.protocol.adt.message.server.ServerMessage;

import com.jjaz.aetherflames.AetherFlamesConstants;

/**
 * (c) 2010 Nicolas Gramlich 
 * (c) 2011 Zynga Inc.
 * 
 * @author Nicolas Gramlich
 * @since 12:23:15 - 21.05.2011
 */
public class ConnectionRejectedProtocolMismatchMatchmakerMessage extends ServerMessage implements AetherFlamesConstants {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	private short mProtocolVersion;

	// ===========================================================
	// Constructors
	// ===========================================================

	@Deprecated
	public ConnectionRejectedProtocolMismatchMatchmakerMessage() {

	}

	public ConnectionRejectedProtocolMismatchMatchmakerMessage(final short pProtocolVersion) {
		this.mProtocolVersion = pProtocolVersion;
	}

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public short getProtocolVersion() {
		return this.mProtocolVersion;
	}

	public void setProtocolVersion(final short pProtocolVersion) {
		this.mProtocolVersion = pProtocolVersion;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	public short getFlag() {
		return FLAG_MESSAGE_MATCHMAKER_CONNECTION_REJECTED_PROTOCOL_MISMATCH;
	}

	@Override
	protected void onReadTransmissionData(final DataInputStream pDataInputStream) throws IOException {
		this.mProtocolVersion = pDataInputStream.readShort();
	}

	@Override
	protected void onWriteTransmissionData(final DataOutputStream pDataOutputStream) throws IOException {
		pDataOutputStream.writeShort(this.mProtocolVersion);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
