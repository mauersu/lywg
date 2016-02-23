package com.game.net.m24;

import org.frkd.io.InputByteArray;
import org.frkd.io.OutputByteArray;
import org.frkd.net.socket.protocol.BasicMessage;

/**
 * 
 *
 */
public class M2404  extends BasicMessage{
	
	public String taskTreeArr;
	
	@Override
	public void decode(byte[] data) {
		InputByteArray dis = new InputByteArray(data);
		dis.skipBytes(1);
		
		taskTreeArr = dis.readUTF();
		
//		System.out.println(this);
//		JsonParser jp = new JsonParser();
//		JsonReader jr = new JsonReader(new StringReader(json.toLowerCase()));
//		jr.setLenient(true);
//		JsonElement je = jp.parse(jr);
		
	}
	
	@Override
	public byte[] encode(byte[] _arg1) {
		OutputByteArray dos = new OutputByteArray();
		dos.writeByte(0);
		return super.encode(dos.toByteArray());
	}

	@Override
	public String toString() {
		return "M2404 [taskTreeArr=" + taskTreeArr + "]";
	}
	
}
