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
		LIBERTY_SQUARE_RIVERBOAT("Liberty Square Riverboat"), HAUNTED_MANSION("Haunted Mansion");
		String libertysquareName;

		libertysquareRides(String name) {
			this.libertysquareName = name;
		}
	}

	enum libertysquareAttractions {
		HALL_OF_PRESIDENTS("The Hall of Presidents");
		String libertysquareName;

		libertysquareAttractions(String name) {
			this.libertysquareName = name;
		}
	}

	enum libertysquareRestaurants {
		DIAMOND_HORSESHOE("The Diamond Horseshoe"), LIBERTY_TREE_TAVERN("Liberty Tree Tavern"),
		SLEEPY_HOLLOW("Sleepy Hollow"), LIBERTY_SQUARE_MARKET("Liberty Square Market"),
		COLUMBIA_HARBOUR_HOUSE("Columbia Harbour House");
		String libertysquareName;

		libertysquareRestaurants(String name) {
			this.libertysquareName = name;
		}
	}
}