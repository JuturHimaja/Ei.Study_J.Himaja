package factory;

public class CourseFactory {
    public static Course getCourse(String type) {
        if (type.equalsIgnoreCase("online")) {
            return new OnlineCourse();
        } else if (type.equalsIgnoreCase("offline")) {
            return new OfflineCourse();
        }
        return null;
    }
}
