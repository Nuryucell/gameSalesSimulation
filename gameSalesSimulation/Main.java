package gameSalesSimulation;

import Concrete.CampaignManager;
import Concrete.GamerManager;
import Concrete.VerificationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer();
		gamer1.setFirstName("Nur");
		gamer1.setLastName("Yücel");
		gamer1.setEmail("nuryucel@gmail.com");
		gamer1.setNationalityId("11111111111");
		gamer1.setYearOfBirth("1999");
		
		Gamer gamer2 = new Gamer();
		gamer2.setFirstName("Fatma");
		gamer2.setLastName("Kaya");
		gamer2.setEmail("frukiyekayaa@gmail.com");
		gamer2.setNationalityId("22222222222");
		gamer2.setYearOfBirth("2000");	
		
		Game game1= new Game();
		game1.setId(1);
		game1.setNameOfTheGame("Barbie Partiye Hazýrlanýyor");
		game1.setUnitPrice(250);
		
		Game game2= new Game();
		game2.setId(2);
		game2.setNameOfTheGame("Euro Track");
		game2.setUnitPrice(140);
		
		Game game3= new Game();
		game3.setId(2);
		game3.setNameOfTheGame("Call Of Duty");
		game3.setUnitPrice(300);
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignName("Central'ýn 3. yýlýna özel indirimler!");
		campaign1.setDiscount(5);
		
		GamerManager gamerManager=new GamerManager(new VerificationManager());
		gamerManager.save(gamer1);
		gamerManager.update(gamer1);
		gamerManager.delete(gamer1);
		System.out.println("-----------------------");
		
		gamerManager.save(gamer2);
		gamerManager.update(gamer2);
		gamerManager.delete(gamer2);
		System.out.println("-----------------------");
		
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign1);
		System.out.println("-----------------------");
		
	
	}

}
