package com.origamisoftware.teach.agile.junit;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Date;

/**
 * A simple Date Range Class
 *
 * @author Spencer A Marks
 */
public class SubscriptionPeriod {

    private Date startDate;
    private Date endDate;

    /**
     * Creates a  SubscriptionPeriod instance
     *
     * @param startDate the starting date of the subscription period
     * @param endDate   the end date of the subscription period
     */
    public SubscriptionPeriod(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * @return  the start date of the subscription
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @return the the end date of the subscription
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @return the total Days in the subscription
     */
    public int getTotalDays() {
        // added to calculate totalofDays
        return (int) ((endDate.getTime() - startDate.getTime()) /
                (1000 * 60 * 60 * 24));

    }

    /**
     * @return the total months on the subscription
     */
    public int getTotalMonths() {
        // This is implemented
        int startMonth = startDate.getYear() * 12 + startDate.getMonth();
        int endMonth = endDate.getYear() * 12 + endDate.getMonth();

        return endMonth - startMonth;

    }

    /**
     * Given a date return true if the date comes after the expiration date of this
     * subscription period or false otherwise.
     *
     * @param date a date to consider
     * @return true if the date comes after the expiration date of this
     * subscription period or false otherwise.
     */
    public boolean hasExpired(Date date) {
        // This is implemented
        //throw new NotImplementedException();
        if(date.compareTo(endDate) > 0)
            return true;
        return false;


    }

}
