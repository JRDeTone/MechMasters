package MechSystems;

/**
 * Interface for Ammo system.  MechWeapon Class and extended subclasses implement this interface.
 */
public interface AmmoSystem {
	/**
	 * The getAmmoAmount method should be implemented to return ammo amount as an int.
	 */
	public int getAmmoAmount();
	/**
	 * The setAmmmoAmount method should be implemented to set the ammo amount as an int.
	 */
	public void setAmmoAmount(int inputAmmoAmount);
	/**
	 * The getAmmoType method should be implemented to return the ammo type as an int.
	 */
	public int getAmmoType();
	/**
	 * The setAmmoType method should be implemented to set the ammo type as an int.
	 */
	public void setAmmoType(int inputAmmoType);

}
