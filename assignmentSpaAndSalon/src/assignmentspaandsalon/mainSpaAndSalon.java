package assignmentspaandsalon;

public class mainSpaAndSalon {
    public static void main(String[]args){
        AssignmentSpaAndSalon t = new AssignmentSpaAndSalon("massage","\nmanicure pedicure","\nhair","\nfacial");
        treatment tp = new treatment("pack 1","pack 2","pack 3","pack 4","pack 5");
        System.out.println("Treatment type: "+t.toString());
        
        tp.setString("pack 1","pack 2","pack 3","pack 4","pack 5");
        System.out.println("first package: "+tp.getStringOne());
        System.out.println("second package: "+tp.getStringTwo());
        System.out.println("third package: "+tp.getStringThree());
        System.out.println("fourth package: "+tp.getStringFour());
        System.out.println("fifth package: "+tp.getStringFive());
    }
}
