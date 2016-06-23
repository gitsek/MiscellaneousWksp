package workoutPkg;

/**
* ClassNotFoundExceptionSimulator
* @author Pierre-Hugues Charbonneau
*
*/
public class ClassNotFoundExceptionSimulator {

      private static final String CLASS_TO_LOAD = "org.ph.javaee.training5.ClassA";
      private static final int PROBLEM_SCENARIO = 2;

      /**
       * @param args
       */
      public static void main(String[] args) {

            System.out.println("java.lang.ClassNotFoundException Simulator - Training 5");
            System.out.println("Author: Pierre-Hugues Charbonneau");
            System.out.println("http://javaeesupportpatterns.blogspot.com");

            switch(PROBLEM_SCENARIO) {

                   // Scenario #1 - Class.forName()
                   case 1:

                          System.out.println("\n** Problem scenario #1: Class.forName() **\n");
                          try {
                                Class<?> newClass = Class.forName(CLASS_TO_LOAD);

                                System.out.println("Class "+newClass+" found successfully!");

                          } catch (ClassNotFoundException ex) {

                                ex.printStackTrace();

                                System.out.println("Class "+CLASS_TO_LOAD+" not found!");

                          } catch (Throwable any) {                           
                                System.out.println("Unexpected error! "+any);
                          }

                          break;

                   // Scenario #2 - ClassLoader.loadClass()
                   case 2:

                          System.out.println("\n** Problem scenario #2: ClassLoader.loadClass() **\n");                     
                          try {
                                ClassLoader classLoader = Thread.currentThread().getContextClassLoader();            
                                Class<?> callerClass = classLoader.loadClass(CLASS_TO_LOAD);

                                Object newClassAInstance = callerClass.newInstance();

                                System.out.println("SUCCESS!: "+newClassAInstance);
                          } catch (ClassNotFoundException ex) {

                                ex.printStackTrace();

                                System.out.println("Class "+CLASS_TO_LOAD+" not found!");

                          } catch (Throwable any) {                           
                                System.out.println("Unexpected error! "+any);
                          }

                          break;
            }

            System.out.println("\nSimulator done!");
      }
}