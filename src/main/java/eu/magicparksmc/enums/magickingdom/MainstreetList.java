package eu.magicparksmc.enums.magickingdom;

public class MainstreetList {
	enum mainstreet {
		CITY_HALL("City Hall"), HARMONY_BARBER_SHOP("Harmony Barber Shop"),
		MAINSTREET_CHAMBER_OF_COMMERCE("Main Street Chamber of Commerce"), EMPORIUM("Emporium"),
		MAINSTREET_CINEMA("Main Street Cinema"), THE_CHAPEAU("The Chapeau");

		String mainstreetName;

		mainstreet(String name) {
			this.mainstreetName = name;
		}
	}

	enum mainstreetRides {
		WALT_DISNEY_WORLD_RAILROAD("Walt Disney World Railroad");

		String mainstreetName;

		mainstreetRides(String name) {
			this.mainstreetName = name;
		}
	}

	enum mainstreetAttractions {
		TOWN_SQUARE_THEATER("Town Square Theater"), SORCERERS_OF_THE_MAGIC_KINGDOM("Sorcerers of the Magic Kingdom");

		String mainstreetName;

		mainstreetAttractions(String name) {
			this.mainstreetName = name;
		}
	}

	enum mainstreetRestaurants {
		TONYS_TOWN_SQUARE_RESTAURANT("Tony's Town Square Restaurant"), MAINSTREET_BAKERY("Main Street Bakery"),
		PLAZA_ICE_CREAM_PARLOR("Plaza Ice Cream Parlor"), THE_PLAZA_RESTAURANT("The Plaza Restaurant"),
		CASEYS_CORNER("Casey's Corner"), THE_CRYSTAL_PALACE("The Crystal Palace, A Buffet with Character");

		String mainstreetName;

		mainstreetRestaurants(String name) {
			this.mainstreetName = name;
		}
	}

	enum magickingdomShows {
		STREET_PARTY("Move it! Shake it! MousekeDance it! Street Party"),
		ROYAL_FRIENDSHIP_FAIRE("Mickey's Royal Friendship Faire"), PARADE("Disney's Festival of Fantasy Parade"),
		HAPPILY_EVER_AFTER("Happily Ever Afer");
		String mainstreetName;

		magickingdomShows(String name) {
			this.mainstreetName = name;
		}
	}

	// All the numbers of Mainstreet U.S.A
	// 1 > Walt Disney World Railroad
	// 2 > City Hall
	// 3 > Sorcerers of the Magic Kingdom
	// 4 > Harmony Barber Shop
	// 5 > Town Square Theater
	// 6 > Tony's Town Square Restaurant
	// 7 >
	// 8 >
	// 9 >
	// 10 >
	// 11 >
	// 12 >
	// 13 >
	// 14 >
	// 15 >
}