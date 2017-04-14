public class HTMLFilter implements Filter {

	@Override
	public String doFilter(String str) {
		// process HTML Tag
		String r = str.replace("<", "[").replace(">", "]");
		return r;
	}
}
