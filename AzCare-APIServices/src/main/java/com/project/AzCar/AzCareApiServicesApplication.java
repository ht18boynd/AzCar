package com.project.AzCar;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.project.AzCar.Services.UploadFiles.FilesStorageServices;


@SpringBootApplication
@ComponentScan(basePackages = "com.project.AzCar.*")
@Configuration
@EnableWebSecurity
public class AzCareApiServicesApplication implements CommandLineRunner{
	
	@jakarta.annotation.Resource
	  FilesStorageServices storageService;
	public static void main(String[] args) {
		SpringApplication.run(AzCareApiServicesApplication.class, args);
	}
	
	@Override
	  public void run(String... arg) throws Exception {
//	    storageService.deleteAll();
	    storageService.init();
	

}}
