
public class FaceFilter implements Filter {

	@Override
	public String doFilter(String str) {
		str = str.replace(":)", "笑脸");
		return str;
	}

}
