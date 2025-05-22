package Rest.ThirdPartApiIntegration;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;

import org.aspectj.weaver.StandardAnnotation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import Rest.ThirdPartApiIntegration.IpAddress;
import java.util.List;
@SpringBootApplication
public class ThirdPartApiIntegrationApplication implements CommandLineRunner {
	
	public static void main(String[] args) {
		SpringApplication.run(ThirdPartApiIntegrationApplication.class, args);
		
	}

	public void run(String... args) throws Exception {
		String baseURL="https://jsonmock.hackerrank.com/api/ip?ip=172.217.20.46";
		String baseURL1="https://jsonplaceholder.typicode.com/posts";
		String requestBody="";
		HttpClient client=HttpClient.newHttpClient();
		HttpRequest request= HttpRequest.newBuilder()
				.uri(URI.create(baseURL))
				.GET()
				.build()
				;
		HttpRequest request1= HttpRequest.newBuilder()
				.uri(URI.create(baseURL1))
				.header("Content-Type", "application/json")
				//.POST(BodyPublishers.ofString(requestBody))
				 .GET()
				.build()
				;
		
		try {
			
			HttpResponse<String>response=client.send(request,HttpResponse.BodyHandlers.ofString());
			HttpResponse<String>response1=client.send(request1,HttpResponse.BodyHandlers.ofString());
			System.out.println(response1);
			String json=response.body();
		   //String to json
			ObjectMapper mapper=new ObjectMapper();
			ApiResponse resInJson = mapper.readValue(json,ApiResponse.class);
			//List<ApiResponse> readValue = mapper.readValue(json, new TypeReference<List<ApiResponse>>(){});
			//readValue.stream().forEach(ip->System.out.println(ip.getData()));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	

}
