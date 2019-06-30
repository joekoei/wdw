package eu.magicparksmc.enums.magickingdom;

public class TomorrowlandList {
	enum tomorrowland {
		STAR_TRADERS("Mickey's Star Traders", "On-trend apparel and souvenirs inspired by Disney Characters");
		String tomorrowlandName;
		String tomorrowlandDescription;

		tomorrowland(String name, String description) {
			this.tomorrowlandName = name;
			this.tomorrowlandDescription = description;
		}
	}

	enum tomorrowlandRides {
		TOMORROWLAND_SPEEDWAY("Tomorrowland Speedway", "Take a ride in your very own hot rod"),
		SPACE_MOUNTAIN("Space Mountain", "Blast off on this coaster ride in the dark"),
		ASTRO_ORBITER("Astro Orbiter", "Pilot your own spaceship high above Tomorrowland"),
		PEOPLEMOVER("Tomorrowland Transit Authority PeopleMover",
				"Ride this emission-free mass transit system of the future"),
		SPACE_RANGER_SPIN("Buzz Lightyear's Space Ranger Spin",
				"Fire lasers to defeat Zurg in this shooting gallery-inspired game");
		String tomorrowlandName;
		String tomorrowlandDescription;

		tomorrowlandRides(String name, String description) {
			this.tomorrowlandName = name;
			this.tomorrowlandDescription = description;
		}
	}

	enum tomorrowlandAttractions {
		CARROUSEL_OF_PROGRESS("Walt Disney's Carrousel of Progress",
				"Travel through the 20th century to see how technology has improved our way of life"),
		MONSTERS_INC_LAUGH_FLOOR("Monsters, Inc. Laugh Floor",
				"Discover the power of laughter in this live comedy show with audience participation");
		String tomorrowlandName;
		String tomorrowlandDescription;

		tomorrowlandAttractions(String name, String description) {
			this.tomorrowlandName = name;
			this.tomorrowlandDescription = description;
		}
	}

	enum tomorrowlandRestaurants {
		STARLIGHT_CAFE("Cosmic Ray's Starlight Café", "Burgers, chicken breast nuggets, pulled pork and salad"),
		GALACTIC_GOODIES("Auntie Gravity's Galactic Goodies", "Ice cream, smoothies, milkshakes and sundaes"),
		COOL_SHIP("Cool Ship", "Snacks and beverages"),
		THE_LUNCHING_PAD("The Lunching Pad", "All-beef hot dogs, pretzels and Space Ranger Slush"),
		TERRACE_RESTAURANT("Tomorrowland Terrace Restaurant", "Burgers, chicken breast tenders, sandwiches and salads");
		String tomorrowlandName;
		String tomorrowlandDescription;

		tomorrowlandRestaurants(String name, String description) {
			this.tomorrowlandName = name;
			this.tomorrowlandDescription = description;
		}
	}
}