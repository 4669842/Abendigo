package org.abendigo.csgo

enum class Weapons(val id: Int, val automatic: Boolean = false, val grenade: Boolean = false,
                   val knife: Boolean = false, val sniper: Boolean = false, val boltAction: Boolean = false,
                   val pistol: Boolean = false, val shotgun: Boolean = false) {

	DESERT_EAGLE(1, pistol = true),
	FIVE_SEVEN(3, pistol = true),
	GLOCK(4, pistol = true),
	AK47(7, automatic = true),
	AUG(8, automatic = true),
	AWP(9, sniper = true, boltAction = true),
	FAMAS(10, automatic = true),
	G3SG1(11, sniper = true),
	GALIL(13, automatic = true),
	M249(14, automatic = true),
	M4A4(16, automatic = true),
	MAC10(17, automatic = true),
	P90(19, automatic = true),
	UMP45(24, automatic = true),
	XM1014(25, shotgun = true),
	PP_BIZON(26, automatic = true),
	MAG7(27, boltAction = true, shotgun = true),
	NEGEV(28, automatic = true),
	SAWED_OFF(29, boltAction = true, shotgun = true),
	TEC9(30, pistol = true),
	ZEUS_X27(31),
	P2000(32, pistol = true),
	MP7(33, automatic = true),
	MP9(34, automatic = true),
	NOVA(35, boltAction = true, shotgun = true),
	P250(36, pistol = true),
	SCAR20(38, sniper = true),
	SG556(39, automatic = true),
	SSG08(40, sniper = true, boltAction = true),
	KNIFE(42, knife = true),
	FLASH_GRENADE(43, grenade = true),
	EXPLOSIVE_GRENADE(44, grenade = true),
	SMOKE_GRENADE(45, grenade = true),
	MOLOTOV(46, grenade = true),
	DECOY_GRENADE(47, grenade = true),
	INCENDIARY_GRENADE(48, grenade = true),
	C4(49),
	KNIFE_T(59, knife = true),
	M4A1_SILENCER(60, automatic = true),
	USP_SILENCER(61, pistol = true),
	CZ75A(63, automatic = true, pistol = true),
	R8_REVOLVER(64, boltAction = true, pistol = true),
	KNIFE_BAYONET(500, knife = true),
	KNIFE_FLIP(505, knife = true),
	KNIFE_GUT(506, knife = true),
	KNIFE_KARAMBIT(507, knife = true),
	KNIFE_M9_BAYONET(508, knife = true),
	KNIFE_TACTICAL(509, knife = true),
	KNIFE_TALCHION(512, knife = true),
	KNIFE_BOWIE(514, knife = true),
	KNIFE_BUTTERFLY(515, knife = true),
	KNIFE_PUSH(516, knife = true);

	companion object {

		private val cachedValues = values()

		fun byID(id: Int) = cachedValues.firstOrNull { it.id == id }

	}

}