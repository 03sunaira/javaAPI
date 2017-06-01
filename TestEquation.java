class TestEquation
{
	public static void main(String [] args)
	{
		// creating the object of ChemistryEquation in order to access the methods of that class.
		ChemistryEquation ce = new ChemistryEquation();
		// printing the result by calling the method and passing appropriate arguments.
		System.out.println("Pressure is:" + ce.IdealGas(23,5,8.314,33));
	}
}