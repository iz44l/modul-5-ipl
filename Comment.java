public class Comment {
    *--------------------------*11-Oct-2001:Re-organised the

    class and
    moved it to new*
    package com.jrefinery.date

    (DG);*05-Nov-2001:
    Added a

    getDescription() method, and
* eliminated NotableDate class (DG);
* 12-Nov-2001 : IBD requires setDescription() method, now
* that NotableDate class is gone (DG); Changed
* getPreviousDayOfWeek(),
* getFollowingDayOfWeek() and
* getNearestDayOfWeek() to correct bugs (DG);
* 05-Dec-2001 : Fixed bug in SpreadsheetDate class (DG);
* 29-May-2002 : Moved the month constants into a separate
* interface (MonthConstants) (DG);
/**
* Default constructor.
*/
protected AnnualDateRule() { }
/** The day of the month. */
private int dayOfMonth;
/**
* Returns the day of the month.
* @return the day of the month.
*/
public int getDayOfMonth() {
return dayOfMonth;
}
}
