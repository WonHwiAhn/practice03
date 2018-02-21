package prob04;

public class StringUtil {
	public static String concatenate( String[] str ) {
		// String[] strArr = {"SuperMan", "BatMan", "SpiderMan"};
		String data = "";
		for(int i=0;i<str.length;i++)
			data += str[i];
			
		return data;
	}
}
