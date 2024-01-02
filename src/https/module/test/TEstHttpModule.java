package https.module.test;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;

public class TEstHttpModule {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		HttpClient client = HttpClient.newBuilder()
			     .version(Version.HTTP_1_1)
			     .followRedirects(Redirect.NORMAL)
			     .connectTimeout(Duration.ofSeconds(20))
			     .build();
		
			HttpRequest request = null;
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			System.out.println(response.statusCode());
			System.out.println(response.body());

	}

}
