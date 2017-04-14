
public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(String str) {
		str = str.replace("被就业", "就业")
				.replace("敏感", "");
		return str;
	}
}
