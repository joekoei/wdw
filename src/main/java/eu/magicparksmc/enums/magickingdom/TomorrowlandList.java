package eu.magicparksmc.enums.magickingdom;

public class TomorrowlandList {
	enum tomorrowland {
		STAR_TRADERS("Mickey's Star Traders");
		String tomorrowlandName;

		tomorrowland(String name) {
			this.tomorrowlandName = name;
		}
	}

	enum tomorrowlandRides {
		TOMORROWLAND_SPEEDWAY("Tomorrowland Speedway"), SPACE_MOUNTAIN("Space Mountain"),
		ASTRO_ORBITER("Astro Orbiter"), PEOPLEMOVER("Tomorrowland Transit Authority PeopleMover"),
		SPACE_RANGER_SPIN("Buzz Lightyear's Space Ranger Spin");
		String tomorrowlandName;

		tomorrowlandRides(String name) {
			this.tomorrowlandName = name;
		}
	}

	enum tomorrowlandAttractions {
		CARROUSEL_OF_PROGRESS("Walt Disney's Carrousel of Progress"),
		MONSTERS_INC_LAUGH_FLOOR("Monsters, Inc. Laugh Floor");
		String tomorrowlandName;

		tomorrowlandAttractions(String name) {
			this.tomorrowlandName = name;
		}
	}

	enum tomorrowlandRestaurants {
		STARLIGHT_CAFE("Cosmic Ray's Starlight Café"), GALACTIC_GOODIES("Auntie Gravity's Galactic Goodies"),
		COOL_SHIP("Cool Ship"), THE_LUNCHING_PAD("The Lunching Pad"),
		TERRACE_RESTAURANT("Tomorrowland Terrace Restaurant");
		String tomorrowlandName;

		tomorrowlandRestaurants(String name) {
			this.tomorrowlandName = name;
		}
	}
}