import java.util.ArrayList;
import java.util.List;

/**        
 * Title: FilterChain.java    
 * Description: FilterChain 本身就是一个大的 Filter
 * @author rico       
 * @created 2017年3月28日 上午9:08:02    
 */      
public class FilterChain implements Filter {

	List<Filter> filters = new ArrayList<Filter>();
	
	// 小技巧：链式编程
	public FilterChain addFilter(Filter filter){
		filters.add(filter);
		return this;    // 返回自身
	}

	@Override
	public String doFilter(String str) {
		String r = str;
		for (Filter filter : filters) {
			r = filter.doFilter(r);
		}
		return r;
	}

}
