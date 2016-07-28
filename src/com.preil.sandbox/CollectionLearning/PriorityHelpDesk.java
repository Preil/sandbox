package com.preil.sandbox.CollectionLearning;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Ilya 21.07.2016.
 */
public class PriorityHelpDesk {
    private static final Comparator<Enquiry> BY_CATEGORY = new Comparator<Enquiry>() {
        @Override
        public int compare(Enquiry o1, Enquiry o2) {
            return o1.getCategory().compareTo(o2.getCategory());
        }
    };
    private final Queue<Enquiry> enquiries = new PriorityQueue<>(BY_CATEGORY);

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
        Enquiry enquiry;
        while (!enquiries.isEmpty()) { //while collection is not empty
            enquiry = enquiries.poll();
            // creates new Enquiry object, take Enqiury object from collection and assign it to new Enquiry object
            enquiry.getCustomer().reply("Have you tried to turn it off and on again?");
        }
    }

    public static void main(String[] args) {
        PriorityHelpDesk helpDesk = new PriorityHelpDesk();
        helpDesk.enquire(Customer.Jack, Category.PHONE);
        helpDesk.enquire(Customer.Jill, Category.PRINTER);
        helpDesk.enquire(Customer.Marry, Category.COMPUTER);


        helpDesk.processAllEnquireis(); // At the end we call method that process all enquiries
//        helpDesk.processPrinterEnquiry();
//        helpDesk.processGeneralEnquiry();
//        helpDesk.processPrinterEnquiry();
    }

}
