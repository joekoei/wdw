package eu.magicparksmc.enums.magickingdom;

public class MainstreetList {
	enum mainstreet {
		CITY_HALL("City Hall", "Guest Relations, Information and Lost & Found"),
		HARMONY_BARBER_SHOP("Harmony Barber Shop", "Appointment needed"),
		MAINSTREET_CHAMBER_OF_COMMERCE("Main Street Chamber of Commerce", "Merchandise Package Pickup"),
		EMPORIUM("Emporium", "One-stop shopping destination for Disney Character gifts and Park souvenirs"),
		MAINSTREET_CINEMA("Main Street Cinema", "Disney art, collectibles, figurines and more"),
		THE_CHAPEAU("The Chapeau", "Personalize your headwear, tote bags and more with new deluxe embroidery");
		String mainstreetName;
		String mainstreetDescription;

		mainstreet(String name, String description) {
			this.mainstreetName = name;
			this.mainstreetDescription = description;
		}
	}

	enum mainstreetRides {
		WALT_DISNEY_WORLD_RAILROAD("Walt Disney World Railroad",
				"Get an up-close look and take advantage of one-of-a-kind photo opportunities as the train takes up temporary residence at the station on Main Street U.S.A");
		String mainstreetName;
		String mainstreetDescription;

		mainstreetRides(String name, String description) {
			this.mainstreetName = name;
			this.mainstreetDescription = description;
		}
	}

	enum mainstreetAttractions {
		TOWN_SQUARE_THEATER("Town Square Theater", "Meet Mickey Mouse & Minnie Mouse & Tinkerbell"),
		SORCERERS_OF_THE_MAGIC_KINGDOM("Sorcerers of the Magic Kingdom",
				"Search for clues throughout the Park to defeat the Disney Villains");
		String mainstreetName;
		String mainstreetDescription;

		mainstreetAttractions(String name, String description) {
			this.mainstreetName = name;
			this.mainstreetDescription = description;
		}
	}

	enum mainstreetRestaurants {
		TONYS_TOWN_SQUARE_RESTAURANT("Tony's Town Square Restaurant", "House-made pastas, chicken parmesan and salads"),
		MAINSTREET_BAKERY("Main Street Bakery",
				"Starbucks espresso, house-made Disney pastries, Artisan sandwiches and salads"),
		PLAZA_ICE_CREAM_PARLOR("Plaza Ice Cream Parlor",
				"Hand-scooped ice cream, waffle-bowl sundaes and Mickey's Kitchen Sink Sundae"),
		THE_PLAZA_RESTAURANT("The Plaza Restaurant", "Breakfast, lunch and dinner"),
		CASEYS_CORNER("Casey's Corner", "Specialty all-beef hot dogs and corn dog nuggets"),
		THE_CRYSTAL_PALACE("The Crystal Palace, A Buffet with Character", "Character buffet, American cuisine");
		String mainstreetName;
		String mainstreetDescription;

		mainstreetRestaurants(String name, String description) {
			this.mainstreetName = name;
			this.mainstreetDescription = description;
		}
	}

	enum magickingdomShows {
		STREET_PARTY("Move it! Shake it! MousekeDance it! Street Party", "Check the Times Guide for more information"),
		ROYAL_FRIENDSHIP_FAIRE("Mickey's Royal Friendship Faire", "Check the Times Guide for more information"),
		PARADE("Disney's Festival of Fantasy Parade", "Check the Times Guide for more information"),
		HAPPILY_EVER_AFTER("Happily Ever Afer", "Check the Times Guide for more information");
		String mainstreetName;
		String mainstreetDescription;

		magickingdomShows(String name, String description) {
			this.mainstreetName = name;
			this.mainstreetDescription = description;
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