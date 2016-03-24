// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package googlecharts.proxies;

/**
 * 
 */
public class IntegerValue extends googlecharts.proxies.Cell
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GoogleCharts.IntegerValue";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		v("v");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public IntegerValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "GoogleCharts.IntegerValue"));
	}

	protected IntegerValue(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject integerValueMendixObject)
	{
		super(context, integerValueMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("GoogleCharts.IntegerValue", integerValueMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a GoogleCharts.IntegerValue");
	}

	/**
	 * @deprecated Use 'IntegerValue.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static googlecharts.proxies.IntegerValue initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return googlecharts.proxies.IntegerValue.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static googlecharts.proxies.IntegerValue initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new googlecharts.proxies.IntegerValue(context, mendixObject);
	}

	public static googlecharts.proxies.IntegerValue load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return googlecharts.proxies.IntegerValue.initialize(context, mendixObject);
	}

	/**
	 * @return value of v
	 */
	public final Integer getv()
	{
		return getv(getContext());
	}

	/**
	 * @param context
	 * @return value of v
	 */
	public final Integer getv(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.v.toString());
	}

	/**
	 * Set value of v
	 * @param v
	 */
	public final void setv(Integer v)
	{
		setv(getContext(), v);
	}

	/**
	 * Set value of v
	 * @param context
	 * @param v
	 */
	public final void setv(com.mendix.systemwideinterfaces.core.IContext context, Integer v)
	{
		getMendixObject().setValue(context, MemberNames.v.toString(), v);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final googlecharts.proxies.IntegerValue that = (googlecharts.proxies.IntegerValue) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "GoogleCharts.IntegerValue";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Override
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
