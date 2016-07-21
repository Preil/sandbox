package com.preil.sandbox.CollectionLearning;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Ilya 19.07.2016.
 */
public class HelpDesk {

    private final Queue<Enquiry> enquiries = new ArrayDeque<>();

    // The method below add enquiry into the collection enquiries
    public void enquire(Customer customer, Category category) {
        //the method receive customer and category objects, creates new object
        //Enquiry and add it into collection
        enquiries.offer(new Enquiry(customer, category));
    }

    public void processPrinterEnquiry() {
        // to take objects from collection without removing it we should use - peek() method
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && enquiry.getCategory() == Category.PRINTER) {
            enquiry.getCustomer().reply("Is it out of paper?");
            enquiries.remove();
        } else {
            System.out.println("No work to do, let's have some coffee");
        }

    }

    public void processGeneralEnquiry() {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && enquiry.getCategory() != Category.PRINTER) {
            enquiry.getCustomer().reply("Have you tried turning it off and on again?");
            enquiries.remove();
        } else {
            System.out.println("No work to do, let's have some coffee");
        }
    }


    public void processAllEnquireis() {

        // The same thing using method poll(), poll() also removing
        Enquiry enquiry1;
        while ((enquiry1 = enquiries.poll()) != null) {
            enquiry1.getCustomer().reply("Have you tried to turn it off and on again?");
        }
        System.out.println(enquiries.size());

        // this method get enquiries from collection one-by-one and
        while (!enquiries.isEmpty()) { //while collection is not empty
            final Enquiry enquiry = enquiries.remove();
            // creates new Enquiry object, take Enqiury object from collection and assign it to new Enquiry object
            enquiry.getCustomer().reply("Have you tried to turn it off and on again?");
        }
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();
        helpDesk.enquire(Customer.Jack, Category.PHONE);
        helpDesk.enquire(Customer.Jill, Category.PRINTER);

        //helpDesk.processAllEnquireis(); // At the end we call method that process all enquiries
        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
        helpDesk.processPrinterEnquiry();
    }

}
