public class Main {
	public static void main(String[] args) {
		String msg = "大家好 :),<script>,敏感,被就业,网络授课没感觉...";
		
		MsgProcessor processor = new MsgProcessor();
		processor.setMsg(msg);
		FilterChain chain1 = new FilterChain();
		chain1.addFilter(new HTMLFilter())
			.addFilter(new SensitiveFilter())
			.addFilter(new FaceFilter());
		
		FilterChain chain2 = new FilterChain();
		chain1.addFilter(chain2);
		
		processor.setChain(chain1);
		String result = processor.process();
		System.out.println(result);
	} 
}
