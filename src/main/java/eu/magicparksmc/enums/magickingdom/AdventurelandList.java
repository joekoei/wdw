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
		MAGIC_CARPETS_ALADDIN("The Magic Carpets of Aladdin", ""),
		JUNGLE_CRUISE("Jungle Cruise", ""),
		PIRATES_OF_THE_CARIBBEAN("Pirates of the Caribbean", "");
		String adventurelandName;
		String adventureDescription;

		adventurelandRides(String name, String description) {
			this.adventurelandName = name;
			this.adventureDescription = description;
		}
	}

	enum adventurelandAttractions {
		SWISS_FAMILY_TREEHOUSE("Swiss Family Treehouse", ""),
		ENCHANTED_TIKI_ROOM("Walt Disney's Enchanted Tiki Room", ""),
		TREASURES_OF_THE_SEVEN_SEAS("A Pirate's Adventure - Treasures of the Seven Seas", "");
		String adventurelandName;
		String adventurelandDescription;

		adventurelandAttractions(String name, String description) {
			this.adventurelandName = name;
			this.adventurelandDescription = description;
		}
	}

	enum adventurelandRestaurants {
		SUNSHINE_TREE_TERRACE("Sunshine Tree Terrace", ""),
		ALOHA_ISLE("Aloha Isle", ""),
		TORTUGA_TAVERN("Tortuga Tavern", ""),
		JUNGLE_NAVIGATION_SKIPPER_CANTEEN("Jungle Navigation Co. LTD Skipper Canteen", "");
		String adventurelandName;
		String adventurelandDescription;

		adventurelandRestaurants(String name, String description) {
			this.adventurelandName = name;
			this.adventurelandDescription = description;
		}
	}
}