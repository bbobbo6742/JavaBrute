package kr.bbobbo6742.brute;

import java.io.Serializable;

public class Session implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public char[] charset = Main.chars_With_SpecialCharacters;
	public final int min;
	public int max;
	public int now;
	Text t;
	
	public Session(int minLength, int maxLength) {
		this.max = maxLength;
		this.min = minLength;
		now = min;
		t = new Text(now, charset);
	}
	
	public Session(int minLength, int maxLength, char[] charset) {
		this.max = maxLength;
		this.min = minLength;
		now = min;
		this.charset = charset;
		t = new Text(now, charset);
	}
	
	public String next() {
		String s = t.next();
		if(s==null) {
			if(now < max) {
				now++;
				t = new Text(now, charset);
				return t.next();
			} else {
				return null;
			}
		}
		return s;
	}
	
	
	
}
