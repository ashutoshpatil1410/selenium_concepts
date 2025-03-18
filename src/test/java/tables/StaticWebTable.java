package tables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StaticWebTable {

	public static void main(String[] args) 
	{
		try {
			WebDriver driver=new EdgeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			//find total number of rows
			int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//7
			System.out.println(rows);
			
			
			//find total number of columns
			int cols=driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]/td")).size();//4
			System.out.println(cols);
			
			
			//Read Data from all the rows and columns
			/*for(int r=2;r<=rows;r++)
			{
				
				for(int c=1;c<=cols;c++)
				{
					String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
					//we can't pass variables in xpath directly we have to modification
					System.out.print(value);
					System.out.print("\t");
				}
				System.out.println();
			}*/
			
			
			//Conditional based by author name
			/*for(int r=2;r<rows;r++)
			{
				String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
				//Here we want column same and rows need change
				
				if(author.equals("Mukesh"))
				{
					String Bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
					System.out.println(Bookname+"\t"+author);
				}
				
			}*/
			
			//Total price of the books
			int totalprice=0;
			for(int r=2;r<=rows;r++)
			{
				String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
				totalprice=totalprice+Integer.parseInt(price);
			}
			System.out.println(totalprice);//7100
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
