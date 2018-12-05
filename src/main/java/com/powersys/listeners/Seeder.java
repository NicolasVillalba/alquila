package com.powersys.listeners;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.powersys.alquila.domain.Address;
import com.powersys.alquila.domain.Owner;
import com.powersys.alquila.domain.Property;
import com.powersys.alquila.repositories.PlacesRepository;
	
@Component
public class Seeder {
	@Autowired
	private PlacesRepository placeRepo;
	
	//@EventListener
	public void seeder(ContextRefreshedEvent event) {
		System.out.println("::::::::::::::::::::::::DB SEEDING:::::::::::::::::::::::::");
		
		List<LocalDate> dates = new ArrayList<>();
		dates.add(LocalDate.of(2018, Month.NOVEMBER, 3));
		dates.add(LocalDate.of(2018, Month.NOVEMBER, 7));
		dates.add(LocalDate.of(2018, Month.NOVEMBER, 8));
		dates.add(LocalDate.of(2018, Month.NOVEMBER, 12));
		dates.add(LocalDate.of(2018, Month.NOVEMBER, 2));
		dates.add(LocalDate.of(2018, Month.NOVEMBER, 5));
		dates.add(LocalDate.of(2018, Month.OCTOBER, 30));
		dates.add(LocalDate.of(2018, Month.OCTOBER, 21));
		dates.add(LocalDate.of(2018, Month.OCTOBER, 22));
		dates.add(LocalDate.of(2018, Month.OCTOBER, 2));
		dates.add(LocalDate.of(2018, Month.SEPTEMBER, 3));
		dates.add(LocalDate.of(2018, Month.SEPTEMBER, 1));
		dates.add(LocalDate.of(2018, Month.SEPTEMBER, 10));
		dates.add(LocalDate.of(2018, Month.SEPTEMBER, 13));
		dates.add(LocalDate.of(2018, Month.AUGUST, 29));
		dates.add(LocalDate.of(2018, Month.AUGUST, 16));
		dates.add(LocalDate.of(2018, Month.AUGUST, 8));
		dates.add(LocalDate.of(2018, Month.AUGUST, 3));
		dates.add(LocalDate.of(2018, Month.AUGUST, 19));
		dates.add(LocalDate.of(2018, Month.JUNE, 26));
			
			Address adress = new Address();
			adress.setStreet("Alcalá");
			adress.setNumber("999");
			
			String firstName = "";
			String lastName = "";
			String phone = "";
			String email = "";
			String url = "";
			Owner owner = new Owner();
			owner.setName(firstName);
			owner.setLastName(lastName);
			owner.setPhone(phone);
			owner.setEmail(email);
			owner.setAvatar(url);
			
			Integer amount = 3235;
			Property entity = new Property();
			entity.setAdress(adress);
			entity.setOwner(owner);
			//entity.setDescription("csdsd");
			//entity.setDetails(details);
			//entity.setLegals(legals);
			entity.getPropertyDetail().setYard("");
			entity.getPropertyDetail().setGarage("");
			entity.getPropertyDetail().setGarage2("");
			entity.setPrice(amount);
			entity.setType("sd");
			entity.setImage("jdjdjdjddjjdkkkdjdjdkkk");
			
			placeRepo.save(entity);
		
	}

}
