package pl.awkwiecin.javaLearning.solutions.homeworkClassAndObject;

import pl.awkwiecin.javaLearning.classAndObject.Invoice;
import pl.awkwiecin.javaLearning.classAndObject.Client;
import pl.awkwiecin.javaLearning.classAndObject.Address;

public class Test {
    public static void main(String[] args) {
//        int x = 1;
//        String s = "";
//        Client client1 = new Client();
//        client1.name = "Andrzej";
//        System.out.println(client1.name);
//        Client client2 = null;
//        System.out.println(client1);
//        System.out.println(client2);
//        if (client2!=null){
//            System.out.println(client2.name);
//        }
        Client clientMichael = new Client();
        clientMichael.setFirstName("Michael");
        clientMichael.setLastName("Forbes");

        Address michaelAddress = new Address("Warszawa","00-001");
//        michaelAddress.setPostCode("00-001");
//        michaelAddress.setPostOffice("Warszawa");

        clientMichael.setAddress(michaelAddress);

        System.out.println(clientMichael.getLastName());
        System.out.println(Client.COMPANY_NAME);
        clientMichael.introduceYourself();
        Invoice invoice1 = new Invoice("korki", 100, 5, "0002883839292", clientMichael);

        System.out.println(invoice1.getBankAccountNumber());
        System.out.println(invoice1.getTotalPrice());
        System.out.println(invoice1.getTaxToPay());

    }
}
