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
		LIBERTY_SQUARE_RIVERBOAT("Liberty Square Riverboat", ""),
		HAUNTED_MANSION("Haunted Mansion", "");
		String libertysquareName;
		String libertysquareDescription;

		libertysquareRides(String name, String description) {
			this.libertysquareName = name;
			this.libertysquareDescription = description;
		}
	}

	enum libertysquareAttractions {
		HALL_OF_PRESIDENTS("The Hall of Presidents", "");
		String libertysquareName;
		String libertysquareDescription;

		libertysquareAttractions(String name, String description) {
			this.libertysquareName = name;
			this.libertysquareDescription = description;
		}
	}

	enum libertysquareRestaurants {
		DIAMOND_HORSESHOE("The Diamond Horseshoe", ""),
		LIBERTY_TREE_TAVERN("Liberty Tree Tavern", ""),
		SLEEPY_HOLLOW("Sleepy Hollow", ""),
		LIBERTY_SQUARE_MARKET("Liberty Square Market", ""),
		COLUMBIA_HARBOUR_HOUSE("Columbia Harbour House", "");
		String libertysquareName;
		String libertysquareDescription;

		libertysquareRestaurants(String name, String description) {
			this.libertysquareName = name;
			this.libertysquareDescription = description;
		}
	}
}