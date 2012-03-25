/*
 * Copyright (c) 2010-2011 lichengwu
 * All rights reserved.
 * 
 */
package com.meituan.gaara.info;

import java.util.List;

import org.junit.Test;

import com.meituan.gaara.test.BaseTest;

/**
 *
 * @author lichengwu
 * @created 2012-3-23
 *
 * @version 1.0
 */
public class JavaVirtualMachineInfoTest extends BaseTest{

	/**
	 * JVM args:-XX:+UseConcMarkSweepGC
	 * 
	 * @author lichengwu
	 * @created 2012-3-23
	 *
	 */
	@Test
	public void test() {
		 JavaVirtualMachineInfo jvm = JavaVirtualMachineInfo.getInstance();
		List<ThreadDetails> threadInfoList = jvm.getThreadInfoList();
		for(ThreadDetails detail : threadInfoList){
			System.out.println(detail);
		}
		System.out.println(jvm.getSystemPorpterties());
		System.out.println(jvm.getPID());
		
	}

}
