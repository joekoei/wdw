package eu.magicparksmc.enums.magickingdom;

public class AdventurelandList {
	enum adventureland {
		NULL(null);
		String adventurelandName;

		adventureland(String name) {
			this.adventurelandName = name;
		}
	}

	enum adventurelandRides {
		MAGIC_CARPETS_ALADDIN("The Magic Carpets of Aladdin", "Fly high on a magic carpet above Adventureland"),
		JUNGLE_CRUISE("Jungle Cruise", "Set sail on a whimsical cruise through exotic rivers"),
		PIRATES_OF_THE_CARIBBEAN("Pirates of the Caribbean",
				"Embark on a voyage to a time when pirates ruled the seas");
		String adventurelandName;
		String adventureDescription;

		adventurelandRides(String name, String description) {
			this.adventurelandName = name;
			this.adventureDescription = description;
		}
	}

	enum adventurelandAttractions {
		SWISS_FAMILY_TREEHOUSE("Swiss Family Treehouse", "Explore the treehouse inspired by the classic Disney film"),
		ENCHANTED_TIKI_ROOM("Walt Disney's Enchanted Tiki Room",
				"Watch tropical birds and colorful flowers come to live"),
		TREASURES_OF_THE_SEVEN_SEAS("A Pirate's Adventure - Treasures of the Seven Seas",
				"Discover mystic adventure and collect Treasure Finder Cards in this self-guided quest through Adventureland!");
		String adventurelandName;
		String adventurelandDescription;

		adventurelandAttractions(String name, String description) {
			this.adventurelandName = name;
			this.adventurelandDescription = description;
		}
	}

	enum adventurelandRestaurants {
		SUNSHINE_TREE_TERRACE("Sunshine Tree Terrace", "Citrus Swirl and orange DOLE WHIP soft serve"),
		ALOHA_ISLE("Aloha Isle", "DOLE WHIP soft serve and pineapple upside-down cake"),
		TORTUGA_TAVERN("Tortuga Tavern",
				"All-beef hot dogs, turkey legs, pepper jack-stuffed pretzels, slushies and warm cookies"),
		JUNGLE_NAVIGATION_SKIPPER_CANTEEN("Jungle Navigation Co. LTD Skipper Canteen",
				"Bold, flavorful cuisine of Asia, South America and Africa");
		String adventurelandName;
		String adventurelandDescription;

		adventurelandRestaurants(String name, String description) {
			this.adventurelandName = name;
			this.adventurelandDescription = description;
		}
	}
}