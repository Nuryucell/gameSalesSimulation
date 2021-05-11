package Concrete;

import Abstract.GamerService;

import Entities.Gamer;

public class GamerManager implements GamerService{


	public GamerManager(VerificationManager verificationManager) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Gamer gamer) {
			System.out.println(gamer.getFirstName() + gamer.getLastName() + " adlý oyuncu kaydedildi.");
			
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " adlý oyuncu kaydý silindi..");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " adlý oyuncu bilgileri güncellendi.");
		
	}
	
	

}
