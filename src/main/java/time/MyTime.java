package time;

import com.fasterxml.jackson.databind.deser.std.DateDeserializers;

import java.util.Date;

public class MyTime {
   private Date startDate;
   private Date endDate;


   public void setStartDate(Date date) {
      this.startDate=date;
   }

   public String getDate() {
       return this.startDate.toString();
   }
}
