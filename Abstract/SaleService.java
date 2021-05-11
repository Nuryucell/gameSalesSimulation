package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SaleService {
	void buy(Game game, Gamer gamer);
	void campaignSale(Game game, Gamer gamer, Campaign campaign);

}
