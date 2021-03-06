/*
Pulsar
Copyright (C) 2013-2015 eBay Software Foundation
Licensed under the GPL v2 license.  See LICENSE for full terms.
*/
package com.ebay.jetstream.event.processor.esper.annotation;

public @interface ClusterAffinityTag {

	String colname() default "";
	CreateDimension dimension() default @CreateDimension();
}
