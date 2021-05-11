package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(game.getNameOfTheGame() + " adl� oyun " + gamer.getFirstName() + gamer.getLastName() + " adl� oyncuya sat�ld�.");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		double unitsPrice=game.getUnitPrice()-(game.getUnitPrice()*campaign.getDiscount()/100);
        System.out.println("Kampanya dahilinde "+ unitsPrice+ " tl " +gamer.getFirstName()+" "+gamer.getLastName()+ " �dendi." );
    }


		
	}
	