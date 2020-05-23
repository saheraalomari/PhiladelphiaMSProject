
package Model;

/**
 *
 * @author Sahera Al-omari
 */
public class Schedule {

    private String id;
    private String course_code;
    private String lecture_name;
    private String days;
    private String start_time;
    private String end_time;
    private String lecturer_id;
    private String class_room;
    private String section_number;

    public Schedule(String id, String course_code, String lecture_name, String days, String start_time, String end_time, String lecturer_id, String class_room, String section_number) {
        this.id = id;
        this.course_code = course_code;
        this.lecture_name = lecture_name;
        this.days = days;
        this.start_time = start_time;
        this.end_time = end_time;
        this.lecturer_id = lecturer_id;
        this.class_room = class_room;
        this.section_number = section_number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getLecture_name() {
        return lecture_name;
    }

    public void setLecture_name(String lecture_name) {
        this.lecture_name = lecture_name;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getLecturer_id() {
        return lecturer_id;
    }

    public void setLecturer_id(String lecturer_id) {
        this.lecturer_id = lecturer_id;
    }

    public String getClass_room() {
        return class_room;
    }

    public void setClass_room(String class_room) {
        this.class_room = class_room;
    }

    public String getSection_number() {
        return section_number;
    }

    public void setSection_number(String section_number) {
        this.section_number = section_number;
    }
}
