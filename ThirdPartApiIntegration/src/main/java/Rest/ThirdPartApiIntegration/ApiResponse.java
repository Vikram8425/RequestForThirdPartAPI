package Rest.ThirdPartApiIntegration;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse {
	private int page;
	@JsonProperty("per_page")
	private int perPages;
	private int total;
	@JsonProperty("total_pages")
	private int totalPages;
	private List<IpAddress> data;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPerPages() {
		return perPages;
	}
	public void setPerPages(int perPages) {
		this.perPages = perPages;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public List<IpAddress> getData() {
		return data;
	}
	public void setData(List<IpAddress> data) {
		this.data = data;
	}
	public ApiResponse(int page, int perPages, int total, int totalPages, List<IpAddress> data) {
		super();
		this.page = page;
		this.perPages = perPages;
		this.total = total;
		this.totalPages = totalPages;
		this.data = data;
	}
	public ApiResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
