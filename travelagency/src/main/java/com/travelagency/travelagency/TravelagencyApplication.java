package com.travelagency.travelagency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.travelagency.travelagency.service.CustomerService;

@SpringBootApplication
public class TravelagencyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TravelagencyApplication.class, args);
	}
@Autowired
CustomerService customerService;
	@Override
	public void run(String... args) throws Exception {
//		 PermanentAddress Paddress = 
//		           new PermanentAddress("101","Main Street","Metrostation","Delhi","Delhi",110001);
//		           PermanentAddress Paddress1 = 
//		                   new PermanentAddress("201","GhandiNagar","LalChowk","Noida","UttarPradesh",201301);
//		           PermanentAddress Paddress2 = 
//		                   new PermanentAddress("301","Nagawara","1 Cross Road","Bangalore","Karnataka",560045);
//		     CommunicationAddress c = new CommunicationAddress("204","2","Alganamore","jeahanabad","Bihar",804422);
//		     CommunicationAddress c1 = new CommunicationAddress("206","1","206 Bus Stop","Kolkata","westBengal",700091);
//		     CommunicationAddress c2 = new CommunicationAddress("501","5","kestopur bus Stop","kolkata","westBengal",70091);
//		   List<String> locationcover = new ArrayList<String>();
//		   locationcover.add("kanpur");
//		   locationcover.add("luckow");
//		   locationcover.add("Prayagraj");
//		  Customer cus = 
//		new Customer(3,"Pratik","dhote","Patna","Delhi",locationcover,"3Days",5000,"1234567890",Paddress,c,"Good");
//		  Customer cus1 = 
//				  new Customer(1,"Deepak","kumar","Patna","Delhi",locationcover,"3Days",5000,"1234567890",Paddress1,c1,"bad");
//		  Customer cus2 = 
//				  new Customer(2,"Bambam","kumar","Patna","Delhi",locationcover,"3Days",5000,"1234567890",Paddress2,c2,"Not good");
//				     
//		  customerService.createCustomer(cus);
//		  customerService.createCustomer(cus1);
//		  customerService.createCustomer(cus2);
		
	}

}
