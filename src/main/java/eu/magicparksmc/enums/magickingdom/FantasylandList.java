package eu.magicparksmc.enums.magickingdom;

public class FantasylandList {
	enum fantasyland {
		BIBBIDI_BOBBIDI_BOUTIQUE("Bibbidi Bobbidi Boutique"), BIG_TOP_SOUVENIRS("Big Top Souvenirs"),
		FANTASY_FAIRE("Fantasy Faire");
		String fantasylandName;

		fantasyland(String name) {
			this.fantasylandName = name;
		}
	}

	enum fantasylandRides {
		ITS_A_SMALL_WORLD("'it's a small world'"), PETER_PANS_FLIGHT("Peter Pan's Flight"),
		PRINCE_CHARMING_CARROUSEL("Prince Charming Regal Carrousel"),
		WINNIE_THE_POOH("The Many Adventures of Winnie the Pooh"), MAD_TEA_PARTY("Mad Tea Party"),
		SEVEN_DWARFS_MINE_TRAIN("Seven Dwarfs Mine Train"),
		JOURNEY_OF_THE_LITTLE_MERMAID("Under the Sea - Journey of the Little Mermaid"),
		DUMBO_THE_FLYING_ELEPHANT("Dumbo the Flying Elephant"), BARNSTORMER("The Barnstormer");
		String fantasylandName;

		fantasylandRides(String name) {
			this.fantasylandName = name;
		}
	}

	enum fantasylandAttractions {
		MICKEYS_PHILHARMAGIC("Mickey's PhilharMagic"), ENCHANTED_TALES_WITH_BELLE("Enchanted Tales with Belle"),
		PRINCESS_FAIRYTALE_HALL("Princess Fairytale Hall"), FAIRYTALE_GARDEN("Fairytale Garden"),
		ARIELS_GROTTO("Ariels Grotto"), SPLASH_N_SOAK_STATION("Casey Jr. Splash 'N' Soak Station"),
		PETES_SILLY_SIDESHOW("Pete's Silly Sideshow");
		String fantasylandName;

		fantasylandAttractions(String name) {
			this.fantasylandName = name;
		}
	}

	enum fantasylandRestaurants {
		PINOCCHIO_VILLAGE_HAUS("Pinocchio Village Haus"), CINDERELLAS_ROYAL_TABLE("Cinderella's Royal Table"),
		THE_FRIARS_NOOK("The Friars Nook"), STORYBOOK_TREATS("Storybook Treats"),
		BE_OUR_GUEST("Be Our Guest Restaurant"), GASTONS_TAVERN("Gaston's Tavern"), CHESHIRE_CAFE("Cheshire Café"),
		PRINCE_ERICS_VILLAGE_MARKET("Prince Eric's Village Market");
		String fantasylandName;

		fantasylandRestaurants(String name) {
			this.fantasylandName = name;
		}
	}
}