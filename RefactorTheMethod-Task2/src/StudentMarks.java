public class StudentMarks {
    int practical;
    int internal;
    int external;

    public StudentMarks(int internal, int external, int practical){
        this.internal = internal;
        this.external = external;
        this.practical = practical;
    }

    public int getTotal(){
        return internal + external + practical;
    }
}
