package com.crowley.encryption;

import java.io.File;

import junit.framework.Assert;

import org.junit.Test;

public class SHAUtilsTest {

	@Test
	public void testGetSHAWithDefaultAlgorithm() {
		Assert.assertEquals("F96B2C977860F78E6A090823DF5A659E2BFF1A92", SHAUtils.getSHA("Crowley"));
		Assert.assertEquals("E43A17754A47CB54C3D815C67FF554263CEB79CA", SHAUtils.getSHA("shumanchang826@gmail.com"));
		Assert.assertEquals("2035CF452AB2C8A71FD61DAD62665EF5DE4CA7AA", SHAUtils.getSHA("5542356543215641"));
	}
	
	@Test
	public void testGetSHA1() {
		Assert.assertEquals("F96B2C977860F78E6A090823DF5A659E2BFF1A92", SHAUtils.getSHA(SHAUtils.SHA_1, "Crowley"));
		Assert.assertEquals("E43A17754A47CB54C3D815C67FF554263CEB79CA", SHAUtils.getSHA(SHAUtils.SHA_1, "shumanchang826@gmail.com"));
		Assert.assertEquals("2035CF452AB2C8A71FD61DAD62665EF5DE4CA7AA", SHAUtils.getSHA(SHAUtils.SHA_1, "5542356543215641"));
	}
	
	@Test
	public void testGetSHA256() {
		Assert.assertEquals("99A8A2314C3A7DD585C40DE19F8414AD4AA0A616ED01BB71419B316F72920A61", SHAUtils.getSHA(SHAUtils.SHA_256, "Crowley"));
		Assert.assertEquals("157F04E1D719354888C5FF7564D9BFDB088A22960DEF1AB61B21F76C4FD5A7EC", SHAUtils.getSHA(SHAUtils.SHA_256, "shumanchang826@gmail.com"));
		Assert.assertEquals("9BB469250B9EBAA67A7338B8A86339B6FF5D328E53A5877650DE54A428EA354E", SHAUtils.getSHA(SHAUtils.SHA_256, "5542356543215641"));
	}
	
	@Test
	public void testGetSHA384() {
		Assert.assertEquals("A11B71C9859493C937B24A8EFCE82899B6A8FBCEAA4EFB072A8DC534EB427AFADF77EA0C71EF9D7CBCEFDD7874544AC7", SHAUtils.getSHA(SHAUtils.SHA_384, "Crowley"));
		Assert.assertEquals("B368DC7F309341D1BE20F0B453DB3EA0B26B89820E5F00C2F928090A1BA30E19D72E66BFCF967C65C20D489239561A9C", SHAUtils.getSHA(SHAUtils.SHA_384, "shumanchang826@gmail.com"));
		Assert.assertEquals("71FD6F3C21F208D7D27486F52418DD0E6E5EADF7D4A079F7E2FFC5545B2EA0D6BCDB542F378F3C0CF7146648CA04CFBA", SHAUtils.getSHA(SHAUtils.SHA_384, "5542356543215641"));
	}
	
	
	@Test
	public void testGetSHA512() {
		Assert.assertEquals("E1724A97CE84AB646C8CD328F48C01206C359936436275B0DA3286AA424ABE2FAFC5BF196CCC8AE555F5BB2603AB04593E770A8E3BE194C940E93690C12C21C1", SHAUtils.getSHA(SHAUtils.SHA_512, "Crowley"));
		Assert.assertEquals("1A76E8F153F28977DD8D4CCEDFFA7EEEA047F861165F68B32EC7ED7DF4E14C97F4B6AE99F2D07A45BA1D899BB6A952B7410849F6782E6BEAB0BB02F28DBB766C", SHAUtils.getSHA(SHAUtils.SHA_512, "shumanchang826@gmail.com"));
		Assert.assertEquals("533163235226E3A8A535C519D312CB2B84B2C1EF2061E76D4E7BA55405BE8936CE04A81DCC647C70260749192EB6B6C32515954A6A9BDA9E415343F1792E4312", SHAUtils.getSHA(SHAUtils.SHA_512, "5542356543215641"));
	}
	
	@Test
	public void testGetFileSHA() {
		Assert.assertEquals("81A56878D2E702E0AE2A31AB89E892E5BCCC6AD1", SHAUtils.getSHA(SHAUtils.SHA_1, new File("D:\\Documents\\Downloads\\apache-tomcat-7.0.67.zip")));
	}
	
}