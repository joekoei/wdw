package eu.magicparksmc.enums.magickingdom;

public class LibertySquareList {
	enum libertysquare {
		NULL(null);
		String libertysquareName;

		libertysquare(String name) {
			this.libertysquareName = name;
		}
	}

	enum libertysquareRides {
		LIBERTY_SQUARE_RIVERBOAT("Liberty Square Riverboat", "Cruise the Rivers of America aboard the Liberty Belle"),
		HAUNTED_MANSION("Haunted Mansion", "Take a spine-tingling tour of this dark, haunted estate");
		String libertysquareName;
		String libertysquareDescription;

		libertysquareRides(String name, String description) {
			this.libertysquareName = name;
			this.libertysquareDescription = description;
		}
	}

	enum libertysquareAttractions {
		HALL_OF_PRESIDENTS("The Hall of Presidents", "Behold all the U.S. Presidents on stage together");
		String libertysquareName;
		String libertysquareDescription;

		libertysquareAttractions(String name, String description) {
			this.libertysquareName = name;
			this.libertysquareDescription = description;
		}
	}

	enum libertysquareRestaurants {
		DIAMOND_HORSESHOE("The Diamond Horseshoe", "Enjoy Midwest feast inspired food"),
		LIBERTY_TREE_TAVERN("Liberty Tree Tavern", "Enjoy American feast inspired food"),
		SLEEPY_HOLLOW("Sleepy Hollow",
				"Funnel cakes, waffles, chicken & waffle sandwich and churro ice cream sandwich"),
		LIBERTY_SQUARE_MARKET("Liberty Square Market",
				"Turkey legs, grilled all-beef hot dogs, slushies, fresh fruit and chips"),
		COLUMBIA_HARBOUR_HOUSE("Columbia Harbour House",
				"Lobster roll, sandwiches, fish, shrimp, chicken breast nuggets and salads");
		String libertysquareName;
		String libertysquareDescription;

		libertysquareRestaurants(String name, String description) {
			this.libertysquareName = name;
			this.libertysquareDescription = description;
		}
	}
}