package com.arcalamus.util.strings;

public abstract class StringConverter {
	public boolean toBoolean(String s) {
		return StringUtils.toBoolean(s);
	}
	public byte toByte(String s) {
		return StringUtils.toByte(s);
	}
	public short toShort(String s) {
		return StringUtils.toShort(s);
	}
	public int toInteger(String s) {
		return StringUtils.toInteger(s);
	}
	public float toFloat(String s) {
		return StringUtils.toFloat(s);
	}
	public long toLong(String s) {
		return StringUtils.toLong(s);
	}
	public double toDouble(String s) {
		return StringUtils.toDouble(s);
	}
}