package kr.bbobbo6742.brute;

import java.io.Serializable;

public class Text implements Serializable {

	private static final long serialVersionUID = 1L;
	
	final int length;
	final Char[] chars;
	final char[] charset;
	
	public Text(int length, char[] charset) {
		this.charset = charset;
		this.length = length;
		chars = new Char[length];
		for(int f = 0; f<length; f++) {
			chars[f] = new Char(this, f);
		}
	}
	
	public String next() {
		chars[length-1].next();
		
		if(chars[0].index == charset.length) {
			return null;
		}
		StringBuilder sb = new StringBuilder();
		for(int f = 0; f< length; f++) {
			sb.append(charset[chars[f].index]);
		}
		return sb.toString();
	}
	
}
