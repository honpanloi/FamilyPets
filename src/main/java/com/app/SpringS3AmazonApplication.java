package com.app;

import com.app.service.S3Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringS3AmazonApplication{  // implements CommandLineRunner {

	@Autowired
	S3Services s3Services;

	@Value("${jsa.s3.uploadfile}")
	private String uploadFilePath;

	@Value("${jsa.s3.key}")
	private String downloadKey;

	public static void main(String[] args) {
		SpringApplication.run(SpringS3AmazonApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("---------------- START UPLOAD FILE ----------------");
//		s3Services.uploadFile("notes.txt", uploadFilePath);
//		System.out.println("---------------- START DOWNLOAD FILE ----------------");
//		s3Services.downloadFile(downloadKey);
//	}

}
