/**
 * The ChemistryEquation class represents chemistry equations.
 * IdealGase equation is implemented as method of this class.
 * @author Sunaira Memon - 14SW03
 * @since JDK1.8
 */

class ChemistryEquation
{
	/** These values are used for equation. */
	private double pressure;
	private float volume;
	private float noOfSubstance;
	private float temperature;
    /** This value will not be changed as it is constant. */
    final double GasConstant = 8.314;  // in J/(K-mol)

	/**
	     * Uses the param values v for volume, n as noOfSubstance, t as temperature, and R as Gas Constant to calculate the value of pressure.
	     * This method doesn't perform any range checking.
	     * Params are used to calculate pressure
	     * @param      v     The value of volume
	     * @param      n     The value of no Of Substance
	     * @param      R     The value of Gas Constant
	     * @param      t     The value of temperature
     */
	public double IdealGas(float v, float n,double R, float t)
	{
		this.volume = v;
		this.noOfSubstance = n;
		this.temperature = t;
		this.pressure = (this.noOfSubstance * this.GasConstant * this.temperature) / this.volume;
		return this.pressure;
	}
}

