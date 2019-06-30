package eu.magicparksmc.enums.magickingdom;

public class FrontierList {
	enum frontierland {
		FRONTIER_TRADING_POST("Frontier Trading Post", "Disney Trading Pins and accessories");
		String frontierlandName;
		String frontierlandDescription;

		frontierland(String name, String description) {
			this.frontierlandName = name;
			this.frontierlandDescription = description;
		}
	}

	enum frontierlandRides {
		SPLASH_MOUNTAIN("Splash Mountain", "Enjoy a thrilling log flume ride based on 'Song of the South'"),
		BIG_THUNDER_MOUNTAIN("Big Thunder Mountain Railroad", "Ride through a gold-mining town on a runaway train");
		String frontierlandName;
		String frontierlandDescription;

		frontierlandRides(String name, String description) {
			this.frontierlandName = name;
			this.frontierlandDescription = description;
		}
	}

	enum frontierlandAttractions {
		TOM_SAWYER_ISLAND("Tom Sawyer Island", "Brave this Mark Twain-inspired hideaway"),
		COUNTRY_BEAR_JAMBOREE("Country Bear Jamboree", "Have a knee-slappin' time with these singing bears");
		String frontierlandName;
		String frontierlandDescription;

		frontierlandAttractions(String name, String description) {
			this.frontierlandName = name;
			this.frontierlandDescription = description;
		}
	}

	enum frontierlandRestaurants {
		GOLDEN_OAK_OUTPOST("Golden Oak Outpost", "Chicken breast nuggets, waffle fries and milkshakes"),
		PECOS_BILL_TALL_TALE_INN_AND_CAFE("Pecos Bill Tall Tale Inn and Café",
				"Tacos, nachos, lettuce wraps, fajitas and burgers"),
		WESTWARD_HO("Westward Ho", "Grilled chicken and bacon skewers, corn dogs, frozen lemonade and warm cookies");
		String frontierlandName;
		String frontierlandDescription;

		frontierlandRestaurants(String name, String description) {
			this.frontierlandName = name;
			this.frontierlandDescription = description;
		}
	}
}