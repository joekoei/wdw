package eu.magicparksmc.enums.magickingdom;

public class FrontierList {
	enum frontierland {
		FRONTIER_TRADING_POST("Frontier Trading Post");
		String frontierlandName;

		frontierland(String name) {
			this.frontierlandName = name;
		}
	}

	enum frontierlandRides {
		SPLASH_MOUNTAIN("Splash Mountain"), BIG_THUNDER_MOUNTAIN("Big Thunder Mountain Railroad");
		String frontierlandName;

		frontierlandRides(String name) {
			this.frontierlandName = name;
		}
	}

	enum frontierlandAttractions {
		TOM_SAWYER_ISLAND("Tom Sawyer Island"), COUNTRY_BEAR_JAMBOREE("Country Bear Jamboree");
		String frontierlandName;

		frontierlandAttractions(String name) {
			this.frontierlandName = name;
		}
	}

	enum frontierlandRestaurants {
		GOLDEN_OAK_OUTPOST("Golden Oak Outpost"),
		PECOS_BILL_TALL_TALE_INN_AND_CAFE("Pecos Bill Tall Tale Inn and Café"), WESTWARD_HO("Westward Ho");
		String frontierlandName;

		frontierlandRestaurants(String name) {
			this.frontierlandName = name;
		}
	}
}