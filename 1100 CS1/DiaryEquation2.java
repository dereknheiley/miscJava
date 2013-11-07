   public class DiaryEquation2 {
      public static void main (String [] args) {
         String[] weeks = {"Jan-6","Jan-13","Jan-20","Jan-27","Feb-3","Feb-10","Feb-17","Feb-24","Mar-2","Mar-9","Mar-16","Mar-23","Mar-30","Apr-6","Apr-13","Apr-20","Apr-27","May-4","May-11","May-18","May-25","Jun-1","Jun-8","Jun-15","Jun-22","Jun-29","Jul-6","Jul-13","Jul-20","Jul-27","Aug-3","Aug-10","Aug-17","Aug-24","Aug-31","Sep-7","Sep-14","Sep-21","Sep-28","Oct-5","Oct-12","Oct-19","Oct-26","Nov-2","Nov-9","Nov-16","Nov-23","Nov-30","Dec-7","Dec-14","Dec-21","Dec-28"};
         System.out.print("=sort(unique(mergeRanges(");
         int i=0;
         for(;i<weeks.length-1;i++)
            System.out.print("unique('"+weeks[i]+"'!C4:C675);");
         System.out.print("unique('"+weeks[i]+"'!C4:C675))))");
      }
   }