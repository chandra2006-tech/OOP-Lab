class AdmissionSystem {
    
    String name;
    double percentage;
    
    AdmissionSystem(String name, double percentage) {
    
    }
}

class UG_AdmissionSystem extends AdmissionSystem {
    
    UG_AdmissionSystem(String name, double percentage) {
        super(name, percentage);
        if(percentage >= 60) {
            System.out.println(name + " is eligibe for UG Admission!");
        }
            
        else {
            System.out.println(name + " is not eligibe for UG Admission!");
        }
    }
}

class PG_AdmissionSystem extends AdmissionSystem {
    
    PG_AdmissionSystem(String name, double percentage) {
        super(name, percentage);
        if(percentage >= 70) {
            System.out.println(name + " is eligibe for PG Admission!");
        }
            
        else {
            System.out.println(name + " is not eligibe for PG Admission!");
        }
    }
}

class Main {
    
    public static void main(String[] args) {
        
        UG_AdmissionSystem chandra1 = new UG_AdmissionSystem("chandra", 65);
        UG_AdmissionSystem chandra2 = new UG_AdmissionSystem("proona", 45);
        PG_AdmissionSystem chandra3 = new PG_AdmissionSystem("tej", 75);
        PG_AdmissionSystem chandra4 = new PG_AdmissionSystem("bhanu", 65);
        
        
        
    }
}