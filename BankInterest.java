class Bank {
    double getRateOfInterest() {
        return 0.0;
    }
}

class SBI extends Bank {
    @Override
    double getRateOfInterest() {
        return 7.5;
    }
}

class ICICI extends Bank {
    @Override
    double getRateOfInterest() {
        return 8.0;
    }
}

class HDFC extends Bank {
    @Override
    double getRateOfInterest() {
        return 8.5;
    }
}

public class BankInterest {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank hdfc = new HDFC();

        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: " + icici.getRateOfInterest());
        System.out.println("HDFC Rate of Interest: " + hdfc.getRateOfInterest());
    }
}
