package mainbeauty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MainBeauty {

    public static void main(String[] args) { //makeup
        Branding bd = new Branding("Fenty Beauty", "Maybelline", "MAC", "Revlon");
        HowToUseMakeUp h = new HowToUseMakeUp();
        WhereToBuy w = new WhereToBuy();
        
        bd.setMakeup("Lipstick ", "Eyeshadow ", "Mascara ", "Blusher ");
        
        //LIPSTICK
        System.out.println("Type of Makeup: " + bd.getLipstick());
        System.out.println("Brand that this type have: ");
        System.out.println(bd.getBrand1());
        System.out.println(bd.getBrand2());
        System.out.println(bd.getBrand3());
        System.out.println(bd.getBrand4());
        System.out.println("");
        h.UseLipstick(); //POLYMORPHISM
        System.out.println("");
        w.WhereToBuy(); //ABSTRACTION
        w.location();
        System.out.println("---------------------------------");
        
        //EYESHADOW
        System.out.println("Type of Makeup: " + bd.getEyeshadow());
        System.out.println("Brand that this type have: ");
        System.out.println(bd.getBrand1());
        System.out.println(bd.getBrand2());
        System.out.println(bd.getBrand3());
        System.out.println(bd.getBrand4());
        System.out.println("");
        h.UseEyeshadow(); //POLYMORPHISM
        System.out.println("");
        w.WhereToBuy(); //ABSTRACTION
        w.location();
        System.out.println("---------------------------------");
        
        //MASCARA
        System.out.println("Type of Makeup: " + bd.getMascara());
        System.out.println("Brand that this type have: ");
        System.out.println(bd.getBrand1());
        System.out.println(bd.getBrand2());
        System.out.println(bd.getBrand3());
        System.out.println(bd.getBrand4());
        System.out.println("");
        h.UseMascara(); //POLYMORPHISM
        System.out.println("");
        w.WhereToBuy(); //ABSTRACTION
        w.location();
        System.out.println("---------------------------------");
        
        System.out.println("Type of Makeup: " + bd.getBlusher());
        System.out.println("Brand that this type have: ");
        System.out.println(bd.getBrand1());
        System.out.println(bd.getBrand2());
        System.out.println(bd.getBrand3());
        System.out.println(bd.getBrand4());
        System.out.println("");
        h.UseBlusher(); //POLYMORPHISM
        System.out.println("");
        w.WhereToBuy(); //ABSTRACTION
        w.location();
        
//jewellery
        String num[]= {"Necklace","Earring","Bracelet","Ring"};//array
	
	
	System.out.println("---------------------------------------");
	necklace n= new necklace();
	earring e = new earring();
	Bracelet bt = new Bracelet();
	ring r = new ring();
        exception z = new exception();

        quote1 q = new quote1("WELCOME TO NMJ JEWELLERY");
	q.display();
	System.out.println("---------------------------------------");
	System.out.println("Enter your details for verification purpose");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your First Name:");
	String name = scan.next();
	System.out.println("Enter age:");
	String age = scan.next();
	System.out.println("Enter your contact number:");
	String number = scan.next();
	System.out.println("Enter your Nationality:");
	String nation = scan.next();
	System.out.println("Enter your IC/ Passport Number:");
	String ic = scan.next();
	System.out.println("Enter your Email Address:");
	String mail = scan.next();
	
	System.out.println("---------------------------------------");
	System.out.println("Customer Details:");
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Contact Number: "+number);
	System.out.println("Nationality: "+nation);
	System.out.println("Ic/ Passport Number: "+ic);
	System.out.println("Email ID: "+mail);
	System.out.println("---------------------------------------");
		System.out.println("Available products: ");
		System.out.println("---------------------------------------");
		System.out.println("1: " + num[0]+"\n2: " +num[1]+"\n3: " +num[2]+"\n4: " + num[3]);
		z.selection();
		
		System.out.println("\n---------------------------------------");
	System.out.println("HERE IS THE DESCRIPTION OF OUR PRODUCTS");
	System.out.println("---------------------------------------");
		System.out.println("Available Variety of Necklace: ");
		n.necklace();
		n.metal();
		n.run();
		
		System.out.println("\n---------------------------------------");
		System.out.println("Available Variety of Earring: ");
		e.earring();
		e.metal();
		e.run();
		
		System.out.println("\n---------------------------------------");
		System.out.println("Available Variety of Bracelets: ");
		bt.bracelet();
		bt.metal();
		bt.run();
		
		System.out.println("\n---------------------------------------");
		System.out.println("Available Variety of Ring: ");
		r.ring();
		bt.metal();
		r.run();
		System.out.println("------------------------------------------");

//perfume
        Perfume f = new Perfume("For Him", "For Her");
        priceOfPerfume p = new priceOfPerfume();
        onlineshop o = new onlineshop();
        PerfumeBrand b = new PerfumeBrand ("DKNY", "CK", "Victoria Secret", "Givenchy",
                                           "Bulgari", "Hugo Boss");
        System.out.println("Type of Perfume: " + f.getForMan());
        b.run();
        System.out.println(b.getBrand1());
        p.priceDKNY();
        System.out.println(b.getBrand5());
        p.priceBulgari();
        System.out.println(b.getBrand6());
        p.priceHugoBoss();
        o.onlineShop(); //ABSTRACTION
        o.onlineshopp();
        System.out.println("");
        System.out.println("Type of Perfume: " + f.getForWoman());
        b.run1();
        System.out.println(b.getBrand1());
        p.priceDKNY();
        System.out.println(b.getBrand2());
        p.priceCK();
        System.out.println(b.getBrand3());
        p.priceVictoriaSecret();
        System.out.println(b.getBrand4());
        p.priceGivenchy();
        System.out.println(b.getBrand5());
        p.priceBulgari();
        o.onlineShop(); //ABSTRACTION
        o.onlineshopp();
        System.out.println("");

//skincare
        
        //Scanner scan = new Scanner(System.in);
        

        CategorySkincare c = new CategorySkincare("\ncleansing","\nmoisturing","\nserum","\ntoner");
        brandsSkincare y = new brandsSkincare("Safi","Loreal","Simple","Himalaya","Biore");
        System.out.println("Brands skincare type: "+c.toString());

        y.setString("pack 1","pack 2","pack 3","pack 4","pack 5");
        System.out.println("First brand skincare Safi: "+y.getStringOne());
        System.out.println("Second brand skincare Loreal: "+y.getStringTwo());
        System.out.println("Third brand skincare Simple: "+y.getStringThree());
        System.out.println("Fourth brand skincare Himalaya: "+y.getStringFour());
        System.out.println("Fifth brand skincare Biore: "+y.getStringFive());

        System.out.println(y.getTypes());
        System.out.println(y.getUsingSkincare());
        System.out.println(c.getplace());

        String[] brands = new String[5];
        brands [0] = "Safi";
        brands [1] = "Loreal";
        brands [2] = "Himalaya";
        brands [3] = "Simple";
        brands [4] = "Biore";
        System.out.println(Arrays.toString(brands));

        String [] category = new String [5];
        category [0] = "Cleansing";
        category [1] = "Moisturing";
        category [2] = "Serum";
        category [3] = "Toner";
        category [4] = "Place";

        ArrayList brandsList = new ArrayList();
        ArrayList categoryList = new ArrayList();
        ArrayList categoryListPlace = new ArrayList();

        brandsList.add("Safi");
        brandsList.add("Loreal");
        brandsList.add("Himalaya");
        brandsList.add("Simple");
        brandsList.add("Biore");
        System.out.println(brandsList);

        System.out.println("What brands you want to add: ");
        String addBrands = scan.nextLine();
        brandsList.add(2,"Senkai");
        System.out.println("Updated brands: "+brandsList);
        scan.nextLine();

        brandsList.remove("Simple");
        brandsList.remove("Loreal");


        categoryList.add("Cleansing");
        categoryList.add("Moisturing");
        categoryList.add("Serum");
        categoryList.add("Toner");
        categoryList.add("Place");
        System.out.println(categoryList);


        System.out.println("What category you want to add: ");
        String addCategory = scan.nextLine();
        categoryList.add(5, "Masker srub face");

        System.out.println("Updated category: "+categoryList);
        scan.nextLine();

        categoryList.remove("Moisturing");
        categoryListPlace.remove("Farmasi");

        System.out.println("Place to buy skincare: ");
        categoryListPlace.add("Watson");
        categoryListPlace.add("Guardian");
        categoryListPlace.add("Farmasi");
        System.out.println(categoryListPlace);
        
        //spa and salon
        massage m = new massage();
        System.out.println("The Treatment is the best service");
        m.gender();
        System.out.println("\nType of massage treatment.");
        m.type1();
        m.type2();
        m.type3();
        m.type4();
        m.type5();
        m.printspaAndSalon();
        m.run();
        
         System.out.println("\nType of manicure pedicure treatment.");
         manicurePedicure mp = new manicurePedicure();
         mp.type1();
         mp.type2();
         mp.type3();
         mp.type4();
         mp.type5();
         mp.printspaAndSalon();
         mp.run();
         
         System.out.println("\nType of facial treatment.");
         facial x = new facial();
         x.type1();
         x.type2();
         x.type3();
         x.type4();
         x.type5();
         x.printspaAndSalon();
         x.run();
         
         System.out.println("\nType of hair treatment.");
         hair hr = new hair();
         hr.type1();
         hr.type2();
         hr.type3();
         hr.type4();
         hr.type5();
         hr.printspaAndSalon();
         hr.run();



 }


 }
    
    

