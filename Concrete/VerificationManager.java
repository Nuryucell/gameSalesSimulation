package Concrete;

import Abstract.Verification;
import Entities.Gamer;

public class VerificationManager implements Verification {


	    @Override
	    public boolean checkPlayer(Gamer gamer) {
	        if (gamer.getNationalityId().length() == 11) {
	            System.out.println("Doğrulama gerçekleştirildi.");
	            return true;
	        }
	        else 
	            System.out.println("Doğrulama gerçekleştirilemedi.");
	            return false;
	    }

	

	}

