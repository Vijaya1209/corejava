package com.coreassignments9.com;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Program4 {
	 HttpClient httpClient = HttpClient.newBuilder().build();
     HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("https://httpbin.org/get")).build();
     HttpResponse<T> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

     System.out.println(httpResponse.headers());
     System.out.println(httpResponse.statusCode());
     System.out.println(httpResponse.body());
}
