// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package mxmodelreflection.proxies;

/**
 * 
 */
public class Microflows
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject microflowsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MxModelReflection.Microflows";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Module("Module"),
		CompleteName("CompleteName"),
		Microflows_InputParameter("MxModelReflection.Microflows_InputParameter"),
		Microflows_Output_Type("MxModelReflection.Microflows_Output_Type"),
		Microflows_Module("MxModelReflection.Microflows_Module");

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

	public Microflows(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MxModelReflection.Microflows"));
	}

	protected Microflows(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject microflowsMendixObject)
	{
		if (microflowsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MxModelReflection.Microflows", microflowsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MxModelReflection.Microflows");

		this.microflowsMendixObject = microflowsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Microflows.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static mxmodelreflection.proxies.Microflows initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return mxmodelreflection.proxies.Microflows.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static mxmodelreflection.proxies.Microflows initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new mxmodelreflection.proxies.Microflows(context, mendixObject);
	}

	public static mxmodelreflection.proxies.Microflows load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return mxmodelreflection.proxies.Microflows.initialize(context, mendixObject);
	}

	public static java.util.List<mxmodelreflection.proxies.Microflows> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.Microflows> result = new java.util.ArrayList<mxmodelreflection.proxies.Microflows>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MxModelReflection.Microflows" + xpathConstraint))
			result.add(mxmodelreflection.proxies.Microflows.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Module
	 */
	public final String getModule()
	{
		return getModule(getContext());
	}

	/**
	 * @param context
	 * @return value of Module
	 */
	public final String getModule(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Module.toString());
	}

	/**
	 * Set value of Module
	 * @param module
	 */
	public final void setModule(String module)
	{
		setModule(getContext(), module);
	}

	/**
	 * Set value of Module
	 * @param context
	 * @param module
	 */
	public final void setModule(com.mendix.systemwideinterfaces.core.IContext context, String module)
	{
		getMendixObject().setValue(context, MemberNames.Module.toString(), module);
	}

	/**
	 * @return value of CompleteName
	 */
	public final String getCompleteName()
	{
		return getCompleteName(getContext());
	}

	/**
	 * @param context
	 * @return value of CompleteName
	 */
	public final String getCompleteName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.CompleteName.toString());
	}

	/**
	 * Set value of CompleteName
	 * @param completename
	 */
	public final void setCompleteName(String completename)
	{
		setCompleteName(getContext(), completename);
	}

	/**
	 * Set value of CompleteName
	 * @param context
	 * @param completename
	 */
	public final void setCompleteName(com.mendix.systemwideinterfaces.core.IContext context, String completename)
	{
		getMendixObject().setValue(context, MemberNames.CompleteName.toString(), completename);
	}

	/**
	 * @return value of Microflows_InputParameter
	 */
	public final java.util.List<mxmodelreflection.proxies.Parameter> getMicroflows_InputParameter() throws com.mendix.core.CoreException
	{
		return getMicroflows_InputParameter(getContext());
	}

	/**
	 * @param context
	 * @return value of Microflows_InputParameter
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<mxmodelreflection.proxies.Parameter> getMicroflows_InputParameter(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<mxmodelreflection.proxies.Parameter> result = new java.util.ArrayList<mxmodelreflection.proxies.Parameter>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.Microflows_InputParameter.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(mxmodelreflection.proxies.Parameter.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of Microflows_InputParameter
	 * @param microflows_inputparameter
	 */
	public final void setMicroflows_InputParameter(java.util.List<mxmodelreflection.proxies.Parameter> microflows_inputparameter)
	{
		setMicroflows_InputParameter(getContext(), microflows_inputparameter);
	}

	/**
	 * Set value of Microflows_InputParameter
	 * @param context
	 * @param microflows_inputparameter
	 */
	public final void setMicroflows_InputParameter(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<mxmodelreflection.proxies.Parameter> microflows_inputparameter)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (mxmodelreflection.proxies.Parameter proxyObject : microflows_inputparameter)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.Microflows_InputParameter.toString(), identifiers);
	}

	/**
	 * @return value of Microflows_Output_Type
	 */
	public final mxmodelreflection.proxies.ValueType getMicroflows_Output_Type() throws com.mendix.core.CoreException
	{
		return getMicroflows_Output_Type(getContext());
	}

	/**
	 * @param context
	 * @return value of Microflows_Output_Type
	 */
	public final mxmodelreflection.proxies.ValueType getMicroflows_Output_Type(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.ValueType result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Microflows_Output_Type.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.ValueType.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Microflows_Output_Type
	 * @param microflows_output_type
	 */
	public final void setMicroflows_Output_Type(mxmodelreflection.proxies.ValueType microflows_output_type)
	{
		setMicroflows_Output_Type(getContext(), microflows_output_type);
	}

	/**
	 * Set value of Microflows_Output_Type
	 * @param context
	 * @param microflows_output_type
	 */
	public final void setMicroflows_Output_Type(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.ValueType microflows_output_type)
	{
		if (microflows_output_type == null)
			getMendixObject().setValue(context, MemberNames.Microflows_Output_Type.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Microflows_Output_Type.toString(), microflows_output_type.getMendixObject().getId());
	}

	/**
	 * @return value of Microflows_Module
	 */
	public final mxmodelreflection.proxies.Module getMicroflows_Module() throws com.mendix.core.CoreException
	{
		return getMicroflows_Module(getContext());
	}

	/**
	 * @param context
	 * @return value of Microflows_Module
	 */
	public final mxmodelreflection.proxies.Module getMicroflows_Module(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		mxmodelreflection.proxies.Module result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Microflows_Module.toString());
		if (identifier != null)
			result = mxmodelreflection.proxies.Module.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Microflows_Module
	 * @param microflows_module
	 */
	public final void setMicroflows_Module(mxmodelreflection.proxies.Module microflows_module)
	{
		setMicroflows_Module(getContext(), microflows_module);
	}

	/**
	 * Set value of Microflows_Module
	 * @param context
	 * @param microflows_module
	 */
	public final void setMicroflows_Module(com.mendix.systemwideinterfaces.core.IContext context, mxmodelreflection.proxies.Module microflows_module)
	{
		if (microflows_module == null)
			getMendixObject().setValue(context, MemberNames.Microflows_Module.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Microflows_Module.toString(), microflows_module.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return microflowsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final mxmodelreflection.proxies.Microflows that = (mxmodelreflection.proxies.Microflows) obj;
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
		return "MxModelReflection.Microflows";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
