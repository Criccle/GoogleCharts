// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package restservices.proxies;

/**
 * 
 */
public class Primitive extends restservices.proxies.AnyObject
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RestServices.Primitive";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		PrimitiveType("PrimitiveType"),
		StringValue("StringValue"),
		NumberValue("NumberValue"),
		BooleanValue("BooleanValue");

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

	public Primitive(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RestServices.Primitive"));
	}

	protected Primitive(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject primitiveMendixObject)
	{
		super(context, primitiveMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("RestServices.Primitive", primitiveMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RestServices.Primitive");
	}

	/**
	 * @deprecated Use 'Primitive.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static restservices.proxies.Primitive initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return restservices.proxies.Primitive.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static restservices.proxies.Primitive initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new restservices.proxies.Primitive(context, mendixObject);
	}

	public static restservices.proxies.Primitive load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return restservices.proxies.Primitive.initialize(context, mendixObject);
	}

	/**
	 * Set value of PrimitiveType
	 * @param primitivetype
	 */
	public final restservices.proxies.RestPrimitiveType getPrimitiveType()
	{
		return getPrimitiveType(getContext());
	}

	/**
	 * @param context
	 * @return value of PrimitiveType
	 */
	public final restservices.proxies.RestPrimitiveType getPrimitiveType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.PrimitiveType.toString());
		if (obj == null)
			return null;

		return restservices.proxies.RestPrimitiveType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of PrimitiveType
	 * @param primitivetype
	 */
	public final void setPrimitiveType(restservices.proxies.RestPrimitiveType primitivetype)
	{
		setPrimitiveType(getContext(), primitivetype);
	}

	/**
	 * Set value of PrimitiveType
	 * @param context
	 * @param primitivetype
	 */
	public final void setPrimitiveType(com.mendix.systemwideinterfaces.core.IContext context, restservices.proxies.RestPrimitiveType primitivetype)
	{
		if (primitivetype != null)
			getMendixObject().setValue(context, MemberNames.PrimitiveType.toString(), primitivetype.toString());
		else
			getMendixObject().setValue(context, MemberNames.PrimitiveType.toString(), null);
	}

	/**
	 * @return value of StringValue
	 */
	public final String getStringValue()
	{
		return getStringValue(getContext());
	}

	/**
	 * @param context
	 * @return value of StringValue
	 */
	public final String getStringValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.StringValue.toString());
	}

	/**
	 * Set value of StringValue
	 * @param stringvalue
	 */
	public final void setStringValue(String stringvalue)
	{
		setStringValue(getContext(), stringvalue);
	}

	/**
	 * Set value of StringValue
	 * @param context
	 * @param stringvalue
	 */
	public final void setStringValue(com.mendix.systemwideinterfaces.core.IContext context, String stringvalue)
	{
		getMendixObject().setValue(context, MemberNames.StringValue.toString(), stringvalue);
	}

	/**
	 * @return value of NumberValue
	 */
	public final Double getNumberValue()
	{
		return getNumberValue(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberValue
	 */
	public final Double getNumberValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Double) getMendixObject().getValue(context, MemberNames.NumberValue.toString());
	}

	/**
	 * Set value of NumberValue
	 * @param numbervalue
	 */
	public final void setNumberValue(Double numbervalue)
	{
		setNumberValue(getContext(), numbervalue);
	}

	/**
	 * Set value of NumberValue
	 * @param context
	 * @param numbervalue
	 */
	public final void setNumberValue(com.mendix.systemwideinterfaces.core.IContext context, Double numbervalue)
	{
		getMendixObject().setValue(context, MemberNames.NumberValue.toString(), numbervalue);
	}

	/**
	 * @return value of BooleanValue
	 */
	public final Boolean getBooleanValue()
	{
		return getBooleanValue(getContext());
	}

	/**
	 * @param context
	 * @return value of BooleanValue
	 */
	public final Boolean getBooleanValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.BooleanValue.toString());
	}

	/**
	 * Set value of BooleanValue
	 * @param booleanvalue
	 */
	public final void setBooleanValue(Boolean booleanvalue)
	{
		setBooleanValue(getContext(), booleanvalue);
	}

	/**
	 * Set value of BooleanValue
	 * @param context
	 * @param booleanvalue
	 */
	public final void setBooleanValue(com.mendix.systemwideinterfaces.core.IContext context, Boolean booleanvalue)
	{
		getMendixObject().setValue(context, MemberNames.BooleanValue.toString(), booleanvalue);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final restservices.proxies.Primitive that = (restservices.proxies.Primitive) obj;
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
		return "RestServices.Primitive";
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
