package com.arcalamus.util.strings;

public final class StringUtils {

	public static boolean toBoolean(String s) {
		return Boolean.parseBoolean(s);
	}
	public static byte toByte(String s) {
		return Byte.parseByte(s);
	}
	public static short toShort(String s) {
		return Short.parseShort(s);
	}
	public static int toInteger(String s) {
		return Integer.parseInt(s);
	}
	public static strictfp float toFloat(String s) {
		return Float.parseFloat(s);
	}
	public static long toLong(String s) {
		return Long.parseLong(s);
	}
	public static double toDouble(String s) {
		return Double.parseDouble(s);
	}

}