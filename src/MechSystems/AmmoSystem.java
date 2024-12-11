package MechSystems;

/**
 * Interface for Ammo system to be used by {@code mechEquipment} subclasses that require some kind of usage amount.
 */
public interface AmmoSystem {
	/**
	 * Should be implemented to return ammo amount as an int.
	 */
	public int getAmmoAmount();
	/**
	 * Should be implemented to set the ammo amount as an int.
	 * @param inputAmmoAmount Amount of ammo based on passed int.
	 */
	public void setAmmoAmount(int inputAmmoAmount);
	/**
	 * Should be implemented to return the ammo type as an int.
	 */
	public int getAmmoType();
	/**
	 * Should be implemented to set the ammo type as an int.
	 * @param inputAmmoType Amount of ammo type based on passed in int.
	 */
	public void setAmmoType(int inputAmmoType);

}
