package com.interviewquestions62streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class FindOutAverageQuestions45 {
	
	public static void main(String[] args) {
		
		Product p1=new Product(1,"lifeBoy",20,"soap");
		Product p2=new Product(2,"protinics",200,"adapter");
		Product p3=new Product(3,"Surfexcel",90,"Washing powder");
		Product p4=new Product(4,"yamha",20,"Guter");
		Product p5=new Product(5,"pantajali",20,"Book");
		
		List<Product> productList = Arrays.asList(p1,p2,p3,p4,p5);
		
		
		//1 print the names of products whose price is below  a certailian threshhold 500
	 List<String> collect = productList.stream().filter(x->x.getPrice()<100).map(x->x.getName()).collect(Collectors.toList());
     System.out.println(collect);
     
     
    // ) Create a new list containing products with a price reduction of 20%.
     
                     List<Product> collect2 = productList.stream().map(
                               product->{
                            	   double discountprice=product.getPrice()*0.80;
                            	   product.setPrice(discountprice);
                            	   return product;
                               }
                    		 ).collect(Collectors.toList());
                     System.out.println(collect2);
     
    // 3) Calculate the average price of all products.
                     //Using optional 
                      OptionalDouble average = productList.stream().mapToDouble(Product::getPrice).average(); 
                      if(average.isPresent()) {
                    	  System.out.println(average);
                      }else {
                    	  System.out.println("no data");
                      }
                      
              double asDouble = productList.stream().mapToDouble(Product::getPrice).average().getAsDouble();
                    System.out.println(asDouble);
                     
    // 4) Find the product with the lowest price using Stream API.
                    
         Optional<Product> min = productList.stream().min((x1,x2)->Double.compare(x1.getPrice(), x2.getPrice()));
            if(min.isPresent()) {
            	System.out.println(min.get());
            }else {
            	System.out.println("NUll");
            }
               
                    
	}

}
