/**
 * Title: MsgProcessor.java Description: 拥有一系列处理规则，处理链条
 * 
 * @author rico
 * @created 2017年3月28日 上午8:40:50
 */
public class MsgProcessor {

	// 过滤规则的顺序，增删，扩展
	// Filter[] filters = {new HTMLFilter(), new SensitiveFilter(),new
	// FaceFilter()};

	private String msg;
	private FilterChain chain;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public FilterChain getChain() {
		return chain;
	}

	public void setChain(FilterChain chain) {
		this.chain = chain;
	}

	/**
	 * @description 1.动态指定过滤规则(添加，删除) 2.
	 * @author rico
	 * @created 2017年3月28日 上午8:29:02
	 * @return
	 */
	public String process() {
		
		//消息的处理又规则链条来完成
		return chain.doFilter(msg);
	}
}
