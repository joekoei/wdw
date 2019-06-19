package eu.magicparksmc.enums.resorts;

public class ResortsList {
    enum wideWorldSportsResorts {
        POP_CENTURY_RESORT("Disney's Pop Century Resort"), ANIMATION_RESORT("Disney's Art of Animation Resort");
        String wideWorldSportsResortsName;

        wideWorldSportsResorts(String name) {
            this.wideWorldSportsResortsName = name;
        }
    }

    enum epcotResorts {
        CARIBBEAN_BEACH_RESORT("Disney's Caribbean Beach Resort"), BEACH_CLUB_RESORT("Disney's Beach Club Resort"),
        YACHT_CLUB_RESORT("Disney's Yacht Club Resort"), BOARDWALK_INN("Disney's BoardWalk Inn"),
        BOARDWALK_VILLAS("Disney's BoardWalk Villas"), BEACH_CLUB_VILLAS("Disney's Beach Club Villas"),
        RIVIERA_RESORT("Disney's Riviera Resort"), DOLPHIN_HOTEL("Walt Disney World Dolphin Hotel"),
        SWAN_HOTEL("Walt Disney World Swan Hotel");
        String epcotResortsName;

        epcotResorts(String name) {
            this.epcotResortsName = name;
        }
    }

    enum animalKingdomResorts {
        ANIMAL_KINGDOM_LODGE("Disney's Animal Kingdom Lodge"), MUSIC_RESORT("Disney's All-Star Music Resort"),
        MOVIES_RESORT("Disney's All-Star Movies Resort"), CORONADO_SPRINGS_RESORT("Disney's Coronado Springs Resort"),
        SPORTS_RESORT("Disney's All-Star Sports Resort"),
        KIDANI_VILLAGE("Disney's Animal Kingdom Villas - Kidani Village"),
        JAMBO_HOUSE("Disney's Animal Kingdom Lodge - Jambo House");
        String animalKingdomResortsName;

        animalKingdomResorts(String name) {
            this.animalKingdomResortsName = name;
        }
    }

    enum disneySpringsResorts {
        SARATOGA_SPRINGS_RESORT("Disney's Saratoga Springs Resort & Spa"),
        PORT_ORLEANS_RESORT_RIVERSIDE("Disney's Port Orleans Resort - Riverside"),
        PORT_ORLEANS_RESORT_FRENCH("Disney's Port Orleans Resort - French Quarter"),
        OLD_KEY_WEST_RESORT("Disney's Old Key West Resort");
        String disneySpringsResortsName;

        disneySpringsResorts(String name) {
            this.disneySpringsResortsName = name;
        }
    }

    enum magicKingdomResorts {
        POLYNESIAN_VILLAGE_RESORT("Disney's Polynesian Village Resort"),
        GRAND_FLORIDIAN_RESORT("Disney's Grand Floridian Resort & Spa"), WILDERNESS_LODGE("Disney's Wilderness Lodge"),
        CONTEMPORARY_RESORT("Disney's Contemporary Resort"),
        POLYNESIAN_VILLAS_BUNGALOWS("Disney's Polynesian Villas & Bungalows"),
        BAY_LAKE_TOWER("Bay Lake Tower - Disney's Contemporary Resort"),
        THE_VILLAS("The Villas - Disney's Grand Floridian Resort & Spa"),
        THE_CABINS("The Cabins - Disney's Fort Wilderness Resort"),
        BOULDER_RIDGE_VILLAS("Boulder Ridge Villas - Disney's Wilderness Lodge"),
        THE_CAMPSITES("The Campsites - Disney's Fort Wilderness Resort"),
        COPPER_CREEK_VILLAS_CABINS("Copper Creek Villas & Cabins - Disney's Wilderness Lodge");
        String magicKingdomResortsName;

        magicKingdomResorts(String name) {
            this.magicKingdomResortsName = name;
        }
    }

    enum waltDisneyWorldResorts {
        FOUR_SEASONS("Four Seasons Resort Orlando - Walt Disney World");
        String waltDisneyWorldResortsName;

        waltDisneyWorldResorts(String name) {
            this.waltDisneyWorldResortsName = name;
        }
    }

    enum extraDisneySpringsResorts {
        BEST_WESTERN("Best Western - Lake Buena Vista"), B_RESORT_SPA("B Resort & Spa - Lake Buena Vista"),
        DOUBLETREE_SUITES("DoubleTree Suites - Hilton Orlando"),
        HILTON_PALACE_ORLANDO("Hilton Orlando - Buena Vista Palace"),
        HILTON_ORLANDO("Hilton Orlando - Lake Buena Vista"), HOLIDAY_INN("Holiday Inn - Orlando"),
        WYNDHAM_GARDEN("Wyndham Garden - Lake Buena Vista"), WYNDHAM("Wyndham - Lake Buena Vista");
        String disneySpringsResortsName;

        extraDisneySpringsResorts(String name) {
            this.disneySpringsResortsName = name;
        }
    }
}
