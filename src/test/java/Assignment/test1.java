package Assignment;
import java.io.IOException;

import org.testng.annotations.Test;

import BaseLayer.BaseClass;
public class test1 extends BaseClass {
	
	 
	@Test(priority=0)
	public void homePage() {
		BaseClass.inilization();
	}
	
	@Test(priority=1)
	public void searchpage() throws IOException {
		PageLayerClass.Searchpage sc= new PageLayerClass.Searchpage();
		UtilsLayer.ExcelSheetReader ex=new UtilsLayer.ExcelSheetReader();
		String w=ex.urlname();
		sc.search(w);
	}
	
	@Test(priority=2)
	public void amazonlogin() throws Exception {
		PageLayerClass.amazonlogin al= new PageLayerClass.amazonlogin();
		UtilsLayer.ExcelSheetReader ex=new UtilsLayer.ExcelSheetReader();
		String u=ex.username();
		String p=ex.password();
		al.login(u, p);
	}
	
	@Test(priority=3)
	public void electronic() throws Exception {
		PageLayerClass.searchele al= new PageLayerClass.searchele();
		UtilsLayer.ExcelSheetReader ex=new UtilsLayer.ExcelSheetReader();
		String s=ex.dpcnt();
		String c=ex.searchcnt();
		double ll=ex.lowpr();
		double hh=ex.highpr();
		al.elect(s,c,ll,hh);
	}
	
	@Test(priority=4)
	public void pricecheck() throws Exception {
		PageLayerClass.validate vl= new PageLayerClass.validate();
		vl.pricevalidate();
		vl.ratingvalidate();
	}
}
	
