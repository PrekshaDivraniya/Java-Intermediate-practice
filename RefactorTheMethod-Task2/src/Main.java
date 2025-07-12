public class Main {
    public static void main(String[] args) {

        //TASK 2: Refactor the Method
        // Refactor goals:
//        Make logic testable
//        Avoid printing directly
//        Improve naming

//        public void processStudent(String name, int marks) {
//            if (marks >= 35) {
//                System.out.println(name + " passed");
//            } else {
//                System.out.println(name + " failed");
//            }
//        }

        ProcessStudentDetails detail = new ProcessStudentDetails();

        StudentMarks marks = new StudentMarks(20,64,28);
        String result = detail.evaluateResult("Preksha", marks);

        System.out.println(result);

    }
}