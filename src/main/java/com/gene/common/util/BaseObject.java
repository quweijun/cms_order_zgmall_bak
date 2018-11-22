package com.gene.common.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import java.io.Serializable;

/**
 * 
 * @author:		Jackie Wang 
 * @since:		2017-09-18
 * @modified:	2017-09-18
 * @version:	
 */
public abstract class BaseObject implements Serializable {
	
	private static final long serialVersionUID = -3171606573299156035L;

	public String toString()
	{
		// TODO reference by self should be filter
		return JSON.toJSONString(this,
					SerializerFeature.DisableCircularReferenceDetect,
					SerializerFeature.WriteDateUseDateFormat,
					SerializerFeature.SkipTransientField,
					SerializerFeature.SortField);
	}

	public boolean equals(Object obj)
	{
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(this);
	}

}
