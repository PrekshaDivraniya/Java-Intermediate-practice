public class ProcessStudentDetails {


    public String evaluateResult(String name, StudentMarks marks){
        if(marks.internal < 8)
            return name + " failed (internal marks are too low)";
        if(marks.external < 28)
            return name + " failed (external marks are low)";
        if(marks.practical < 12)
            return name + " failed (practical marks are low)";
        if(marks.getTotal() < 64)
            return name + " failed (total marks are low)";

        return "Congratulations " + name + " : You are passed with marks :" + marks.getTotal() + "/120";
    }
}
