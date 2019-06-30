package eu.magicparksmc.enums.magickingdom;

public class FantasylandList {
	enum fantasyland {
		BIBBIDI_BOBBIDI_BOUTIQUE("Bibbidi Bobbidi Boutique", "Transform into a Disney Princess or valiant Knight"),
		BIG_TOP_SOUVENIRS("Big Top Souvenirs", "Handmade sweet treats, Disney Character gifts and Park souvenirs"),
		FANTASY_FAIRE("Fantasy Faire", "Personalized headwear destination");
		String fantasylandName;
		String fantasylandDescription;

		fantasyland(String name, String description) {
			this.fantasylandName = name;
			this.fantasylandDescription = description;
		}
	}

	enum fantasylandRides {
		ITS_A_SMALL_WORLD("'it's a small world'", "Take a boat tour around the globe"),
		PETER_PANS_FLIGHT("Peter Pan's Flight", "Fly with Peter Pan aboard a magical ship"),
		PRINCE_CHARMING_CARROUSEL("Prince Charming Regal Carrousel", "Ride this classic attraction"),
		WINNIE_THE_POOH("The Many Adventures of Winnie the Pooh",
				"Travel through the Hundred Acre Wood in an oversized Hunny Pot"),
		MAD_TEA_PARTY("Mad Tea Party", "Spin around and around in a giant teacup"),
		SEVEN_DWARFS_MINE_TRAIN("Seven Dwarfs Mine Train",
				"Race and rock through a diamond mine on this family coaster"),
		JOURNEY_OF_THE_LITTLE_MERMAID("Under the Sea - Journey of the Little Mermaid",
				"Descend below the waves for a splashy musical adventure"),
		DUMBO_THE_FLYING_ELEPHANT("Dumbo the Flying Elephant", "Ride your favorite flying elephant"),
		BARNSTORMER("The Barnstormer", "Take flight on this thrilling junior roller coaster");
		String fantasylandName;
		String fantasylandDescription;

		fantasylandRides(String name, String description) {
			this.fantasylandName = name;
			this.fantasylandDescription = description;
		}
	}

	enum fantasylandAttractions {
		MICKEYS_PHILHARMAGIC("Mickey's PhilharMagic", "Get swept away in this 3-D movie"),
		ENCHANTED_TALES_WITH_BELLE("Enchanted Tales with Belle",
				"Enjoy a interactive story adventure featuring Belle, Lumiere and possibly you"),
		PRINCESS_FAIRYTALE_HALL("Princess Fairytale Hall", "Meet some of your favorite Disney Princesses"),
		FAIRYTALE_GARDEN("Fairytale Garden", "Encounter a fairytale friend in this garden setting"),
		ARIELS_GROTTO("Ariels Grotto", "Meet The Little Mermaid in her retreat under the sea"),
		SPLASH_N_SOAK_STATION("Casey Jr. Splash 'N' Soak Station", "Cool off in this whimsical water play area"),
		PETES_SILLY_SIDESHOW("Pete's Silly Sideshow", "Meet Donald Duck, Goofy, Daisy Duck & Pluto!");
		String fantasylandName;
		String fantasylandDescription;

		fantasylandAttractions(String name, String description) {
			this.fantasylandName = name;
			this.fantasylandDescription = description;
		}
	}

	enum fantasylandRestaurants {
		PINOCCHIO_VILLAGE_HAUS("Pinocchio Village Haus", "Flatbreads, pasta, chicken breast nuggets and salads"),
		CINDERELLAS_ROYAL_TABLE("Cinderella's Royal Table", "Character dining with Disney Princesses"),
		THE_FRIARS_NOOK("The Friars Nook", "Gourmet tots, bratwurst, all-beef hot dogs and macaroni & cheese"),
		STORYBOOK_TREATS("Storybook Treats", "Tink's Pixie-Dusted cone, Peter Pan Float and ice cream"),
		BE_OUR_GUEST("Be Our Guest Restaurant",
				"Eat breakfast, lunch and dinner in the setting of Beaty and the Beast"),
		GASTONS_TAVERN("Gaston's Tavern", "LeFou's brew - specialty punch, sandwiches and cinnamon rolls"),
		CHESHIRE_CAFE("Cheshire Café",
				"Wonderland Slush, Cheshire Cat Tail pastry, iced coffee, frozen lemonades and snacks"),
		PRINCE_ERICS_VILLAGE_MARKET("Prince Eric's Village Market", "Jumbo pretzels, turkey legs and mermaid donuts");
		String fantasylandName;
		String fantasylandDescription;

		fantasylandRestaurants(String name, String description) {
			this.fantasylandName = name;
			this.fantasylandDescription = description;
		}
	}
}