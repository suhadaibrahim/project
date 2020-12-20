package assignmentspaandsalon;

public class AssignmentSpaAndSalon {

        String massage;
        String manicurePedicure;
        String hair;
        String facial;
    
   
        
        
        public AssignmentSpaAndSalon(String massage, String manicurePedicure, String hair, String facial){
            this.massage = massage;
            this.manicurePedicure = manicurePedicure;
            this.hair = hair;
            this.facial = facial;
        }

  
        public void getmassage(String massage){
            this.massage = massage;
        }
        
        public void getmanicurePedicure(String manicurePedicure){
            this.manicurePedicure = manicurePedicure;
        }
        public void gethair(String hair){
            this.hair = hair;
        }
        public void getfacial(String facial){
            this.facial = facial;
        }
        public String getmassage(){
            return massage;
        }
        public String getmanicurePedicure(){
            return manicurePedicure;
        }
        public String gethair(){
            return hair;
        }
        public String getfacial(){
            return facial;
        }
        @Override
        public String toString(){
            return massage + manicurePedicure + hair + facial;
        }
    }

