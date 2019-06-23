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
		MAGIC_CARPETS_ALADDIN("The Magic Carpets of Aladdin"), JUNGLE_CRUISE("Jungle Cruise"),
		PIRATES_OF_THE_CARIBBEAN("Pirates of the Caribbean");
		String adventurelandName;

		adventurelandRides(String name) {
			this.adventurelandName = name;
		}
	}

	enum adventurelandAttractions {
		SWISS_FAMILY_TREEHOUSE("Swiss Family Treehouse"), ENCHANTED_TIKI_ROOM("Walt Disney's Enchanted Tiki Room"),
		TREASURES_OF_THE_SEVEN_SEAS("A Pirate's Adventure - Treasures of the Seven Seas");
		String adventurelandName;

		adventurelandAttractions(String name) {
			this.adventurelandName = name;
		}
	}

	enum adventurelandRestaurants {
		SUNSHINE_TREE_TERRACE("Sunshine Tree Terrace"), ALOHA_ISLE("Aloha Isle"), TORTUGA_TAVERN("Tortuga Tavern"),
		JUNGLE_NAVIGATION_SKIPPER_CANTEEN("Jungle Navigation Co. LTD Skipper Canteen");
		String adventurelandName;

		adventurelandRestaurants(String name) {
			this.adventurelandName = name;
		}
	}
}